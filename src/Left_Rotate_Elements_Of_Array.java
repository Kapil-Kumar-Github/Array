import java.util.Scanner;
public class Left_Rotate_Elements_Of_Array {
    public static void main(String [] args){

        int a [] = {1,2,3,4,5} ;

        System.out.println("Initial array be ") ;
        for(int i = 0 ; i<a.length ; i++){
            System.out.print(a[i] + " " ) ;
        }
        System.out.println() ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("To how many places you want to shift array ") ;

        int k = sc.nextInt() ;

        for(int i = 0 ; i<k ; i++){
            int first = a[0];
            for(int j = 0 ; j<a.length-1 ; j++){
                a[j] = a[j+1] ;

            }
            a[a.length-1] = first ;
        }

        System.out.println("Array after rotation be ") ;
        for(int i = 0 ; i<a.length ; i++){
            System.out.print(a[i] + " ") ;
        }

    }
}
