public class Removing_Duplicate_Element_From_Array {
    public static void main(String [] args){

        int a[] = new int[] {1,2,1,3,1,2,3,4,5,6,1,4} ;
        int arr1[] = new int[a.length] ;
        int count ;
        int index =0;

        System.out.println("Elements of array be ") ;
        for(int i = 0; i<a.length ; i++){
            System.out.print(a[i] + " ") ;
        }

        for(int i = 0 ; i<a.length ; i++){
            count = 0 ;
           // index = 0 ;
            for(int j=i+1 ; j<a.length ; j++){

                if(a[i] == a[j]){
                    count++ ;

                }
            }
            if(count == 0){
                arr1[index] = a[i] ;
                index++ ;
            }
        }
        System.out.println();

        System.out.println("Elements of array after removing duplicate elements ") ;



        for(int i = 0; i<index ; i++){
            System.out.print(arr1[i] + " ") ;
        }




    }
}
