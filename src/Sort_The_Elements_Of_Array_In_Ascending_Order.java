public class Sort_The_Elements_Of_Array_In_Ascending_Order {

    public static void main(String [] args){
        int a [] = new int[] {5,4,12,3,1} ;

        System.out.println("Elements of array be ") ;
        for(int i = 0 ; i<a.length ; i++){
            System.out.print(a[i] + " ");
        }

        int temp = 0;
        for(int i = 0 ; i<a.length ; i++){

            for(int j = i+1 ; j<a.length ; j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j] ;
                    a[j] = temp ;

                }
            }
        }
        System.out.println("Elements of Array after sorting in ascending order be ");

        for(int i = 0; i<a.length ; i++){
            System.out.print(a[i] + " ") ;
        }
    }
}
