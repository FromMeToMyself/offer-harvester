package online.stringtek.cloud.offer.harvester.resume.controller;

import online.stringtek.cloud.offer.harvester.resume.service.ResumeService;
import online.stringtek.cloud.offer.harvester.common.pojo.resume.Resume;
import online.stringtek.cloud.offer.harvester.common.response.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @GetMapping("/{id}")
    public R<Resume> getResumeById(@PathVariable int id) {
        return R.success(resumeService.getById(id));
    }
}
