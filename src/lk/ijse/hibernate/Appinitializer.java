package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.utill.FactoryConfiguration;
import org.hibernate.Transaction;
import org.hibernate.Session;

public class Appinitializer {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setId("C001");
        customer.setName("Yasiru");
        customer.setAddress("Galle");
        customer.setSalary(25000);

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.save(customer);

        transaction.commit();

        session.close();
    }

}
