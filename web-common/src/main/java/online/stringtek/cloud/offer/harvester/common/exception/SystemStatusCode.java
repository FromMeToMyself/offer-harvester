package online.stringtek.cloud.offer.harvester.common.exception;

public class SystemStatusCode extends BaseStatusCode {

    public static final SystemStatusCode SUCCESS=new SystemStatusCode(true,"200","请求成功");
    public static final SystemStatusCode INTERNAL_SERVER_ERROR = new SystemStatusCode(false,"500",
        "服务器内部异常");

    public SystemStatusCode(boolean success,String code, String message) {
        super(success,code, message);
    }

    @Override
    public String getModule() {
        return "SYS";
    }
}
