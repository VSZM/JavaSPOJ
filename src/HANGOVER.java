import java.io.*;

/**
 * Created by VSZM on 2014-07-30.
 */
class HANGOVER {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] cardLengths = new double[300];

        cardLengths[0] = cardLengths[1] = 0;


        for (int i = 2; i < 300; i++) {
            cardLengths[i] = cardLengths[i-1] + 1.0/i;
        }

        String line;
        while(!(line = br.readLine()).equals("0.00")){
            double target = Double.parseDouble(line);
            int idx = 0;
            while (cardLengths[idx++] < target);

            bw.write(Integer.toString(idx-2)+" card(s)");
            bw.newLine();
        }

        bw.flush();
    }
}
