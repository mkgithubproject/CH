public class User {
    public String userId;
    public String userName;
    public double userAge;
   // constructor
    public User(String userId, String userName, double userAge) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
    }
    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                '}';
    }

}
