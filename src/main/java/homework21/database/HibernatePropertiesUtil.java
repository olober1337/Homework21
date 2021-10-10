package homework21.database;

import homework21.entity.Account;
import homework21.entity.Client;
import homework21.entity.ClientProfile;
import homework21.entity.Status;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernatePropertiesUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            ServiceRegistry serviceRegistry
                    = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            configuration.addAnnotatedClass(Account.class);
            configuration.addAnnotatedClass(Client.class);
            configuration.addAnnotatedClass(Status.class);
            configuration.addAnnotatedClass(ClientProfile.class);
            return configuration
                    .buildSessionFactory(serviceRegistry);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("There is issue in hibernate util");
        }
    }
}
