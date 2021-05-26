package online.stringtek.cloud.offer.harvester.common.pojo.resume;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import lombok.ToString;

@ToString
@Entity
@Table(name = "r_resume", schema = "offer_harvester")
public class Resume {

    private long id;
    private String sex;
    private String birthday;
    private String workYear;
    private String phone;
    private String email;
    private String status;
    private String resumeName;
    private String name;
    private LocalDateTime createTime;
    private String headPic;
    private Integer isDel;
    private LocalDateTime updateTime;
    private Integer userId;
    private Integer isDefault;
    private String highestEducation;
    private Integer deliverNearByConfirm;
    private int refuseCount;
    private int markCanInterviewCount;
    private int haveNoticeInterCount;
    private String oneWord;
    private String liveCity;
    private Integer resumeScore;
    private Integer userIdentity;
    private Integer isOpenResume;
    private LocalDateTime timestampDemo;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "birthday")
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "work_year")
    public String getWorkYear() {
        return workYear;
    }

    public void setWorkYear(String workYear) {
        this.workYear = workYear;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "resume_name")
    public String getResumeName() {
        return resumeName;
    }

    public void setResumeName(String resumeName) {
        this.resumeName = resumeName;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "create_time")
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "head_pic")
    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    @Basic
    @Column(name = "is_del")
    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Basic
    @Column(name = "update_time")
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "is_default")
    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    @Basic
    @Column(name = "highest_education")
    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation;
    }

    @Basic
    @Column(name = "deliver_near_by_confirm")
    public Integer getDeliverNearByConfirm() {
        return deliverNearByConfirm;
    }

    public void setDeliverNearByConfirm(Integer deliverNearByConfirm) {
        this.deliverNearByConfirm = deliverNearByConfirm;
    }

    @Basic
    @Column(name = "refuse_count")
    public int getRefuseCount() {
        return refuseCount;
    }

    public void setRefuseCount(int refuseCount) {
        this.refuseCount = refuseCount;
    }

    @Basic
    @Column(name = "mark_can_interview_count")
    public int getMarkCanInterviewCount() {
        return markCanInterviewCount;
    }

    public void setMarkCanInterviewCount(int markCanInterviewCount) {
        this.markCanInterviewCount = markCanInterviewCount;
    }

    @Basic
    @Column(name = "have_notice_inter_count")
    public int getHaveNoticeInterCount() {
        return haveNoticeInterCount;
    }

    public void setHaveNoticeInterCount(int haveNoticeInterCount) {
        this.haveNoticeInterCount = haveNoticeInterCount;
    }

    @Basic
    @Column(name = "one_word")
    public String getOneWord() {
        return oneWord;
    }

    public void setOneWord(String oneWord) {
        this.oneWord = oneWord;
    }

    @Basic
    @Column(name = "live_city")
    public String getLiveCity() {
        return liveCity;
    }

    public void setLiveCity(String liveCity) {
        this.liveCity = liveCity;
    }

    @Basic
    @Column(name = "resume_score")
    public Integer getResumeScore() {
        return resumeScore;
    }

    public void setResumeScore(Integer resumeScore) {
        this.resumeScore = resumeScore;
    }

    @Basic
    @Column(name = "user_identity")
    public Integer getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(Integer userIdentity) {
        this.userIdentity = userIdentity;
    }

    @Basic
    @Column(name = "is_open_resume")
    public Integer getIsOpenResume() {
        return isOpenResume;
    }

    public void setIsOpenResume(Integer isOpenResume) {
        this.isOpenResume = isOpenResume;
    }

    @Basic
    @Column(name = "timestamp_demo")
    public LocalDateTime getTimestampDemo() {
        return timestampDemo;
    }

    public void setTimestampDemo(LocalDateTime timestampDemo) {
        this.timestampDemo = timestampDemo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Resume resume = (Resume) o;
        return id == resume.id && refuseCount == resume.refuseCount
            && markCanInterviewCount == resume.markCanInterviewCount
            && haveNoticeInterCount == resume.haveNoticeInterCount && Objects
            .equals(sex, resume.sex) && Objects.equals(birthday, resume.birthday)
            && Objects.equals(workYear, resume.workYear) && Objects
            .equals(phone, resume.phone) && Objects.equals(email, resume.email)
            && Objects.equals(status, resume.status) && Objects
            .equals(resumeName, resume.resumeName) && Objects.equals(name, resume.name)
            && Objects.equals(createTime, resume.createTime) && Objects
            .equals(headPic, resume.headPic) && Objects.equals(isDel, resume.isDel)
            && Objects.equals(updateTime, resume.updateTime) && Objects
            .equals(userId, resume.userId) && Objects.equals(isDefault, resume.isDefault)
            && Objects.equals(highestEducation, resume.highestEducation) && Objects
            .equals(deliverNearByConfirm, resume.deliverNearByConfirm) && Objects
            .equals(oneWord, resume.oneWord) && Objects.equals(liveCity, resume.liveCity)
            && Objects.equals(resumeScore, resume.resumeScore) && Objects
            .equals(userIdentity, resume.userIdentity) && Objects
            .equals(isOpenResume, resume.isOpenResume) && Objects
            .equals(timestampDemo, resume.timestampDemo);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, sex, birthday, workYear, phone, email, status, resumeName, name, createTime,
                headPic, isDel, updateTime, userId, isDefault, highestEducation,
                deliverNearByConfirm,
                refuseCount, markCanInterviewCount, haveNoticeInterCount, oneWord, liveCity,
                resumeScore, userIdentity, isOpenResume, timestampDemo);
    }
}
