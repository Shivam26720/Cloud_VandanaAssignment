
import java.util.*;


public class roman {
    public static void main(String[] args) {
     
        // create an object of scanner class to take input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roman value ");
        String inpString=sc.nextLine();
        roman obj=new roman();

        System.out.println("Integer of roman nuber " +obj.romanToInteger(inpString));


    }
    int standard(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
 
    // Finds Integer value of a
    // given roman numeral
    int romanToInteger(String str)
    {
        // Initialize result
        int result = 0;
 
        for (int i = 0; i < str.length(); i++)
        {
            // Getting value of symbol s[i]
            int s1 = standard(str.charAt(i));
 
            // Getting value of symbol s[i+1]
            if (i + 1 < str.length())
            {
                int s2 = standard(str.charAt(i + 1));
 
                // Comparing both values
                if (s1 >= s2)
                {
                    // Value of current symbol
                    result = result + s1;
                }
                else
                {
                    // Value of current symbol is less than the next symbol
                    result = result + s2 - s1;
                    i++;
                }
            }
            else
            {
                result = result + s1;
            }
        }
 
        return result;
    }
}
