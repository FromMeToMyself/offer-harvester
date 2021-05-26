package online.stringtek.cloud.offer.harvester.common.exception;

public interface IStatusCode {

    boolean isSuccess();

    String getModule();

    String getCode();

    String getMessage();
}


