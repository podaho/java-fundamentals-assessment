public class Person implements Greeter {
//    Change your Person class so that it implements the Greeter interface.
//    This class should have two protected string properties: firstName and lastName.
    protected String firstName;
    protected String lastName;

//    Add a constructor method that takes in two strings that will be used to set the firstName and lastName properties.
//    If the firstName or lastName (or both) argument is null, the constructor should throw an IllegalArgumentException with a descriptive error message.
    public Person(String firstName, String lastName) throws IllegalArgumentException {
        if(firstName == null || lastName == null) {
            if(firstName != null) {
                throw new IllegalArgumentException("Person Constructor First Name Input is null");
            } else if(lastName != null) {
                throw new IllegalArgumentException("Person Constructor Last Name Input is null");
            } else {
                throw new IllegalArgumentException("Person Constructor First & Last Name Input is null");
            }
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

//    Write a getter and setter for both the firstName and lastName properties.
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    The implementation of the sayHello method on the Person class should use the firstName and lastName properties to
//      create a greeting message that is returned.
    public String sayHello() {
        return "Yoyoyo! This is "+this.firstName+" "+this.lastName+"! Who this be!?";
    }
}
