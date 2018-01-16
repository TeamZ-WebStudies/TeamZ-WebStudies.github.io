package noobz.teamz.meilensteinvierx.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Miles Lorenz
 * @version 2.1
 * Product is the pojo corresponding to the database table portfolio
 * Stores all data for setting up a product on the frontend.
 */
@Entity
@Table(name = "portfolio")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "imgurl")
    private String imgurl;

    @Column(name = "imglink")
    private String imglink;

    @Column(name = "imgtext")
    private String imgtext;

    public Product () {}

    public Product(String title, String content, String imgurl, String imgtext) {
        this.id = 0;
        this.title = title;
        this.content = content;
        this.imgurl = imgurl;
        this.imgtext = imgtext;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgUrl) {
        this.imgurl = imgUrl;
    }

    public String getImglink() {
        return imglink;
    }

    public void setImglink(String imglink) {
        this.imglink = imglink;
    }

    public String getImgtext() {
        return imgtext;
    }

    public void setImgtext(String imgText) {
        this.imgtext = imgText;
    }
}

