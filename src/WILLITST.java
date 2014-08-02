import java.io.*;
import java.util.ArrayList;

/**
 * Created by VSZM on 2014-08-02.
 */
class WILLITST {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        if(isPowerOfTwo( Long.parseLong(br.readLine())))
            bw.write("TAK");
        else
            bw.write("NIE");

        bw.newLine();
        bw.flush();
    }

    private static boolean isPowerOfTwo(long number){

        while (number > 1){
            if(number%2 == 0)
                number /= 2;
            else return  false;
        }
        return  true;
    }
}
