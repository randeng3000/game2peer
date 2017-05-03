package game2peer.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcForward {

	@RequestMapping("/")
	public String forwardToRoot()
	{
		return "forward:/pages/g/index.shtml";
	}
}
