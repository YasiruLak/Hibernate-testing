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

        Owner owner = session.get(Owner.class, "O001");

        System.out.println(owner.getoId());
        //Eager and Lazy Fetching using One to Many Relation
       /* System.out.println(owner.getoId());
        System.out.println(owner.getoName());
        //
        System.out.println(owner.getPetList());
        System.out.println(owner.getPetList());*/

        //get() method vs load() method

        //get() -> Eager Fetching
        /*Owner obj = session.get(Owner.class, "IJSE");   //query executed...!!!!
        System.out.println(obj.getoId());*/

        //load() -> lazy Fetching
        /*Owner obj2 = session.load(Owner.class, "O001");
        System.out.println(obj2.getoId());  //no query executed
        System.out.println(obj2.getoName());    // query executed!!!!*/

        transaction.commit();
        session.close();
    }
}
