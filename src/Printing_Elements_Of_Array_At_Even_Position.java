public class Printing_Elements_Of_Array_At_Even_Position {

    public static void main(String [] args){
        int a [] = new int[] {1,2,3,4,5,6,7,8} ;

        System.out.println(a[2]) ;
        System.out.println("Elements of array be ") ;
        for(int i = 0 ; i<a.length ; i++){
            System.out.print(a[i] + " ") ;
        }
        System.out.println() ;


        System.out.println("Elements at even position be ") ;
        for(int i =0 ; i<a.length ; i++){

            if(i % 2 != 0){
                System.out.print(a[i] + " ") ;
            }
        }

    }
}
