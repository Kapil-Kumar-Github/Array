public class Counting_Unique_elements_Of_Array {
    public static void main(String [] args){
        int a [] = {1,2,8,3,2,2,2,5,1,3} ;
        int freq[] = new int[a.length] ;

        int visited = 100 ;

        for(int i= 0 ; i<a.length ; i++){

            int count = 1;
            for(int j= i+1 ; j<a.length ; j++){

                if(a[i] == a[j]){
                    count++ ;
                    freq[j] = visited ;
                }

            }
            if(freq[i] != visited){
                freq[i] = count ;
            }
        }
        System.out.println("Array be ");
        for(int i = 0 ; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println() ;
        for(int i = 0; i<freq.length; i++){
            if(freq[i] != visited) {
                System.out.println("Element  " + a[i] +" | "+ freq[i] + " times");
            }
        }

    }
}
