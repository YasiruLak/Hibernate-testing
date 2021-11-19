package lk.ijse.hibernate;

import lk.ijse.hibernate.utill.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Appinitializer {

    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();


        transaction.commit();
        session.close();


    }

}
