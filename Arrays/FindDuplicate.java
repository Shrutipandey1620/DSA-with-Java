import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        
     int arr[]={2,5,3,2,5,8};
     HashSet<Integer> set=new HashSet<>();
     HashSet<Integer> dupli=new HashSet<>();
     
     for(int nums: arr){
        if(set.contains(nums)){
           dupli.add(nums);
        }
        set.add(nums);
     }  
     System.out.println(dupli);
       
}}
