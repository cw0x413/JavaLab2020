import java.util.Arrays;
import java.util.Scanner;

public class strings {
    Scanner scanner = new Scanner(System.in);
    void extractSubString(){
        // extract a substring from string n , m begin , end index
        int n, m;
        System.out.println("extract a substring from string n , m begin , end index\n");
        System.out.println("Enter the string to extract from");
        String string = scanner.nextLine();
        System.out.println("Enter the starting index and number of characters to extract");
        n = scanner.nextInt();
        m = scanner.nextInt();
        String subString = string.substring(n, n + m);
        System.out.println(subString);
        scanner.nextLine();
    }
    void countOccurence(){
        // read a text and count occurences of particular word
        System.out.println("read a text and count occurences of particular word\n");
        System.out.println("Enter the text");
        String loremString = scanner.nextLine();
        System.out.println("Enter the word to find");
        String toFind = scanner.next();
        String wordArr[] = loremString.split(" ");
        int count = 0;
        for (String word : wordArr)
            if (word.equalsIgnoreCase(toFind))
                count++;
        System.out.println("The word was found " + count + " times");
        scanner.nextLine();
        
    }
    void replaceSubString(){
        // replace substring in given string
        System.out.println("replace substring in given string\n");
        System.out.println("Enter the text ");
        String target = scanner.nextLine();
        System.out.println("Enter the string to be replaced and the string to replace it by");
        String toReplace = scanner.next();
        String replacement = scanner.next();
        String output = target.replace(toReplace, replacement);
        System.out.println(output);
    }
    void sortString(){
        // reARRANGE string in alphabetical order
        System.out.println("reARRANGE string in alphabetical order");
        System.out.println("Enter the string to sort");
        String toSortString = scanner.next();
        char[] CharArr = toSortString.toCharArray();
        Arrays.sort(CharArr);
        String sortedString = new String(CharArr);
        System.out.println(sortedString);
    }
    void compareStrings(){
        // COMPARE TWO STRINGS IGNORING CASE
        System.out.println("COMPARE TWO STRINGS IGNORING CASE");
        System.out.println("Enter two strings");
        String toCompString = scanner.next(), toCompString2 = scanner.next();
        String result = toCompString.compareToIgnoreCase(toCompString2) == 0 ? "same" : "not same";
        System.out.println("Strings are " + result);
    }
    void concatStrings(){
        // concat
        System.out.println("to concat two strings");
        System.out.println("Enter two strings");
        String cat = scanner.next(), concatString = scanner.next();
        cat = cat.concat(concatString);
        System.out.println("Concatted strings are " + cat);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        strings stringmanip=new strings();
        int CASE=10;
        while(CASE!=7){
            System.out.println("Enter the case \n1)extract sub string\n2)count Occurence\n3)replace sub string\n4)sort String\n5)compare strings\n6)concat Strings\n7)exit");
            CASE=sc.nextInt();
            if(CASE==1)
                stringmanip.extractSubString();
            else if (CASE==2)
                stringmanip.countOccurence();
            else if (CASE==3)
                stringmanip.replaceSubString();
            else if (CASE==4)
                stringmanip.sortString();
            else if (CASE==5)
                stringmanip.compareStrings();
            else if (CASE==6)
                stringmanip.concatStrings();
        }
        System.out.println("Exitted");
        sc.close();
        System.exit(0);;   
    }
}
