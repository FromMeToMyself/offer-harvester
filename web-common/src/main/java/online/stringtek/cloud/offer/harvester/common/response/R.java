package online.stringtek.cloud.offer.harvester.common.response;

import online.stringtek.cloud.offer.harvester.common.exception.IStatusCode;
import online.stringtek.cloud.offer.harvester.common.exception.SystemStatusCode;

public class R<T> {

    private boolean success;
    private String code;
    private String message;
    private T data;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public static <V> R<V> success(V data) {
        R<V> r = new R<>();
        r.setSuccess(true);
        r.setCode(SystemStatusCode.SUCCESS.getCode());
        r.setMessage(SystemStatusCode.SUCCESS.getMessage());
        r.setData(data);
        return r;
    }

    public static R<Void> success() {
        return success(null);
    }

    public R<T> withData(T data) {
        this.data = data;
        return this;
    }

    public static <V> R<V> status(IStatusCode statusCode) {
        R<V> r = new R<>();
        r.setSuccess(statusCode.isSuccess());
        r.setCode(statusCode.getModule() + "_" + statusCode.getCode());
        r.setMessage(statusCode.getMessage());
        return r;
    }

    @SuppressWarnings("unchecked")
    public static <V> R<V> to(R<?> response, Class<V> targetClass) {
        return (R<V>) response;
    }

}
