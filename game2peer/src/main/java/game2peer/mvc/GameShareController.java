package game2peer.mvc;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import game2peer.manager.QRManager;
import game2peer.manager.UserManager;
import game2peer.mybatis.domain.User;

@Controller
public class GameShareController {
    
	static private String fixedUrl = null;
	@Autowired
	private UserManager userManager;
	
	@Autowired
	private QRManager qrManager;
	
	@RequestMapping("/gameshare/QR/{gamecode}")
	public void shareQR(HttpServletRequest request, HttpServletResponse response, @PathVariable String gamecode)
	{
		Object p = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (p instanceof UserDetails)
		{
			StringBuffer buffer = new StringBuffer();
			if (fixedUrl == null)
			{
				StringBuffer s = request.getRequestURL();
				int i = s.indexOf(request.getRequestURI());
				if (i > 0)
					fixedUrl = s.substring(0, i);	
				else
				    fixedUrl = s.toString();
				fixedUrl += "/games/";
			}	
			buffer.append(fixedUrl);
			buffer.append(gamecode);
			buffer.append("/");
			UserDetails userDetails = (UserDetails) p;
			String un = userDetails.getUsername();
			User user = this.userManager.getUser(un);
			buffer.append(user.getId());
			ServletOutputStream stream = null;  
	        try {
				stream = response.getOutputStream();
				qrManager.writeToStream(buffer.toString(), stream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
