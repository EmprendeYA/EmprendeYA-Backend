package pe.edu.upc.emprendeya.dtos;

public class UserDTO {
    private  int idUser;
    private String typeUser;
    private String emailUser;
    private int passwordUser;
    private int phoneUser;
    private String facebookUser;
    private String gmailUser;

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
