public class Sum_Of_All_Elements_Of_Array {
    public static void main(String [] args){
        int a [] = new int[] {1,2,3,1,4,5} ;
        System.out.println("Elements of array be ") ;
        for(int i = 0 ; i<a.length ;i++){
            System.out.print(a[i] + " ") ;
        }
        int sum = 0 ;
        for(int i = 0 ; i<a.length ; i++){
            sum = sum + a[i] ;
        }
        System.out.println() ;
        System.out.println("Sum of all elements of array be " + sum) ;
    }
}
