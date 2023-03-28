package classExercise;

import java.util.*;

public class Assignment {
    public static void main(String[] args){

        //Q1 :  What is the output value and the length of the string returned by the below expression?
        //"Was it a bee or a bat I saw?".substring(9, 12);



        String Sentence = "Was it a bee or bat i saw";

        System.out.println("Total length of the sentence : " +Sentence.length());

        System.out.println(Sentence.substring(9,12));


        // Q2 : convert string to byte array

        String str = "Was it a bee or bat i saw";
        byte[] byteArr = str.getBytes();
        // print the byte[] elements
        System.out.println("String to byte array: " + Arrays.toString(byteArr));

        // Q3 : Which of the following defines the value contained in testStr?
        //String testStr = “”;

        // null

        // Q4 : What is the value returned by the method call Java.charAt(9)?

        String str1 = "Are you a Java expert? Yes, you are.";
        System.out.println("value :"+str1.charAt(9));


        // Q11 :Which of the following methods is used to compare two Strings in a Java program?
        // And if the Strings don’t match, then it returns a non-zero value.

        String string1 = new String("Geeksforgeeks");
        String string2 = new String("Geeksforgeeks");
        System.out.println("Comparing " + string1 + " and " + string2
                + " : " + string1.equals(string2));

        String str3 = "How are you?";
        String str2 = str3.substring(5, 7);
        System.out.println(str2);

        // Q18 : Which of the following statement mentions the right ways to concatenate the two strings?

        String s="kulwinder"+" kaur";
        System.out.println(s);

        // or

        String s1="Emaan ";
        String s2="Singh";
        String s3=s1.concat(s2);
        System.out.println(s3);

// Q20 :


        int x =Integer.parseInt("9");
        System.out.println(x);

        // or

        System.out.println(Integer.parseInt("10"));
    }
}
