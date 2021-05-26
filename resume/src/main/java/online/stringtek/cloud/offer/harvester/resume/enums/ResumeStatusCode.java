package online.stringtek.cloud.offer.harvester.resume.enums;

import online.stringtek.cloud.offer.harvester.common.exception.BaseStatusCode;

public class ResumeStatusCode extends BaseStatusCode {

    public static final ResumeStatusCode NOT_FOUND = new ResumeStatusCode(false, "404", "找不到该简历");

    public ResumeStatusCode(boolean success, String code, String message) {
        super(success, code, message);
    }


    @Override
    public String getModule() {
        return "RESUME";
    }
}
