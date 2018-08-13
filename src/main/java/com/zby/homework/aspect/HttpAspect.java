package com.zby.homework.aspect;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class HttpAspect  {
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.zby.homework.Controller.personController.*(..))")
    public void log(){
    }

    @Before("log()")
    public void logBefore(){
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("URL={}",request.getRequestURL());
    }

    @After("log()")
    public void logAfter(){
       logger.info("hhhh end");
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void afterRetruning(Object object){
        logger.info(object.toString());
    }
}
