package game2peer.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

public class CustomAccessDeniedHandler implements AccessDeniedHandler {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		PathMatcher matcher = new AntPathMatcher();
		// TODO Auto-generated method stub
		
        if (request.getRequestURI().contains("/paymentCallback"))
        {
        	RequestDispatcher dispatcher = request.getRequestDispatcher("/paymentCallback");  
            dispatcher.forward(request, response);
        	return;
        }
	}

}
