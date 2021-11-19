package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "subject")
public class Subject {

    @Id
    private String sId;
    private String sName;

    @ManyToMany(mappedBy = "subjectList")
    private List<Lecture> lectureList = new ArrayList<>();

    public Subject() {
    }

    public Subject(String sId, String sName, List<Lecture> lectureList) {
        this.sId = sId;
        this.sName = sName;
        this.lectureList = lectureList;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public List<Lecture> getLectureList() {
        return lectureList;
    }

    public void setLectureList(List<Lecture> lectureList) {
        this.lectureList = lectureList;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "sId='" + sId + '\'' +
                ", sName='" + sName + '\'' +
                ", lectureList=" + lectureList +
                '}';
    }
}
