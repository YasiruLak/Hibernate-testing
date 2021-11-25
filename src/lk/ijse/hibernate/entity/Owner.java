package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "owner")
public class Owner {
    @Id
    private String oId;
    private String oName;

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    private List<Pet> petList = new ArrayList<>();

    public Owner() {
    }

    public Owner(String oId, String oName, List<Pet> petList) {
        this.oId = oId;
        this.oName = oName;
        this.petList = petList;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName;
    }

    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "oId='" + oId + '\'' +
                ", oName='" + oName + '\'' +
                '}';
    }
}
