public class Element_Does_Not_Appear_Thrice {
    static int checkbit(int N,int k) {
        return ((N >>k)&1);
    }
    public static void main(String [] args){

          //System.out.println(4>>2) ;
        int ans = 0 ;
        int a[] = {5,5,3,20,5,3,3} ;
        for(int i=0 ; i<31 ; i++){
            int count = 0;
             for(int j=0 ; j<a.length;j++) {
                 if (checkbit(a[j], i) == 1) {
                     count++;


                 }
             }
                 if(count % 3==1){
                     ans = ans |(1<<i) ;
                 }



        }
        System.out.println(ans) ;





    }
}
