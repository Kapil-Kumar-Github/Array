import java.util.Scanner;
public class Rotate_Right_Elements_Of_Array {
    public static void main(String [] args){
        int a [] = new int[] {1,2,3,4,5} ;
        System.out.println("Elements  of array be ") ;
        for(int i = 0; i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println() ;
       // System.out.println("Array after right rotation") ;
        Scanner sc = new Scanner(System.in);
        System.out.println("To how many times you want to rotate array ");
        int k = sc.nextInt() ;

        for(int i = 0; i<k ; i++){

            int last = a[a.length-1];
            for(int j = 0; j<a.length-1 ; j++){
                a[a.length-j-1] = a[a.length-2-j];

            }
            a[0] = last ;
        }

        System.out.println("Array after " + k + " times right rotation be ") ;
        for(int i = 0; i<a.length ; i++){
            System.out.print(a[i] + " ") ;
        }

    }
}
