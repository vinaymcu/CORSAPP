/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "user_name",
    "user_email",
    "user_password",
    "user_mobile",
    "updatedAt",
    "createdAt"
})

public class User {

    @JsonProperty("id")
    private String userid;
    @JsonProperty("user_name")
    private String userName;
    @JsonProperty("user_email")
    private String userEmail;
    @JsonProperty("user_password")
    private String userPassword;
    @JsonProperty("user_mobile")
    private String userMobile;
    @JsonProperty("updatedAt")
    private int updatedAt;
    @JsonProperty("createdAt")
    private String createdAt;

    @JsonProperty("id")
    public String getUserid() {
        return userid;
    }

    @JsonProperty("id")
    public void setUserid(String userid) {
        this.userid = userid;
    }

    
    /**
     * @return the userName
     */
    @JsonProperty("user_name")
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    @JsonProperty("user_name")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userEmail
     */
    @JsonProperty("user_email")
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * @param userEmail the userEmail to set
     */
    @JsonProperty("user_email")
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * @return the userPassword
     */
    @JsonProperty("user_password")
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * @param userPassword the userPassword to set
     */
    @JsonProperty("user_password")
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * @return the userMobile
     */
    @JsonProperty("user_mobile")
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * @param userMobile the userMobile to set
     */
    @JsonProperty("user_mobile")
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    /**
     * @return the updatedAt
     */
    @JsonProperty("updatedAt")
    public int getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt the updatedAt to set
     */
    @JsonProperty("updatedAt")
    public void setUpdatedAt(int updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return the createdAt
     */
    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
