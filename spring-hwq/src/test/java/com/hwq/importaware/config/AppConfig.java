package com.hwq.importaware.config;

import com.hwq.importaware.aware.EnableMyDb;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.hwq.importaware")
@EnableMyDb(userName = "hwq")  //加上@EnableMyDb 就表示我们要启用自己的Db组件，并且从注解的参数将值传递
public class AppConfig {
}
