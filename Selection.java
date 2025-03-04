public class Selection {
    public static void main(String[] args) {
        
        int [] list = {7,8,3,1,2};

        //Selection Sort
        // Time Complexity : O(n^2)
        
        for(int i=0;i<list.length;i++){ // for picking element
            int smallest =i; // picking first element

            for(int j=i+1;j<list.length;j++){ 
                if(list[smallest]>list[j]){ // for comparing elemnts
                    smallest =j;
                }
            }
            int temp = list[smallest];
            list[smallest] = list[i];
            list[i]= temp;

        }
        for(int ele: list){
            System.out.print(ele+" ");
        }
    }

}
// By: Ayush Singla
