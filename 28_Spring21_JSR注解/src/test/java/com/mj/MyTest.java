package com.mj;

import com.mj.cfg.AppConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(ctx.getBean("person"));
    }
}
