package org.example.Week10.Labs.Examples;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RunImmediately {
    int times() default 1; // default 1 znaci da ako nismo u klasi proslijedili times parametar default ce biti 1
}
