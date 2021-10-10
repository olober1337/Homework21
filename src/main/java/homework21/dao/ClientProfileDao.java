package homework21.dao;

import homework21.database.HibernatePropertiesUtil;
import homework21.database.HibernateUtil;
import homework21.entity.ClientProfile;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ClientProfileDao {

    private static final String FROM_CLIENT_PROFILE = "FROM ClientProfile";

    public List<ClientProfile> findClientProfile() {
        try (Session session = HibernatePropertiesUtil.getSessionFactory().openSession() ) {
            return session.createQuery(FROM_CLIENT_PROFILE).list();
        }
    }

    public ClientProfile findById(Integer id) {
        try (Session session = HibernatePropertiesUtil.getSessionFactory().openSession() ) {
            return session.byId(ClientProfile.class).getReference(id);
        }
    }

    public void save(ClientProfile clientProfile) {
        try (Session session = HibernateUtil.getSessionFactory().openSession() ) {
            Transaction transaction = session.beginTransaction();

            session.save(clientProfile);
            transaction.commit();
        }
    }

    public void delete(ClientProfile clientProfile) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession() ) {
            Transaction transaction = session.beginTransaction();

            session.delete(clientProfile);
            transaction.commit();
        }
    }

    public void update(ClientProfile clientProfile) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession() ) {
            Transaction transaction = session.beginTransaction();

            session.update(clientProfile);
            transaction.commit();
        }
    }
}
