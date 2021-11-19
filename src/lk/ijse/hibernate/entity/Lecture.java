package lk.ijse.hibernate.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "lecture")
public class Lecture {

    @Id
    private String lId;
    @Column(name = "l_name")
    private String name;

    @ManyToMany
    private List<Subject> subjectList = new ArrayList<>();

    public Lecture() {
    }

    public Lecture(String lId, String name, List<Subject> subjectList) {
        this.lId = lId;
        this.name = name;
        this.subjectList = subjectList;
    }

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lId='" + lId + '\'' +
                ", name='" + name + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }
}
