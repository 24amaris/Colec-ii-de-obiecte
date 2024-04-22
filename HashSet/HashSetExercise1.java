import java.util.HashSet;
import java.util.Scanner;

public class HashSetExercise1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in); 
        String str= input.nextLine();
        str=str.toLowerCase();
        System.out.println(str);
        System.out.println(containsAllVowels(str));
        input.close();
    }

    public static boolean containsAllVowels (String str) {
        HashSet <Character> hs = new HashSet <Character> ();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');

        for(char ch:str.toCharArray()){
            if(hs.contains(ch))
                hs.remove(ch);
        }

      return hs.isEmpty();
    }

}