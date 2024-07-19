public class Sort_Elements_Of_Array_In_Descending_Order {
    public static void main(String [] args){
        int a [] = new int[] {1,2,4,3,5} ;
        System.out.println("Elements of array be ") ;
        for(int i = 0 ; i<a.length ; i++){
            System.out.print(a[i] + " ");
        }
        int temp = 0;
        for(int i = 0; i<a.length ; i++){
            for(int j = i+1; j<a.length ; j++){
                if(a[i]<a[j]){
                    temp = a[i] ;
                    a[i] = a[j] ;
                    a[j] = temp ;
                }
            }
        }
        System.out.println() ;
        System.out.println("Elements of array after sorting in descending order be ");

        for(int i = 0; i<a.length ; i++){
            System.out.print(a[i] + " ") ;
        }

    }
}
