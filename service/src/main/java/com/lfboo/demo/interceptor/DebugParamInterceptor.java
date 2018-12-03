package com.lfboo.demo.interceptor;

import com.alibaba.fastjson.JSON;
import com.lfboo.demo.annotation.DebugParam;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class DebugParamInterceptor implements MethodInterceptor {
    private static final Logger LOGGER = LoggerFactory.getLogger(DebugParamInterceptor.class);


    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Method method = methodInvocation.getMethod();
        DebugParam debugParam = AnnotationUtils.findAnnotation(method, DebugParam.class);

        Object res = null;
        if (null != debugParam) {
            LOGGER.info("========================================");
            LOGGER.info("{} params:{}", method.getName(), JSON.toJSONString(methodInvocation.getArguments()));
            res = methodInvocation.proceed();
            LOGGER.info("========================================");
            LOGGER.info("{} result:{}", method.getName(), JSON.toJSONString(res));
        }

        return null == res ? methodInvocation.proceed() : res;
    }
}
