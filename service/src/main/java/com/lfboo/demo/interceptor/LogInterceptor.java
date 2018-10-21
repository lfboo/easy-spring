package com.lfboo.demo.interceptor;

import com.alibaba.fastjson.JSON;
import com.lfboo.demo.annotation.NeedLog;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by on 2018/10/21.
 *
 * @author lfb
 */
@Component
public class LogInterceptor implements MethodInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogInterceptor.class);

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Method method = methodInvocation.getMethod();
        NeedLog needLog = AnnotationUtils.findAnnotation(method, NeedLog.class);

        Object obj = null;
        if (null != needLog) {
            LOGGER.info("step into method: {}", method.getName());
            obj = methodInvocation.proceed();
            LOGGER.info("result:{}", JSON.toJSONString(obj));
        }

        return null == obj ? methodInvocation.proceed() : obj;
    }
}
