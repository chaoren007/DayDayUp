package annotation;

import java.lang.annotation.*;

/**
 * Description：自定义注解@MyAutoWired实现自动注入
 * Author：liquorSea
 * Date： 2018-06-16 20:33
 * Remark：
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAutowired {
    String value() default "";
}

