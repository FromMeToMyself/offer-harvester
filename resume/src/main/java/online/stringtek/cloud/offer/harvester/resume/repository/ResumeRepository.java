package online.stringtek.cloud.offer.harvester.resume.repository;


import online.stringtek.cloud.offer.harvester.common.pojo.resume.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume, Long> {

}
