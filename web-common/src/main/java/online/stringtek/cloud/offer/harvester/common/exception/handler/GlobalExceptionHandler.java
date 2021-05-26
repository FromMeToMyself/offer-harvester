package online.stringtek.cloud.offer.harvester.common.exception.handler;

import lombok.extern.slf4j.Slf4j;
import online.stringtek.cloud.offer.harvester.common.exception.IStatusCode;
import online.stringtek.cloud.offer.harvester.common.exception.ProjectException;
import online.stringtek.cloud.offer.harvester.common.response.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProjectException.class)
    public R<Void> projectExceptionHandler(ProjectException projectException) {
        IStatusCode statusCode = projectException.getStatusCode();
        if (projectException.getCause() != null) {
            log.info("{}", projectException.getCause().getLocalizedMessage());
        }
        return R.status(statusCode);
    }
}
