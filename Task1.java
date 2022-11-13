import java.util.Arrays;

public class Task1 {
    public static void main(java.lang.String[] args) {
        int[] n = new int[Integer.parseInt(args[0])];
        int m = Integer.parseInt(args[1]);
        for (int c = 0; c < n.length; c++) {
            n[c] = c + 1;
        }
        int[] n1 = new int[n.length * m];
        for (int k = 0; k < n1.length; k += n.length) {
            System.arraycopy(n, 0, n1, k, n.length);
        }
        int[] a = new int[n1.length];
        int index = 0;
        for (int j = 0; j < n1.length; ) {
            a[index] = n1[j];
            j = j + m - 1;
            index++;
        }
        int[] shortList = Arrays.stream(a).distinct().toArray();
        int[] withoutZero = Arrays.stream(shortList).filter(x -> x != 0).toArray();
        StringBuilder builder = new StringBuilder();
        for (int value : withoutZero) {
            builder.append(value);
        }
        String text = builder.toString();
        System.out.println(text);
    }
}
