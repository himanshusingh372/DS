public class test{
    public int first(int x,int y){
        int z=x;

        for(int i=0; i<y; i++){
            z=z+1;
        } return z;
    }

    public int second(int x,int y){
        int z=x;
        for(int i=0; i<y; i++){
            z+=1;
        } return first(z,y);
    }


     int foo( int a,int b){
        if(a>0) return (a%b +foo(a/b,b));
        else return 0;
    }

    static int mistry(int a,int b){
        if(a==0)
        return 0;
        if(b%2==0)
        return mistry(a/10, b+1)*10+a%10;
        else
        return mistry(a/10, b+1);
    }

    public static void metod37(int mun){
        int a=mun;
        int count=0;
        int j=0;
        while(a>0){
            a=a/10;
            count++;
        }
        for(j=0;j<count/2;j++){
            mun=mun/10;

        }System.out.println(mun%10);
    }
    public static void main(String[] args) {
        test l=new test();
        metod37(14679);

        System.out.println();
    }
}
    