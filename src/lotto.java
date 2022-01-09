import java.util.Arrays;

public class lotto {
    public static void main(String[] args) {

        int lotto[] = new int[6];

        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + "줄 : [ ");

            for (int j = 0; j <= 5; j++) {
                lotto[j] = (int) (Math.random() * 45 + 1);
            }

            Arrays.sort(lotto);

            for (int k = 1; k <= 5; k++) {

                if (lotto[k - 1] == lotto[k]) {

                    lotto[k] += 1;
                }
                System.out.print(lotto[k - 1]);

                if (k != 5) {
                    System.out.print(", ");
                } else {
                    System.out.println(", " + lotto[k] + " ]");
                }
            }
        }
    }

}

