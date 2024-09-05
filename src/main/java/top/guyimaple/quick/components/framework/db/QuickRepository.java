package top.guyimaple.quick.components.framework.db;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import top.guyimaple.quick.components.framework.db.entity.QuickEntity;

/**
 * @author guyi
 * @date 2024/9/4
 */
public interface QuickRepository<T extends QuickEntity> extends JpaRepositoryImplementation<T,Long>, JpaSpecificationExecutor<T> {
}
