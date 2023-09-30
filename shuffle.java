
import java.util.*;

public class shuffle{
    public static void main(String[] args) {
        // create an array with value {1,2,3,4,5,6,7} and shuffle it task
        int arr[]={1,2,3,4,5,6,7};
       
        //create a obj of this class to call shuffle_it function
        shuffle obj=new shuffle();
        // calling function
         obj.shuffle_it(arr);
       
 
    }

    public void shuffle_it(int arr[]){
     Random random = new Random();
     for (int i = arr.length - 1; i > 0; i--)
     {
        int index = random.nextInt(i + 1);
      int temp = arr[index];
         arr[index] = arr[i];
         arr[i] = temp;
     
    }
 for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
   
}


}