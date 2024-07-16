public class Element_Not_Appear_Twice {
    public static void main(String [] args) {

        int a[] = {1, 2, 3, 2,3};
        int ones = 0;
        for (int i = 0; i < a.length; i++) {
            ones = ones ^ a[i];

        }

        System.out.println("Element does not repeating twice be " +ones);
    }
}
