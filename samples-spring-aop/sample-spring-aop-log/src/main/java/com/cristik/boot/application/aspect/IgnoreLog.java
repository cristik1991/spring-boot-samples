package com.cristik.boot.application.aspect;

import java.lang.annotation.*;

/**
 * will not print log by aop
 *
 * @author cristik
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreLog {
}
