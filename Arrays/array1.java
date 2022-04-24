public class array1 {

    public void arrayprint(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public int[] removeEven(int[] arr){
        int n=arr.length;
       // System.out.println(n);
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i]%2!=0) count++;
        }
       // System.out.println(count);System.out.println();
        int[] result=new int[count];
        int a=0;
        for(int j=0; j<n; j++){
            if(arr[j]%2!=0){ result[a]=arr[j]; a++;}
           // System.out.println(arr[j]%2);
        }
        return result;
    }

    public void reverseArray(int [] arr){
        int start=0; int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
    public int[] arraydemo(){
        int [] myar=new int[8];
        myar[0]=5;
        myar[1]=1;
        myar[2]=8;
        myar[3]=2;
        myar[4]=10;
        myar[5]=15;
        myar[6]=21;
        myar[7]=7;
        return myar;
    }

    public static void main(String[] args) {
        array1 ar=new array1();
       // ar.arrayprint(ar.arraydemo());
    // //    System.out.println();
    // //     int[] arr1=ar.removeEven(ar.arraydemo());
    //     ar.arrayprint(arr1);
    int[] array={1,2,3,4,5,6,7,8};
    ar.arrayprint(array);
        ar.reverseArray(array);
        ar.arrayprint(array);;
        
    }
    
}
