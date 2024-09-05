package top.guyimaple.quick.components.framework.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author guyi
 * @date 2024/9/5
 */
@Slf4j
@ControllerAdvice
public class QuickExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public QuickResponse<Object> onException(Exception e) {
        log.error(e.getMessage(), e);
        return QuickResponse.fail(e.getMessage());
    }

}
