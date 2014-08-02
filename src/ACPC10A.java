import java.io.*;

/**
 * Created by VSZM on 2014-07-30.
 */
class ACPC10A {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (!(line = br.readLine()).equals("0 0 0")) {
            String[] nums = line.split(" ");
            int A = Integer.parseInt(nums[0]), B = Integer.parseInt(nums[1]), C = Integer.parseInt(nums[2]);
            boolean is_ap;

            if (C - B == B - A)
                is_ap = true;
            else
                is_ap = false;

            if (is_ap)
                bw.write("AP "+(C+C-B));
            else
                bw.write("GP "+(C*C/B));

            bw.newLine();
        }

        bw.flush();
    }

}
