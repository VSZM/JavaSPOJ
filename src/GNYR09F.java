import java.io.*;

/**
 * Created by vszm on 8/3/14.
 */
class GNYR09F {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[][] results = new long[101][91];

        results[0][0] = 1;
        results[1][0] = 2;

        for (int i = 2; i <= 100; i++)
            results[i][0] = results[i-1][0] + results[i-2][0];

        for (int i = 2; i <= 100 ; i++) {
            for (int j = 1; j <= 90 ; j++) {
                results[i][j] = results[i-1][j] + results[i-2][j]- results[i-2][j-1] + results[i-1][j-1] ;
            }
        }

        int caseCount = Integer.parseInt(br.readLine());
        while (caseCount-- > 0){
            String[] nums = br.readLine().split(" ");
            int  n = Integer.parseInt(nums[1]), k = Integer.parseInt(nums[2]);
            bw.write(nums[0] + " " + Long.toString(results[n][k]));
            bw.newLine();
        }

/*
        bw.write("row means bitlength n, column means target k\n\n");
        for (int i = 0; i <= 16; i++)
            bw.write("\t\t" +Integer.toString(i) );

        bw.newLine();

        for (int i = 0; i <= 16; i++) {
            bw.write(Integer.toString(i)+"\t\t");
            for (int j = 0; j <= 16; j++) {
                bw.write(Integer.toString(results[i][j])+"\t\t");
            }
            bw.newLine();
        }

        bw.write(Integer.toString(calculateAdjBC(20,8)));
  */      bw.flush();
    }

    private static int calculateAdjBC(int bitLength, int target) {
        int act, count = 0;

        for (act = 0; act < Math.pow(2, bitLength); ++act) {
            String binary = Integer.toBinaryString(act);
            int value = 0;

            for (int i = 1; i < binary.length(); ++i)
                if (binary.charAt(i) == '1' && binary.charAt(i - 1) == '1')
                    value++;

            if (value == target)
                count++;
        }

        return count;
    }
}
