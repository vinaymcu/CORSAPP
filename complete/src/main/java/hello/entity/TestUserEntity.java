package hello.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Vinay.Gupta
 */
@Entity
@Table(name = "testuser")
public class TestUserEntity implements Serializable {

    private static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "userid")
//    private String userid;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "user_email")
    private String user_email;

    @Column(name = "user_password")
    private String user_password;

    @Column(name = "user_mobile")
    private String user_mobile;

   // @Column(name = "updatedAt")
   // private int updatedAt;

   // @Column(name = "createdAt")
   // private String createdAt;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the user_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * @param user_name the user_name to set
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * @return the user_email
     */
    public String getUser_email() {
        return user_email;
    }

    /**
     * @param user_email the user_email to set
     */
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    /**
     * @return the user_password
     */
    public String getUser_password() {
        return user_password;
    }

    /**
     * @param user_password the user_password to set
     */
    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    /**
     * @return the user_mobile
     */
    public String getUser_mobile() {
        return user_mobile;
    }

    /**
     * @param user_mobile the user_mobile to set
     */
    public void setUser_mobile(String user_mobile) {
        this.user_mobile = user_mobile;
    }

    /**
     * @return the updatedAt
     */
//    public int getUpdatedAt() {
//        return updatedAt;
//    }
//
//    /**
//     * @param updatedAt the updatedAt to set
//     */
//    public void setUpdatedAt(int updatedAt) {
//        this.updatedAt = updatedAt;
//    }

    /**
     * @return the createdAt
     */
//    public String getCreatedAt() {
//        return createdAt;
//    }
//
//    /**
//     * @param createdAt the createdAt to set
//     */
//    public void setCreatedAt(String createdAt) {
//        this.createdAt = createdAt;
//    }

    
    

    
}