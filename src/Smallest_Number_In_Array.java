public class Smallest_Number_In_Array {
    public static void main(String [] args){

        int a[] = new int[] {10,2,3,1,32,12,56} ;

        System.out.println("Elements of array be " ) ;

        for(int i =0 ; i<a.length ; i++){
            System.out.print(a[i] + " ") ;
        }
        System.out.println() ;

        int smallest = a[0] ;

        for(int i = 1; i<a.length ; i++){
            if(a[i]<smallest){
                smallest = a[i] ;

            }
        }
        System.out.println("Smallest element in array be " + smallest) ;
    }
}
