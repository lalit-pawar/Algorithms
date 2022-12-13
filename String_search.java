package Algorithms;

import java.util.Arrays;
import java.util.List;

public class String_search {

    public static void main(String[] args) {
         String name= "lalit pawar ";
         char find= 'p';
        System.out.println(search1(name,find));
        System.out.println( "character " + find + " is found ");
        System.out.println(Arrays.toString(name.toCharArray())); // It creates the character array of given string.
    }
    // using For each loop //
    static boolean search1(String str, char tag){
        if(str.length()==0){
            return false;
        }
        for( char ch: str.toCharArray()){
            if(ch==tag){
                return true;
            }
        }
        return false;
    }



    // Using the normal for loop //
    static boolean search2(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i) ){
               return true;
            }
        }
        return false;
    }

}