import java.util.Arrays;

public class MoveZero {

public static void zeromove(int[] arr){
    int n=0;
    for(int i=0; i<arr.length;i++){
        if(arr[i]!=0 && arr[n]==0)
        {int temp=arr[i];
        arr[i]=arr[n];
        arr[n]=temp;}

        if(arr[n]!=0){n++;}
        
    }
   //  System.out.println(Arrays.toString(arr));

}

public static void main(String[] args) {
    int arr[]={1,0,5,0,6,8};
   zeromove(arr);
   System.out.println(Arrays.toString(arr));
    
}
    
}
