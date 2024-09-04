package top.guyimaple.quick.components.service;

import top.guyimaple.quick.components.service.db.QuickRepository;
import top.guyimaple.quick.components.service.db.entity.QuickEntity;

/**
 * @author guyi
 * @date 2024/9/4
 */
public interface QuickService<T extends QuickEntity> {

    QuickRepository<T> getRepository();

}
