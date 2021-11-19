package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Owner;
import lk.ijse.hibernate.entity.Pet;
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

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();



        transaction.commit();
        session.close();
    }

}
