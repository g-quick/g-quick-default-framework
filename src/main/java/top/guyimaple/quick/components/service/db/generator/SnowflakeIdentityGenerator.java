package top.guyimaple.quick.components.service.db.generator;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

/**
 * @author guyi
 * @date 2024/9/4
 */
public class SnowflakeIdentityGenerator implements IdentifierGenerator {

    private final cn.hutool.core.lang.generator.SnowflakeGenerator generator = new cn.hutool.core.lang.generator.SnowflakeGenerator();

    @Override
    public Object generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) {
        return generator.next();
    }

}
