
//import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
      int [] list = {7,8,3,1,2};


       // bubble Sort
       // Time Complexity : O(n^2)
       for(int i=0;i<list.length-1;i++){ // loop for picking element from list
        for(int j=0;j<list.length-i-1;j++){// loop for comparing an element with other
            if(list[j]>list[j+1]){ // for changing the element index
                int temp =list[j];
                list[j] = list[j+1];
                list[j+1] = temp;
            }
            
        }
       }
      for(int ele:list){
        System.out.print(ele+" ");
      }
     
    
    }

    }
    //By: Ayush Singla



