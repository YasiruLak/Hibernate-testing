package lk.ijse.hibernate.entity;

import lk.ijse.hibernate.embeded.Name;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "animal")
public class Animal {
    @Id
    @Column(name = "Animal_Id")
    private String id;
    @Embedded
    private Name name;
    @Transient
    private String colour;
    @CreationTimestamp
    private Date date;

    public Animal() {
    }

    public Animal(String id, Name name, String colour, Date date) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", date=" + date +
                '}';
    }
}
