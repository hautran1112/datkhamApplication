package edu.poly.datkhamapplication;

public class Loginuse {
    String Id;
    String User;
    String Password;

    public Loginuse() {
    }

    public Loginuse(String id, String user, String password) {
        Id = id;
        User = user;
        Password = password;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
