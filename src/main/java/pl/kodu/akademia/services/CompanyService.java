package pl.kodu.akademia.services;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.kodu.akademia.model.Company;

@Service
public class CompanyService {

    @Autowired
    HibernateSessionFactoryService hsfs;

    public void saveCompany(Company company) {
        Session session = this.hsfs.getSession();
        Transaction tx = session.beginTransaction();
        session.save(company);
        tx.commit();
        session.close();
    }
}
