package online.stringtek.cloud.offer.harvester.common.exception;

public class ProjectException extends RuntimeException {

    private final IStatusCode statusCode;

    public ProjectException(IStatusCode statusCode) {
        this.statusCode = statusCode;
    }

    public ProjectException(IStatusCode statusCode, Throwable cause) {
        super(cause);
        this.statusCode = statusCode;
    }

    public IStatusCode getStatusCode() {
        return statusCode;
    }
}
