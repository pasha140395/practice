package pasha.cubic.models;


public class User {
    public int id;
    public String login;
    public String password;

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }
}
