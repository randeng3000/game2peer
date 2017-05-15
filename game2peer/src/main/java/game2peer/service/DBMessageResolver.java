package game2peer.service;

import org.thymeleaf.Arguments;
import org.thymeleaf.messageresolver.IMessageResolver;
import org.thymeleaf.messageresolver.MessageResolution;

public class DBMessageResolver implements IMessageResolver {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}

	@Override
	public Integer getOrder() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public MessageResolution resolveMessage(Arguments arguments, String key, Object[] messageParameters) {
		// TODO Auto-generated method stub
		return null;
	}

}
