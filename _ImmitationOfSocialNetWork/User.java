package _ImmitationOfSocialNetWork;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    List <User> subscriptions;

    public User(String username){
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user){
        subscriptions.add(user);
    }

    public boolean isSubscribed (User user){
        for (User currentUser: subscriptions
             ) {
            if(currentUser.getUsername().equals(user.getUsername())){
                return true;
            }
        }
        return false;
    }

    public boolean isFriend (User user){
        if (this.isSubscribed(user) && user.isSubscribed(this)){
            return true;
        }
        return false;
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }
}
