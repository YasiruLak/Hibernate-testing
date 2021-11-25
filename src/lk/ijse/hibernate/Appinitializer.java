package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Owner;
import lk.ijse.hibernate.entity.Pet;
import lk.ijse.hibernate.utill.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Appinitializer {

    public static void main(String[] args) {


        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Owner owner = session.get(Owner.class, "001");

         System.out.println(owner.getoId());
        System.out.println(owner.getoName());

        System.out.println(owner.getPetList());

        transaction.commit();
        session.close();
    }

}
