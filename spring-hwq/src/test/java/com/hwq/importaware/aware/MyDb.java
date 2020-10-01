package com.hwq.importaware.aware;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import java.util.Map;
import java.util.Optional;

/**
 * ImportAware 有一个方法可以获取所有的注解，因此可以通过实现该接口来获取注解的信息，这样就可以根据注解信息做相应的事情了。
 * 测试了下，好像这里一定要用@Configuration, 如果换成 @Component ,setImportMetadata这个方法就没调用
 */
@Configuration
public class MyDb implements ImportAware {

	String userName=null;

	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {
		MultiValueMap<String, Object> allAnnotationAttributes = importMetadata.getAllAnnotationAttributes(EnableMyDb.class.getName());
		Optional.ofNullable(allAnnotationAttributes)
				.ifPresent(x->{
					Map<String, Object> stringObjectMap = allAnnotationAttributes.toSingleValueMap();
					String userName = (String)stringObjectMap.get("userName");
					this.userName = userName;
					System.out.println("需要使用MyDb组件，所以初始化userName："+userName);
				});
	}
}
