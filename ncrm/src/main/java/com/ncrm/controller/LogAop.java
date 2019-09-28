package com.ncrm.controller;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.annotation.BussinessLog;

@Aspect
@Component
public class LogAop {
	private static Logger log = Logger.getLogger(LogAop.class); 
		
	
	
	@Pointcut(value = "@annotation(com.annotation.BussinessLog)")
	public void cutService(){
		
	}
	
	
	@Around("cutService()")
	public Object recordSysLog(ProceedingJoinPoint point) throws Throwable {
		Object result = point.proceed();
		this.handle(point);
		return result;
	}
	
	@SuppressWarnings("unused")
	protected void handle(ProceedingJoinPoint point) throws Exception {
		
		//获取拦截的方法名 
        Signature sig = point.getSignature();
        
		Object[] args = point.getArgs();
        MethodSignature msig = null;
        if (!(sig instanceof MethodSignature)) {
            throw new IllegalArgumentException("该注解只能用于方法");
        }
        msig = (MethodSignature) sig;
        Object target = point.getTarget();
        Method currentMethod = target.getClass().getMethod(msig.getName(), msig.getParameterTypes());
        String methodName = currentMethod.getName();
        System.out.println("->" + methodName);
        
        BussinessLog annotation = currentMethod.getAnnotation(BussinessLog.class);
        String bussinessName = annotation.value();
        String key = annotation.key();
        
		
	}
}
