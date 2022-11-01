package xyz.mwszksnmdys.spring5.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Factory;
import xyz.mwszksnmdys.spring5.collectionType.Course;

/**
 * @className: MyBean
 * @author: MWS
 * @date: 2022/9/19 上午8:46
 * @description: FactoryBean定义类型根返回类型可以不同
 */
public class MyBean implements FactoryBean<Course>{
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }

    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("Harry Potter");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
