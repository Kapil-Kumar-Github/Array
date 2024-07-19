public class Second_Largest_Element_Of_Array {
    public static int second_largest_element(int a[]){
        int temp = 0;

        for(int i = 0; i<a.length ; i++){
            for(int j = i+1 ; j<a.length ; j++){
                if(a[i]<a[j]){
                    temp = a[i] ;
                    a[i] = a[j] ;
                    a[j] =  temp ;
                }
            }
        }
        return(a[1] );
    }

    public static void main(String [] args){
        int a[] = new int[] {3,2,4,1,7,9,8,18} ;
        System.out.println("Elements of array be ");
        for(int i = 0; i<a.length ; i++){
            System.out.print(a[i] + " ") ;
        }
        System.out.println() ;

        System.out.println("Second largest element of array be " +second_largest_element(a));

    }
}
