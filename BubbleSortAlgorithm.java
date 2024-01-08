public class BubbleSortAlgorithm {

    public static void main(String[] args) {

        int[] vect = {6, 5, 3, 1, 8, 7, 2, 4};

        System.out.println("Unordered array ");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }

        for (int i = 0; i < vect.length; i++) {
            for (int j = i + 1; j<vect.length; j++) {
                if (vect[j] < vect[i]) {
                    int aux = vect[i];
                    vect[i] = vect[j];
                    vect[j] = aux;
                }
            }
        }
        System.out.print("\n\n");
        System.out.println("Ordered array");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }
    }
}
