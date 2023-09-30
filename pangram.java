
import java.util.*;

public class pangram {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String value ");
        String inpString=sc.nextLine();
      pangram obj=new pangram();
      System.out.println("Is it pangram " + obj.pangram_valid(inpString));
    }


    static boolean pangram_valid(String str) {
        Set<Character> set = new HashSet<>();
 
        for (char ch : str.toCharArray()) {
           
            if (ch >= 'a' && ch <= 'z')
                set.add(ch);
 
        
            if (ch >= 'A' && ch <= 'Z') {
    
                ch = Character.toLowerCase(ch);
                set.add(ch);
            }
        }
 
        return set.size() == 26;
    }
}
