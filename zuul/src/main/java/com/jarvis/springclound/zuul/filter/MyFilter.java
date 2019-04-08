package com.jarvis.springclound.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 自定义过滤器
 * */
@Component
public class MyFilter extends ZuulFilter {
    private static final Logger logger = LoggerFactory.getLogger(MyFilter.class);
    /**
     * filterType返回一个字符串代表过滤器的类型：
     * pre：路由之前
     * routing：路由之时
     * post：路由之后
     * error：发送错误调用
     * */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤的顺序
     * */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否应该过滤
     * true为是，false为否
     * */
    @Override
    public boolean shouldFilter() {
        //永远返回是
        return true;
    }

    /**
     * 具体逻辑
     * */
    @Override
    public Object run() throws ZuulException {
        //获取request上下文
        RequestContext cxt = RequestContext.getCurrentContext();
        //获取httpRequest
        HttpServletRequest request = cxt.getRequest();
        logger.info("{}>>>{}", request.getMethod(), request.getRequestURL().toString());
        Object actionToken =  request.getParameter("token");
        if(actionToken == null){
            logger.warn("token is empty");
            //不设置返回
            cxt.setSendZuulResponse(false);
            cxt.setResponseStatusCode(401);
            try {
                cxt.getResponse().getWriter().write("token is empty");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        logger.info("ok");
        return null;
    }
}
