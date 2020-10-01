package com.hwq.importaware.aware;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Import(MyDb.class) //这里的@Import 表示如果在其他地方使用了@EnableMyDb 这个注解，则spring就会导入 MyDb.class
public @interface EnableMyDb {
	String userName() default "root";
}
