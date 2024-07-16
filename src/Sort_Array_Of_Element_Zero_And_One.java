public class Sort_Array_Of_Element_Zero_And_One {
    public static void main(String [] args){
        int a[] = {1,0,1,0,0,1,0,0,1,0} ;
        int b [] = new int[a.length] ;
        int first=0,last = 0;
        for(int i = 0; i<a.length ; i++){

            if(a[i] == 0){
                b[first] = a[i] ;
                first++ ;

            }
            else{
                b[a.length-1-last] = a[i] ;
                last ++ ;
            }

        }

        System.out.println("Sorted array be " );
         for(int i= 0 ; i<a.length ; i++){
             System.out.print(b[i] + " ") ;
         }

    }
}
