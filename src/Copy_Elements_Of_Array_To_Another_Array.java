public class Copy_Elements_Of_Array_To_Another_Array {
    public static void main(String [] args){
        int a [] = {1,2,3,4,5} ;
        System.out.println("Array a be ") ;
        for(int i= 0 ; i<a.length;i++){
            System.out.print(a[i] + " ") ;
        }
        int b[] = new int[a.length] ;
        for(int i = 0 ;i<a.length ; i++){
            b[i] = a[i] ;
        }
        System.out.println() ;
        System.out.println("Array b be ");
        for(int i= 0 ; i<b.length ; i++){
            System.out.print(b[i] + " ") ;
        }

    }
}
