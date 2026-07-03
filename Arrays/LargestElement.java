
public class LargestElement {
    public static void main(String[]args){
    int arr[]={5,6,2,9,8};
    int larg=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>larg){
            larg=arr[i];
        }
    }
     System.out.println("largest element is: " + larg);
    
    
}

}
