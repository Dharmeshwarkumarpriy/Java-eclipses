package springmvcsearch;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor implements HandlerInterceptor{

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
	System.out.println("this is prehandler...");
	
	String name=request.getParameter("user");
	if(name.startsWith("d")) {
		
		response.setContentType("text/html");
		response.getWriter().println("invalid name ...Name should not starts with d");
		return false;
	}
	return true;
	}

//	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
//			ModelAndView modelAndView) throws Exception {
//		System.out.println("this is post handler");
//		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
//	}
//
//	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
//			throws Exception {
//		System.out.println("this is after completion method...");
//		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
//	}

	
	
	
}
