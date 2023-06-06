package pe.edu.upc.emprendeya.entities;

import javax.persistence.*;

@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "typeUser",length = 15,nullable = false)
    private String typeUser;
    @Column(name = "emailUser")
    private String emailUser;
    @Column(name = "passwordUser")
    private int passwordUser;
    @Column(name = "phoneUser")
    private int phoneUser;
    @Column(name = "facebookUser")
    private String facebookUser;
    @Column(name = "gmailUser")
    private String gmailUser;

    public User() {
    }
    public User(int idUser, String typeUser, String emailUser, int passwordUser, int phoneUser, String facebookUser, String gmailUser) {
        this.idUser = idUser;
        this.typeUser = typeUser;
        this.emailUser = emailUser;
        this.passwordUser = passwordUser;
        this.phoneUser = phoneUser;
        this.facebookUser = facebookUser;
        this.gmailUser = gmailUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public int getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(int passwordUser) {
        this.passwordUser = passwordUser;
    }

    public int getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(int phoneUser) {
        this.phoneUser = phoneUser;
    }

    public String getFacebookUser() {
        return facebookUser;
    }

    public void setFacebookUser(String facebookUser) {
        this.facebookUser = facebookUser;
    }

    public String getGmailUser() {
        return gmailUser;
    }

    public void setGmailUser(String gmailUser) {
        this.gmailUser = gmailUser;
    }
}
