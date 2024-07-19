public class Odd_And_Even_Elements_Of_Array {

    public static void main(String [] args){

        int a[] = new int[] {1,2,3,4,6,13};

        System.out.println("Elements of array are ") ;

        for(int i = 0 ;i<a.length ; i++){
            System.out.print(a[i] + " ") ;
        }
        System.out.println() ;
        System.out.println("Even elements of array are ") ;
        for(int i = 0 ; i<a.length ; i++){
            if(a[i] %2 == 0){
                System.out.print(a[i] + " ") ;
            }
        }

        System.out.println() ;
        System.out.println("Odd elements of array are ") ;

        for(int i = 0; i<a.length ; i++){
            if(a[i]% 2 != 0){
                System.out.print(a[i] + " ") ;
            }
        }

    }
}
