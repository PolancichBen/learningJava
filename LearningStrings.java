public class LearningStrings {
  public static void main(String[] args) {
    String greeting = "Hello";

    // Getting the Length of a string
    int lengthOfString = greeting.length();

    // Uppercase
    String upperGreeting = greeting.toUpperCase();

    // Lowercase
    String lowerGreeting = greeting.toLowerCase();

    // Finding the index of a string
    String txt = "Please locate where 'locate' occurs!";
    int indexOfLocate = txt.indexOf("locate");

    // Concatentation
    String firstName = "John";
    String lastName = "Doe";

    String fullName = firstName + " " + lastName;
  }
}
