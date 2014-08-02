import java.io.*;
import java.math.BigInteger;

public class FCTRL2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int case_count = Integer.parseInt(br.readLine());

        BigInteger[] fact = new BigInteger[101];
        fact[0] = new BigInteger("1");

        for (int i = 1; i < 101; i++) {
            fact[i] = fact[i-1].multiply(new BigInteger(Integer.toString(i)));
        }


        while (case_count-- > 0)
        {
            bw.write(fact[Integer.parseInt(br.readLine())].toString());
            bw.newLine();
        }


        br.close();
        bw.close();
    }

}
