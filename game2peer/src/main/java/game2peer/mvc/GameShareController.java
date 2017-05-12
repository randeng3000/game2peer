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

import game2peer.manager.GameManager;
import game2peer.manager.GlobalValueManager;
import game2peer.manager.QRManager;
import game2peer.manager.UserManager;
import game2peer.mybatis.domain.BusiGame;
import game2peer.mybatis.domain.User;
import game2peer.utility.StringUtility;

@Controller
public class GameShareController {
	@Autowired
	private GameManager gameManager;

	@Autowired
	private UserManager userManager;

	@Autowired
	private QRManager qrManager;

	@Autowired
	private GlobalValueManager globalValueManager;

	@RequestMapping("/gameshare/QR/{gamecode}")
	public void shareQR(HttpServletRequest request, HttpServletResponse response, @PathVariable String gamecode) {
		Object p = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (p instanceof UserDetails) {
			StringBuffer buffer = new StringBuffer();
			BusiGame game = this.gameManager.getGameById(gamecode);
			if (game != null) {
                String domain = game.getRegisterWithDomain();
                if (StringUtility.hasEmpty(domain))
                	domain = globalValueManager.getValue("global.prefix");
                
				buffer.append(domain);
				buffer.append("/games/");
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
}
