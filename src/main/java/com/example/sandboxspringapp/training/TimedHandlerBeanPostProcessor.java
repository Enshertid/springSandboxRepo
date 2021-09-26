package com.example.sandboxspringapp.training;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class TimedHandlerBeanPostProcessor implements BeanPostProcessor {
    Map<String, Class<?>> map = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanClass = bean.getClass();

        Annotation annotation = beanClass.getAnnotation(Timed.class);
        if (annotation != null) {
            System.out.println("bean with name " + beanName + " has been put into map in BPP");
            map.put(beanName, beanClass);
            System.out.println();
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (map.containsKey(beanName)) {
            System.out.println("bean with name " + beanName + " contains into map in BPP");
        }
        System.out.println("BPP AfterInit");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
