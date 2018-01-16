package noobz.teamz.meilensteinvierx.service;

import noobz.teamz.meilensteinvierx.database.HibernateUtil;
import noobz.teamz.meilensteinvierx.pojo.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * * @author Miles Lorenz
 * @version 1.2
 * Provides the RestControl with methods to save and get products to and from the database.
 * Communication to database uses hibernate and postgres.
 */
public class PortfolioService {

    /**
     * Get the current port folio from the database.
     * @return An array of all products stored in the database
     */
    public Product[] getPortfolio() {

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();

        List result = session.createQuery("from Product").list();

        tx.commit();
        return (Product[]) result.toArray(new Product[]{});
    }
    /**
     * Post a new Product and get the current port folio from the database.
     * @return An array of all products stored in the database
     */
    public Product[] addProduct(Product product) {

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();

        session.save(product);

        tx.commit();
        return getPortfolio();
    }
}
