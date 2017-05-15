package game2peer.busibean;

import java.io.File;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import game2peer.manager.AccessRight;
import game2peer.manager.GlobalValueManager;
import game2peer.manager.UserManager;
import game2peer.mvc.bean.PageBean;
import game2peer.mybatis.domain.BusiUserGallery;
import game2peer.mybatis.domain.User;
import game2peer.utility.StringUtility;

@Service
public class UploadImageBean implements PageBean {
	@Autowired
	private UserManager userManager;
	
	@Autowired
	GlobalValueManager globalValueManager;	

	@Autowired
	private MessageSource messageSource;
	
	@Override
	public void requestProcess(HttpServletRequest request, HttpServletResponse response, String id, Model model,
			User user, AccessRight ar) throws Exception {
		// TODO Auto-generated method stub
		if (user == null)
		{
			model.addAttribute("errorMessage", "请先<a href='/login'>登录</a>");
			return;
		}
		if (!(request instanceof org.springframework.web.multipart.MultipartHttpServletRequest))
			return;
		
		MultipartFile p = ((org.springframework.web.multipart.MultipartHttpServletRequest) request).getFile("imgfile");
		if (p == null)
		    return;	
		long n = System.currentTimeMillis() - 24*60*60*1000l;
		String url = "/assets/" + globalValueManager.getValue("imgfile_dir") + "/users/" + n + "/";
		String realPath = request.getSession().getServletContext().getRealPath(url);

		File f = getFile(realPath, p.getContentType());
		FileUtils.copyInputStreamToFile(p.getInputStream(), f);
		BusiUserGallery g = new BusiUserGallery();
		g.setUserId(user.getId());
		g.setCreateTime(new Date());
		g.setFilePath(url + f.getName());
		g.setFileInfo(p.getOriginalFilename());
		this.userManager.saveImageFileInfo(g);
        model.addAttribute("games", null);
	}

	private File getFile(String dir, String contentType)
	{
		String f = dir + StringUtility.generateUuid();
 	    f += getContentType(contentType);
		return new File(f);
	}
	
	private String getContentType(String contentType)
	{
		if (contentType != null)
		{
			return "." + contentType.substring(contentType.lastIndexOf("image/")==0? 6:0);
		}
		return "";
	}
}
