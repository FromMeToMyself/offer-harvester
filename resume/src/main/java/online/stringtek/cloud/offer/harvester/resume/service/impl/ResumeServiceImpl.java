package online.stringtek.cloud.offer.harvester.resume.service.impl;

import java.util.Optional;
import online.stringtek.cloud.offer.harvester.resume.service.ResumeService;
import online.stringtek.cloud.offer.harvester.common.exception.ProjectException;
import online.stringtek.cloud.offer.harvester.common.pojo.resume.Resume;
import online.stringtek.cloud.offer.harvester.resume.enums.ResumeStatusCode;
import online.stringtek.cloud.offer.harvester.resume.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeRepository resumeRepository;

    @Override
    public Resume getById(long id) {
        Optional<Resume> resume = resumeRepository.findById(id);
        if (resume.isPresent()) {
            return resume.get();
        } else {
            throw new ProjectException(ResumeStatusCode.NOT_FOUND);
        }
    }
}
