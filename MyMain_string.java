//**************************************************************
// Question 2
// MyMain_string.java
// Date: Oct 17
// Author: Awais Ahmad
// Purpose: create objects from StringManipulation class,
// enter input as mentioned, print out the edited string.
//***************************************************************

public class MyMain_string {
    public static void main(String [] args){
        //create new objects of class StringManipulation
        StringManipulation string1 = new StringManipulation();
        StringManipulation string2 = new StringManipulation();
        StringManipulation string3 = new StringManipulation();

        //create outputs from the input examples
        String output1 = string1.stringManipulation("count");
        String output2 = string2.stringManipulation("number_of_students");
        String output3 = string3.stringManipulation("max_grade_in_class");

        //print the edited strings
        System.out.println("The string 'count' is now: " + output1);
        System.out.println("The string 'number_of_students' is now: " + output2);
        System.out.println("The string 'max_grade_in_class' is now: " + output3);
    }
}
