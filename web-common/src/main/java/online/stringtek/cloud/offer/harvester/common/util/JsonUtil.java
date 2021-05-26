package online.stringtek.cloud.offer.harvester.common.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.util.Map;
import online.stringtek.cloud.offer.harvester.common.exception.ProjectException;
import online.stringtek.cloud.offer.harvester.common.exception.SystemStatusCode;


public class JsonUtil {

    private static ObjectMapper om = new ObjectMapper();

    static {
        om.registerModule(new JavaTimeModule());//设置Java时间处理
    }

    public static <T> T map2Object(Object map, Class<T> clazz) {
        if (map instanceof Map) {
            return map2Object((Map<?, ?>) map, clazz);
        } else {
            return null;
        }
    }

    public static <T> T map2Object(Map<?, ?> map, Class<T> clazz) {
        if (map == null) {
            return null;
        }
        try {
            return om.convertValue(map, clazz);
        } catch (Exception e) {
            throw new ProjectException(SystemStatusCode.INTERNAL_SERVER_ERROR, e);
        }
    }
}
