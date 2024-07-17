public class Print_Duplicate_Elements_Of_Array {
    public static void main(String [] args){

        int a [] = {1,2,3,2,3,5,4,4,2} ;
        System.out.println("Elements of array be ");
        for(int i = 0; i<a.length ; i++){
            System.out.print(a[i] + " ") ;
        }
        System.out.println() ;
        System.out.println("Duplicate of elements of array be ") ;
        int visited = -1 ;
        for(int i = 0 ; i<a.length ; i++){
            int count = 1 ;
            for(int j = i+1 ; j<a.length ;j++){
                if(a[j] ==a[i]){
                    count ++ ;
                    a[j] = visited ;
                }

            }
            if(count>1 && a[i] != visited){
                System.out.print(a[i] + " ");

            }
        }
    }
}
