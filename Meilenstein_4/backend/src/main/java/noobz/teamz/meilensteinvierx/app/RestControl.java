package noobz.teamz.meilensteinvierx.app;

import noobz.teamz.meilensteinvierx.pojo.Product;
import noobz.teamz.meilensteinvierx.service.PortfolioService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author Miles Lorenz
 * @version 1.0
 * Holds all methods for "gets" and "posts".
 */
@RestController
public class RestControl {

    private PortfolioService portfolio;

    public RestControl() {

        this.portfolio = new PortfolioService();

    }

    /**
     * Listens to "/all" and responses with a utf8-json.
     * @return an array of all products in the database
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE, value = "/all")
    public Product[] getAllPortfolio () {
        return portfolio.getPortfolio();
    }
    /**
     * Listens to "/newProduct" on method "post" for a Product as json and responses with a utf8-json.
     * @return an array of all products in the database
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.POST, value = "/newProduct")
    public Product[] addPortfolio(@RequestBody Product product){
        return portfolio.addProduct(product);
    }

    /**
     * Listens to "/test" and responses with a utf8-json.
     * Use this to test if the server seemed to have no database connection.
     * @return a simple test-product.
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE, value = "/test")
    public Product getTest () {
        return new Product( "a", "a", "a", "a");
    }
}
