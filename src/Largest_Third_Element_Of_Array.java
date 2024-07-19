public class Largest_Third_Element_Of_Array {
    public static int third_largest_Element(int a[]) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }


        }
        return (a[2]);
    }
    public static void main(String [] args){

        int a[] = new int[] {10,11,9,6};
        System.out.println("Elements of array be ") ;
        for(int i = 0; i<a.length ; i++){
            System.out.print(a[i] + " ") ;
        }
        System.out.println() ;
        System.out.println("Third largest element of array be " + third_largest_Element(a)) ;


    }
}
