package online.stringtek.cloud.offer.harvester.autodeliver.controller;

import online.stringtek.cloud.offer.harvester.common.pojo.resume.Resume;
import online.stringtek.cloud.offer.harvester.common.response.R;
import online.stringtek.cloud.offer.harvester.common.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class AutoDeliverController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/resume/status/{id}")
    public R<Integer> getResumeStatus(@PathVariable Integer id) {
        R<?> response = restTemplate
            .getForObject("http://127.0.0.1:9000/api/v1/resume/" + id, R.class);
        if (response != null && response.isSuccess()) {
            Resume resume = JsonUtil.map2Object(response.getData(),Resume.class);
            System.out.println(resume);
            return R.success(resume.getIsOpenResume());
        }
        return R.to(response, Integer.class);
    }
}
