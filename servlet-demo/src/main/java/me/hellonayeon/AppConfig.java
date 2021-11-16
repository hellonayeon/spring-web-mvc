package me.hellonayeon;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
// 기본으로는 모든 @Component 를 Bean 으로 등록
// AppConfig = Root WebApplicationContext(Servlet WebApplicationContext's parent)
@ComponentScan(excludeFilters = @ComponentScan.Filter(Controller.class))
public class AppConfig {
}
