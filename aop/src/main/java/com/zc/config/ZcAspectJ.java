package com.zc.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/10/7 18:38
 **/

@Component
@Aspect
public class ZcAspectJ {

    /**
     *   切入点
     */

    @Pointcut("execution(* com.zc.dao.*.*(Integer,..))")
    public void pointCutExecution(){

    }

    @Pointcut("within(com.zc.dao.*.*)")
    public void pointCutWithin(){

    }

    @Pointcut("args(Integer)")
    public void pointCutArgs(){

    }

    @Pointcut("@annotation(com.zc.anno.zc)")
    public void pointCutAnnotation(){

    }

    @Pointcut("this(com.zc.dao.IndexDaoImpl)")
    public void pointCutThis(){

    }

    @Pointcut("target(com.zc.dao.IndexDaoImpl)")
    public void pointCutTarget(){

    }

    @Before("pointCutTarget()")
    public void before(){
        System.out.println("before");
    }


}
  
  
   