package lk.ijse.hibernate;

import lk.ijse.hibernate.embeded.Name;
import lk.ijse.hibernate.entity.Animal;
import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.entity.Passport;
import lk.ijse.hibernate.entity.Person;
import lk.ijse.hibernate.utill.FactoryConfiguration;
import org.hibernate.Transaction;
import org.hibernate.Session;

public class Appinitializer {

    public static void main(String[] args) {

        Person person = new Person();
        person.setpId("P001");
        person.setName("Yasiru");

        Passport passport = new Passport();
        passport.setPsId("Ps1");
        passport.setFee(250000);
        passport.setPerson(person);


        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();
        session.save(person);
        session.save(passport);


        transaction.commit();
        session.close();


    }

}
