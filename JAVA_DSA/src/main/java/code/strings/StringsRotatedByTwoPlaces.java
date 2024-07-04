//https://www.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1?page=1&category=Strings&difficulty=Easy&status=unsolved&sortBy=submissions
//String Rotated by 2 Places
//Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating (in any direction) string 'a' by exactly 2 places.



package code.strings;

public class StringsRotatedByTwoPlaces {
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        if(str1.equals(str2) || str1.length()<=2 || str2.length() <=2){
            return false;
        }

        int length = str1.length();
        str1 = str1.charAt(length-2) +""+ str1.charAt(length-1) + str1 + str1.charAt(0) + str1.charAt(1);

        if(str1.contains(str2))
            return true;

        return false;
    }

}
