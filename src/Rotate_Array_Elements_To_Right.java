import java.util.Scanner;
public class Rotate_Array_Elements_To_Right {
    public static void main(String [] args){

        int a [] = {1,2,3,4,5,6,7,8} ;
        System.out.println("Array be ") ;
        for(int i = 0 ; i<a.length ;i++){
            System.out.print(a[i] + " ") ;
        }
        System.out.println() ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("To how many places you want to shift array ");
        int k = sc.nextInt() ;
        for(int i =  0 ; i<k ; i++){
            int last = a[a.length-1] ;
            for(int j = 0 ; j<=(a.length-2) ; j++){
                a[a.length-1-j] = a[a.length-2-j] ;
            }
            a[0] = last ;
        }

        System.out.println("Array after " + k + "rotation be") ;
        for(int i = 0 ; i<a.length ; i++){
            System.out.print(a[i] + " ") ;
        }


    }

}
