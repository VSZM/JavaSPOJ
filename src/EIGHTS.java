import java.io.*;

/**
 * Created by VSZM on 2014-08-02.
 */
class EIGHTS {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] lastThreeDigits = new int[]{192,442,692,942};
        int caseCount = Integer.parseInt(br.readLine());
        while (caseCount-- > 0){
            long k =Long.parseLong(br.readLine());
            long result = lastThreeDigits[(int)( (k-1) % 4)] + 1000 * ((k-1)/4);
            bw.write(Long.toString(result));
            bw.newLine();
        }

        bw.flush();
    }
}
