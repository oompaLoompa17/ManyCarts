package workshop.ManyCarts.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.http.HttpSession;

public class User {
    
    private String uid;
    private List<Cart> carts;

    public User(String uid, List<Cart> carts){
        this.uid = uid;
        this.carts = carts;
    }

    public static User getUser(HttpSession session, String uid){
        // look for the value paired with key "user" in session
        User user = (User) session.getAttribute("user");
        // Create new user only if the session is new or the UID has changed
        if (user == null || !user.getUid().equals(uid)){
            user = new User(uid, new ArrayList<>());
            session.setAttribute("user", user);
            System.out.printf("New session created for %s.\n", uid);
        }else{
            System.out.printf("User %s already logged in.\n", uid);
        }

        return user;
    }


    public String getUid() {return uid;}
    public void setUid(String uid) {this.uid = uid;}

    public List<Cart> getCarts() {return carts;}
    public void setCarts(List<Cart> carts) {this.carts = carts;}
}
