public class DiziHarmonikOrt {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double harmonic;
        float sum = 0;
        for (int j : array) {
            sum += 1.0/j;
        }
        harmonic =array.length/ sum;

        System.out.println("Harmonik ortalama = " + harmonic);
    }
}

