package online.stringtek.cloud.offer.harvester.common.exception;

public abstract class BaseStatusCode implements IStatusCode {

    private final boolean success;
    private final String code;
    private final String message;

    public BaseStatusCode(boolean success, String code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public abstract String getModule();

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public boolean isSuccess() {
        return success;
    }
}
