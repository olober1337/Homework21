package homework21.dao;

import homework21.database.HibernateUtil;
import homework21.entity.Status;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StatusDao {

    private static final String FROM_STATUSES = "FROM Status";

    public List<Status> findAllStatuses() {
        try (Session session = HibernateUtil.getSessionFactory().openSession() ) {
            return session.createQuery(FROM_STATUSES).list();
        }
    }

    public Status findById(Integer id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession() ) {
            return session.byId(Status.class).getReference(id);
        }
    }

    public void save(Status status) {
        try (Session session = HibernateUtil.getSessionFactory().openSession() ) {
            Transaction transaction = session.beginTransaction();

            session.save(status);
            transaction.commit();
        }
    }

    public void update(Status status) {
        try (Session session = HibernateUtil.getSessionFactory().openSession() ) {
            Transaction transaction = session.beginTransaction();

            session.update(status);
            transaction.commit();
        }
    }

    public void delete(Status status) {
        try (Session session = HibernateUtil.getSessionFactory().openSession() ) {
            Transaction transaction = session.beginTransaction();

            session.delete(status);
            transaction.commit();
        }
    }
}
