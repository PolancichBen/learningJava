public class Main {
  public static void main(String[] args) {
    // Print
    System.out.println("Hello World");

    // Data Types
    // Non-Primitive Data Types
    // Def: 
    String myText = "Hello";
    
    // Primitive Data Types
    // Def: Specifies the Size and Type of Variable. Has no Additional Methods
    int testInt1 = 5;
    float myFloatNum = 5.99f;
    char myLetter = 'D';
    boolean myBool = true;
    byte myNum = 100; // -128 to 127
    short myShort = 5000; // -32768 to 32767

    // Widening Casting (Small to Large)
    int testInt = 9;
    double testDouble = testInt; // Cast Int to double

    // Narrowing Casting (Large to Small)
    double myDouble = 9.78d;
    int myInt = (int) myDouble;

    // Real Life Example
    int maxScore = 500;
    int myScore = 435;
    float percentage = (float) myScore / maxScore * 100.0f;

    // Operators
    // Used to manipulate 2 values, values can be a variable
    int sum1 = 100 + 50;
    int sum2 = sum1 + 250;
    int sum3 = sum2 + sum2;

    // 5 types of operators
    // Arithmetic: Used to perform mathematical operations
    // + - * / % ++ --

    // Assignment
    // = Normal Assignment
    // += Addition Assignment

    // Comparison
    // == is equal to
    // != not equal to
    // > GT
    // < LT
    // >= GTE
    // <= LTE

    // Logical
    // && AND
    // || OR
    // ! not
  }
}