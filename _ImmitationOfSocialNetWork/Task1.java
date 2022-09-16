package _ImmitationOfSocialNetWork;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Bob");
        User user2 = new User("Sam");
        User user3 = new User("Dylan");

        user1.sendMessage(user2, "Hello!");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "How is it going?");
        user2.sendMessage(user1, "How is Kate");
        user2.sendMessage(user1, "How is mother");

        user3.sendMessage(user1, "Ok");
        user3.sendMessage(user1, "I will check");
        user3.sendMessage(user1, "When?");

        user1.sendMessage(user3, "Have you read it?");
        user1.sendMessage(user3, "It's good");
        user1.sendMessage(user3, "Very interesting");

        user3.sendMessage(user1, "Oh my...");

        MessageDatabase.showDialog(user1, user3);



    }
}
