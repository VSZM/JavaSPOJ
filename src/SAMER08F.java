import java.io.*;

/**
 * Created by VSZM on 2014-07-29.
 */
class SAMER08F {
    public static void main(String[] args) throws IOException {
        long[] lookup = new long[101];
        lookup[0] = 0;
        for (int i = 1; i < 101; ++i)
            lookup[i] = lookup[i-1] + i*i;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;

        while(!(line = br.readLine()).equals("0")){
            bw.write(Long.toString(lookup[Integer.parseInt(line)]));
            bw.newLine();
        }

        bw.flush();
    }

}
