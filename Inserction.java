public class Inserction {
    public static void main(String[] args) {
        int [] list = {7,8,3,1,2};

        //Inserction Sort
        //Timr Complexity:O(n^2)

        for(int i=1;i<list.length;i++){
            int current = list[i]; // picking first element of unsorted part
            int j =i-1; //for last index pf sorted part
            while(j >=0 && current<list[j]){ // condition run till all element of sorted are compared.
                list[j+1] =list[j]; // changing place of element
                j--; 
            }
            //placement
            list[j+1] = current; // palcing the element 

        }
        for(int ele : list){
            System.out.print(ele);
        }
    }

}
// By: Ayush Singla
