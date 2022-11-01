package xyz.mwszksnmdys.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @className: SpringConfig
 * @author: MWS
 * @date: 2022/9/19 上午11:27
 * @description: Todo
 */
@Configuration //作为配置类，替代xml文件
@ComponentScan(basePackages = {"xyz.mwszksnmdys.spring5"})
public class SpringConfig {

}
