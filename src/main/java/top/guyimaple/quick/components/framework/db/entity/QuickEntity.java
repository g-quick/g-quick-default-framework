package top.guyimaple.quick.components.framework.db.entity;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import top.guyimaple.quick.components.framework.db.generator.SnowflakeGenerator;

/**
 * @author guyi
 * @date 2024/9/4
 */
@Data
@MappedSuperclass
public class QuickEntity {

    @Id
    @SnowflakeGenerator
    private Long id;

    @CreatedDate
    private Long createTime;

    @LastModifiedDate
    private Long updateTime;

}
