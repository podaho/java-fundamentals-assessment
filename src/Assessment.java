import java.util.ArrayList;

public class Assessment {
    //square: should accept and return a single integer number. The method should return the number times itself.
    public static int square(int input) {
        return input*input;
    }

    //sum: should accept 2 numbers, either integers or doubles, and returns the result of adding the two numbers together.
    public static int sum(int inp1, int inp2) {
        return inp1+inp2;
    }

    public static double sum(double inp1, double inp2) {
        return inp1+inp2;
    }

    //average: should accept an array of integers, and return the average of the passed numbers as a double.
    public static double average(int[] arr) {
        int sum = 0;
        for(int x : arr) {
            sum += x;
        }
        return sum/((float) arr.length);
    }

//    On your Assessment class create a static method named capitalizeRecords
//    The method should both accept and return an ArrayList of User objects.
//    The returned list should have the same User objects in it, but each user's firstName and lastName properties
//      should be properly capitalized. (i.e. the first letter of each property should be upper case)
    public static ArrayList<User> capitalizeRecords(ArrayList<User> arr) {
        ArrayList<User> retArr = new ArrayList<>();
        for(User user : arr) {
            user.setFirstName(user.getFirstName().substring(0,1).toUpperCase()+user.getFirstName().substring(1).toLowerCase());
            user.setLastName(user.getLastName().substring(0,1).toUpperCase()+user.getLastName().substring(1).toLowerCase());
            retArr.add(user);
        }
        return retArr;
    }

}
