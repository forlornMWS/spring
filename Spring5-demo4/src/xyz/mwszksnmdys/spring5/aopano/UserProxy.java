package xyz.mwszksnmdys.spring5.aopano;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.junit.jupiter.api.Order;
import org.springframework.stereotype.Component;

/**
 * @className: UserProxy
 * @author: MWS
 * @date: 2022/9/19 下午3:15
 * @description: Todo
 */
@Component
@Aspect  // 生成代理对象
//@Order(d)  // 设置多个类的优先级，d越小，优先级越高。
public class UserProxy {
    //相同切入点抽取
    @Pointcut(value = "execution(* xyz.mwszksnmdys.spring5.aopano.User.add(..))")
    public void pointcut(){}


    //前置通知
    @Before(value = "pointcut()")
    public void before() {
        System.out.println("before...");
    }

    // 最终通知
    @After(value = "execution(* xyz.mwszksnmdys.spring5.aopano.User.add(..))")
    public void after() {
        System.out.println("after...");
    }

    // 后置通知（返回通知）
    @AfterReturning(value = "execution(* xyz.mwszksnmdys.spring5.aopano.User.add(..))")
    public void afterReturning() {
        System.out.println("after returning...");
    }

    // 异常通知
    @AfterThrowing(value = "execution(* xyz.mwszksnmdys.spring5.aopano.User.add(..))")
    public void afterThrowing() {
        System.out.println("after throwing...");
    }

    // 环绕通知
    @Around(value = "execution(* xyz.mwszksnmdys.spring5.aopano.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕后");
    }
}
