public class Largest_Element_Of_Array {
    public static void main(String [] args){
        int a[] = new int[] {1,2,8,4,95} ;
        int larg= 0;

        for(int i = 0; i<a.length;i++){
            if(a[i] > larg){
                larg = a[i] ;
            }

        }
        System.out.println("Largest element of array be " + larg) ;
    }
}
