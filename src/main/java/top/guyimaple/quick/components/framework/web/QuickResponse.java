package top.guyimaple.quick.components.framework.web;

import lombok.Getter;

/**
 * @author guyi
 * @date 2024/9/5
 */
@Getter
public class QuickResponse<T> {

    public static final String SUCCESS = "0000";
    public static final String FAIL = "0001";

    private final String code;
    private final String msg;
    private final T data;

    private QuickResponse(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> QuickResponse<T> create(String code, String msg, T data) {
        return new QuickResponse<>(code, msg, data);
    }

    public static <T> QuickResponse<T> success(String msg, T data) {
        return create(SUCCESS, msg, data);
    }

    public static <T> QuickResponse<T> success(T data) {
        return create(SUCCESS, null, data);
    }

    public static <T> QuickResponse<T> fail(String msg) {
        return create(FAIL, msg, null);
    }

}
