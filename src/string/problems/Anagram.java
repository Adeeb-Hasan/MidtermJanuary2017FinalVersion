package string.problems;
import java.util.*;


/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static boolean anagram(String st1, String st2){
        int n1 = st1.length();
        int n2 = st2.length();

        if (n1 != n2)
            return false;

        char[] s1Array = n1.toLowerCase().toCharArray();

        char[] s2Array = n2.toLowerCase().toCharArray();

        //Sorting both s1Array and s2Array

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        for (int i = 0; i < s1Array.length; i++)
        {
            if(s1Array[i] != s2Array[i])
            {
                return false;
            }
        }
        return true;
    }

}
    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String str1 = "test";
        String str2 = "sett";
        if (anagram(str1, str2))
           System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two are not anagram of each other");
    }
}
