public class User {
    // instance variables
    public String username;
    public String email;
    public String password;
    public boolean isAdmin;

    // Constructor is the function called on object creation
    // method overloading
    public User(String email, String username, String password, boolean isAdmin) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;

        numberOfUsers++;
    }

    public User(String email) {
        this.email = email;
        numberOfUsers++;
    }

    // this is "protected" so the only code that can
    // change this value lives on this class
    // the reason why this is static is b/c we need to:
    // store a record of how many users we have,
    // whether or not we've made any objects
    private static int numberOfUsers = 0;
    private static int numberOfGuests = 0;

    // we can call getNumberOfUsers()
    // methods/properties belong to the objects unless we add static
    public static int getNumberOfUsers() {
        return numberOfUsers;
    }

    public static int getNumberOfGuests() {
        return numberOfGuests;
    }

}
