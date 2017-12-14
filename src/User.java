public class User extends Person {
//    The User class should have a protected property named admin that is a boolean.
    protected boolean admin;

//    Create a constructor for the User class that accepts the same parameters as the Person constructor plus a third parameter, a boolean for whether or not the user is an administrator. Use this to set the admin property.
    public User(String fname, String lname, boolean admin) {
        super(fname,lname);
        this.admin = admin;
    }

//    Write a method on the User class named isAdmin() that functions as a getter for the admin property.
    public boolean isAdmin() {
        return this.admin;
    }
}
