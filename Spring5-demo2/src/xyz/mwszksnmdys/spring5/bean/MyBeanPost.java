package xyz.mwszksnmdys.spring5.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @className: MyBeanPost
 * @author: MWS
 * @date: 2022/9/19 上午9:46
 * @description: Todo
 */
public class MyBeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在初始化前执行postProcessBeforeInitialization()方法");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在初始化之后执行postProcessAfterInitialization()方法");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
