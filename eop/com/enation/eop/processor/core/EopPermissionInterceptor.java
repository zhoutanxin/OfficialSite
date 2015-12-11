package com.enation.eop.processor.core;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.enation.eop.sdk.context.EopContext;

/**
 * eop权限拦截器
 * @author kingapex
 * 2010-10-23下午11:55:03
 */
public class EopPermissionInterceptor extends HandlerInterceptorAdapter{

	public void destroy() {
	}

	public void init() {
	}


	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		Integer userid  = EopContext.getContext().getCurrentSite().getUserid();
		
		if(userid.intValue() !=1){
			request.getRequestDispatcher("/error").forward(request, response); 
			return false;
		}
		
		return true;
	}

}
