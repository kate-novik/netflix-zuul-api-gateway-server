package com.novik.microservices.netflixzuulapigatewayserver;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.log4j.Log4j2;

/**
 * ZuulLoggingFilter.
 * @author Kate Novik
 */
@Log4j2
@Component
public class ZuulLoggingFilter extends ZuulFilter {

  @Override
  public String filterType() {
    //execute filter before every request ("pre"). For after request - "post", after error - "error".
    return "pre";
  }

  @Override
  public int filterOrder() {
    //Filter order. 1 - first order.
    return 1;
  }

  @Override
  public boolean shouldFilter() {
    //Is it necessary to execute such filter?
    return true;
  }

  @Override
  public Object run() throws ZuulException {
    HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
    log.info("request -> {}, request uri -> {}", request, request.getRequestURI());
    return null;
  }
}
