public class Smallest_Element_Of_Array {
    public static void main(String [] args){

        int a[] = new int[] {3,10,2,6,7,1,45,21} ;

        System.out.println("Elements of array be ") ;

        for(int i = 0 ; i<a.length ; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        //System.out.println("Smallest element of array be ");
        int small = a[0] ;
        for(int j = 0; j<a.length ; j++){
            if(a[j]<small){
                small = a[j] ;
            }
        }
        System.out.println("Smallest element of array be " + small) ;
    }
}
