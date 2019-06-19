package org.exchange.server.netflixzuulpigateway;

import javax.servlet.http.HttpServletRequest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
@Component
public class ZuulLoggingFilter extends ZuulFilter {

	Logger log=LoggerFactory.getLogger(ZuulLoggingFilter.class);
	@Override
	public Object run() throws ZuulException {
		HttpServletRequest request=RequestContext.getCurrentContext().getRequest();
		log.info("request h zuul ki"+request);
		
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

}
