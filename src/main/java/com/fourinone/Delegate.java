package com.fourinone;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Delegate {
    String interfaceName();

    String methodName();

    DelegatePolicy policy();

    int paramNum() default 0;
}