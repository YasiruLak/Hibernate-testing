package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Lecture;
import lk.ijse.hibernate.entity.Owner;
import lk.ijse.hibernate.entity.Pet;
import lk.ijse.hibernate.entity.Subject;
import lk.ijse.hibernate.utill.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Appinitializer {

    public static void main(String[] args) {
//
//        Owner owner = new Owner();
//        owner.setoId("0001");
//        owner.setoName("yasiru");
//
//        Pet pet = new Pet();
//        pet.setpId("P001");
//        pet.setpName("Dog");
//
//        Pet pet2 = new Pet();
//        pet2.setpId("P002");
//        pet2.setpName("Bird");
//
//        owner.getPetList().add(pet);
//        owner.getPetList().add(pet2);
//
//        //2nd method
//       /* List<Pet> petList =  new ArrayList<>();
//        petList.add(pet1);
//        petList.add(pet2);
//        owner.setPetList(petList);*/
//
//        pet.setOwner(owner);
//        pet2.setOwner(owner);
//
//        Session session = FactoryConfiguration.getInstance().getSession();
//
//        Transaction transaction = session.beginTransaction();
//
//        session.save(owner);
//        session.save(pet);
//        session.save(pet2);
//
//
//        transaction.commit();
//        session.close();

        //Many TO Many
        Lecture lecturer = new Lecture();
        lecturer.setlId("L001");
        lecturer.setName("Saman");

        Subject s1 = new Subject();
        s1.setsId("S001");
        s1.setsName("Java");

        Subject s2 = new Subject();
        s2.setsId("S002");
        s2.setsName("Hibernate");

        lecturer.getSubjectList().add(s1);
        lecturer.getSubjectList().add(s2);

        s1.getLectureList().add(lecturer);
        s2.getLectureList().add(lecturer);

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.save(lecturer);
        session.save(s1);
        session.save(s2);

        transaction.commit();
        session.close();
    }

}
