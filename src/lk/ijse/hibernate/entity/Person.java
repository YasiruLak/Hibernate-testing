package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "person")
public class Person {
    @Id
    private String pId;
    private String name;

    public Person() {
    }

    public Person(String pId, String name) {
        this.pId = pId;
        this.name = name;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pId='" + pId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
