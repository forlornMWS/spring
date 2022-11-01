package xyz.mwszksnmdys.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @className: AopConfig
 * @author: MWS
 * @date: 2022/9/19 下午4:36
 * @description: Todo
 */
@Configuration
@ComponentScan(basePackages = {"xyz.mwszksnmdys"})
@EnableAspectJAutoProxy
public class AopConfig {

}
