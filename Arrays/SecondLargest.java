<<<<<<< HEAD

=======
package Arrays;

public class SecondLargest {
    public static int findSl(int l,int sl, int arr[]){

    for(int i=0;i<arr.length;i++){
        if(arr[i]>l){
            sl=l;
            l=arr[i];
        }
    }
    return sl;
}

public static void main(String[] args) {
    int arr[]={2,5,3,6,6};
    int l=0;
    int sl=-1;
    System.out.println(findSl(sl,l,arr));
}
}
>>>>>>> 4ba7f69 (Add SecondLargest solution)
