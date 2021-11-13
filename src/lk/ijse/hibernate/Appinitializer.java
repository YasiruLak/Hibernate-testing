package lk.ijse.hibernate;

import lk.ijse.hibernate.embeded.Name;
import lk.ijse.hibernate.entity.Animal;
import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.utill.FactoryConfiguration;
import org.hibernate.Transaction;
import org.hibernate.Session;

public class Appinitializer {

    public static void main(String[] args) {

        Name name = new Name();
        name.setfName("Tommy");
        name.setmName("Middle");
        name.setlName("Last");

        Animal animal = new Animal();
        animal.setId("A001");
        animal.setName(name);
        animal.setColour("Black");

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.save(animal);

        transaction.commit();
        session.close();


    }

}
