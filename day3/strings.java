package day3;

import java.util.Arrays;

public class strings {
    public static void main(String[] args) {
        // extract a substring from string n , m begin , end index
        int n = 1, m = 8;
        String string = "JavaLab2020";
        String subString = string.substring(n, m);
        System.out.println(subString);

        // read a text and count occurences of particular word
        String loremString = "i study in msrit aint no place like MsRiT lol class sec E msrIt whewre am I ? MSriT";
        String toFind = "msrit";
        String wordArr[] = loremString.split(" ");
        int count = 0;
        for (String word : wordArr) {
            if (word.equalsIgnoreCase(toFind)) {
                count++;
            }
        }
        System.out.println("The word was found " + count + " times");
        // replace substring in given string
        String target = "windows is the best";
        String replacement = "linux";
        String output=target.replace("windows", replacement);
        System.out.println(output);
        // reARRANGE string in alphabetical order
        String toSortString="ekjwsfbqewnfgewkrfbwqjkgfbkergdg";
        char[] CharArr=toSortString.toCharArray();
        Arrays.sort(CharArr);
        String sortedString=new String(CharArr);
        System.out.println(sortedString);
        // COMPARE TWO STRINGS IGNORING CASE
        String toCompString="msrit",toCompString2="msrit";
        String result=toCompString.compareToIgnoreCase(toCompString2)==0?"same":"not same";
        System.out.println("Strings are "+result);
        // concat 
        String cat="mancatoof";
        String concatString="oofmancat";
        cat=cat.concat(concatString);
        System.out.println(cat);
    }
}