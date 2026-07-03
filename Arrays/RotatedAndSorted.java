public class RotatedAndSorted {
    public static boolean Check(int arr[]){

        int n=arr.length;
        int count=0;
        for (int i=1;i<n;i++){
            if(arr[i] > arr[(i+1)%n]){
              
                count++;
             }
            }
            return count<=1;
        }
          
        public static void main(String[] args) {
            int arr[]={3,4,5,1,2};
            System.out.println(Check(arr));

    }
    
}
