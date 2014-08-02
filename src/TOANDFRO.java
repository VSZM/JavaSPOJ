import java.io.*;

/**
 * Created by VSZM on 2014-07-30.
 */
class TOANDFRO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;

        while ( !(line= br.readLine()).equals("0")){
            String msg = br.readLine();
            int cols = Integer.parseInt(line), rows = msg.length()/cols;
            StringBuilder sb = new StringBuilder();


            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < rows; j++) {
                    int idx =j%2 == 0 ? j*cols + i : j * cols + cols - i - 1;
                    sb.append(msg.charAt(idx));
                }
            }

            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
    }

}
