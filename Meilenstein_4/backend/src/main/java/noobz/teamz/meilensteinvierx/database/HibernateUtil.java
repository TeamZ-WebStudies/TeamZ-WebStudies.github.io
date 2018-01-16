package noobz.teamz.meilensteinvierx.database;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * * @author Miles Lorenz
 * @version 1.1
 * Product is the
 * Stores the sessionFactory as singleton.
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;

    /**
     * Creates a sessionFactory from  hibernate.cfg.xml
     * @return a sessionFactory
     */
    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            Configuration configuration =  new Configuration().configure();
            return configuration.buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    /**
     * Get the sessionFactory. If none was instantiated create a new sessionFactory.
     * @return the sessionFactory
     */
    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null)
            sessionFactory = buildSessionFactory();
        return sessionFactory;
    }

}

