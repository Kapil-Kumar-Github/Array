public class Second_Smallest_Of_Array {

    public static void main(String [] args){

        int a[] = new int[] {3,4,5,2,1} ;

       int smallest  = a[0];
       int second_smallest = a[1];

       System.out.println("Elements of array be ") ;
       for(int i = 0; i<a.length ; i++){
           System.out.print(a[i] + " ") ;
       }

       for(int i = 1; i<a.length ; i++){

           if(a[i] < smallest){
               second_smallest = smallest ;
               smallest = a[i] ;

           }
       }
       System.out.println() ;
       //System.out.println("Smallest element of array be " + smallest) ;
       System.out.println("Second smallest element of array be " + second_smallest) ;

    }
}
