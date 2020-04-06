package com.myself.mybatis;

import java.lang.annotation.*;

/**
 * @author RockerBaozi
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Table {
    String value();
}
