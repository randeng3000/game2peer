package game2peer.busibean.api;

import java.io.File;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import game2peer.manager.AccessRight;
import game2peer.manager.GlobalValueManager;
import game2peer.manager.UserManager;
import game2peer.mvc.bean.ApiBean;
import game2peer.mybatis.domain.BusiUserGallery;
import game2peer.mybatis.domain.User;
import game2peer.utility.StringUtility;

@Service
public class UploadImageFileProcessor implements ApiBean {
	@Autowired
	private UserManager userManager;
	
	@Autowired
	GlobalValueManager globalValueManager;	

	@Autowired
	private MessageSource messageSource;
	
	@Override
	public Object requestProcess(HttpServletRequest request, HttpServletResponse response, String id, User user,
			AccessRight ar) throws Exception {
		// TODO Auto-generated method stub
		ImageFileUploadResponseBean b = new ImageFileUploadResponseBean();
		if (user == null)
		{
			b.setError(messageSource.getMessage("请先登录", null, "请先登录", request.getLocale()));
			return b;
		}
		Part p = request.getPart("imgfile");
		long n = System.currentTimeMillis() - 24*60*60*1000l;
		String url = "/assert" + globalValueManager.getValue("imgfile_dir") + "/users/" + n + "/";
		String realPath = request.getSession().getServletContext().getRealPath(url);
		
		File f = getFile(realPath, p.getContentType());
		FileUtils.copyInputStreamToFile(p.getInputStream(), f);
		BusiUserGallery g = new BusiUserGallery();
		g.setUserId(user.getId());
		g.setCreateTime(new Date());
		g.setFilePath(url + f.getName());
		g.setFileInfo(f.getName());
		this.userManager.saveImageFileInfo(g);
		b.setError(null);
		b.setImgUrl(g.getFilePath());
		return b;
	}
	
	private File getFile(String dir, String contentType)
	{
		String f = dir + StringUtility.generateUuid();
		if (contentType != null)
		  f += "." + contentType;	
		return new File(f);
	}

}

class ImageFileUploadResponseBean
{
	private String imgUrl;
	private String error;
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
}
