public class Array_Elements_In_Reverse_Order {
    public static void main(String [] args){
        int a [] = {1,2,3,4,5} ;
        System.out.println("Array elements are ") ;
        for(int i = 0; i<a.length ;i++){
            System.out.print(a[i] + " ") ;
        }
        System.out.println() ;

        System.out.println("Array elements in reverse order are ");
        for(int i = a.length-1; i>=0 ; i--){
            System.out.print(a[i] + " ") ;
        }

    }
}
