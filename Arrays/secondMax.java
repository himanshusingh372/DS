public class secondMax {

    public static int Maxsecond(int[] arr){
        int Max=arr[0];
        int secondMax=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>Max){
                secondMax=Max;
                Max=arr[i];
            }else if(arr[i]>secondMax && arr[i]!=Max){
                secondMax=arr[i];
            }
        }
return secondMax;
    }
    public static void main(String[] args) {
        // secondMax sm =new secondMax();
        int arr[]= {-5,10,23,15,2,6,33,65,65,8};
        int secondMax=Maxsecond(arr);
        System.out.println(secondMax);
        System.out.println(Integer.MAX_VALUE);
    }
    
}
