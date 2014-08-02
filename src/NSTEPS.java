import java.io.*;

/**
 * Created by VSZM on 2014-08-02.
 */
class NSTEPS {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseCount = Integer.parseInt(br.readLine());

        while (caseCount-- > 0){
            String[] nums = br.readLine().split(" ");
            int x = Integer.parseInt(nums[0]), y = Integer.parseInt(nums[1]);

            if(x == y){
                if(x%2 == 0)
                    bw.write(Integer.toString(x+y));
                else
                    bw.write(Integer.toString(x+x-1));
            }else if(x -2  == y){
                if(x%2 == 0)
                    bw.write(Integer.toString(x+x-2));
                else
                    bw.write(Integer.toString(x+y-1));
            }else
                bw.write("No Number");

            bw.newLine();
        }


        bw.flush();
    }
}
