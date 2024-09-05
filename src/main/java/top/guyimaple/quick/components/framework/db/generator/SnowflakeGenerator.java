package top.guyimaple.quick.components.framework.db.generator;

import org.hibernate.annotations.IdGeneratorType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author guyi
 * @date 2024/9/4
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@IdGeneratorType(value = SnowflakeIdentityGenerator.class)
public @interface SnowflakeGenerator {
}
