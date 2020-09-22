package com.hwq.imports.importSelect;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(SelectProxy.class)
public @interface EnableProxy {
}
