//********************************************************************************
// Question 2
// StringManipulation.java
// Date: Oct 17
// Author: Awais Ahmad
// Purpose: Remove all underline characters, each word in the middle
// of the string begins with a capital letter and first word starts lower case.
//********************************************************************************

public class StringManipulation {
    public String stringManipulation(String input){
        //initialize empty string
        String output = "";

        //initialize counter for # of underlines
        int underlineCounter = 0;

        //iterate through the inputted string
        for (int i = 0; i < input.length(); i++){

            //if the character at i is an underline, remove it and make the next character upper case
            // ^ and if the underline isn't at the end if the input string
            if (input.charAt(i) == '_' && i + 1 < input.length()){
                output += Character.toUpperCase(input.charAt(i + 1));
                //increment the underline counter by one for each underline
                underlineCounter += 1;
            }

            // else if it's a letter not after an underline, add it to the output as a lower case
            else if (i == 0 || input.charAt(i - 1) != '_'){
                output += Character.toLowerCase(input.charAt(i));
            }
        }
        //if there are zero underlines, the first letter should be upper case and the rest lower case
        if (underlineCounter == 0){
            output = Character.toUpperCase(input.charAt(0)) + input.substring(1);
        }
        return output;
    }
}
