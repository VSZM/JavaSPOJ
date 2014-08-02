import java.io.*;

public class ADDREV {

    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0)
        {
            String[] nums = br.readLine().split(" ");
            int a, b;
            a = decode(nums[0]);
            b = decode(nums[1]);

            bw.write(encode(a+b));
            bw.newLine();
        }
        br.close();
        bw.close();
    }*/

    public static int decode(String str)
    {
        int i = str.length();
        while (str.charAt(i-1) == '0' && i>0)
            --i;
        return Integer.parseInt(new StringBuilder(i==str.length() ? str : str.substring(0,i)).reverse().toString());
    }

    public static String encode(int number)
    {
        String ret = new StringBuilder(Integer.toString(number)).reverse().toString();
        int idx = 0;

        while(ret.charAt(idx) == '0' && idx < ret.length())
            ++idx;

        return ret.substring(idx);
    }
}
