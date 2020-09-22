package com.hwq.imports.config;

import com.hwq.imports.importSelect.EnableProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.hwq.imports.service")
@EnableProxy //加上这个注解EmailService就会被代理
public class ImportConfig {
}
