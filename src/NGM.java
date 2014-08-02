import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by VSZM on 2014-08-01.
 */
 class NGM {
    private static final int Nikofor = 0;
    private static final int Trofim  = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int start =Integer.parseInt(br.readLine()), num = start;
        boolean isNikoforWinner = false;
        HashSet<Integer> winningNumbers = new HashSet<Integer>();

        while (num > 0){
            if(num%10 > 0 && (start-num%10)%10 == 0){
                isNikoforWinner = true;
                winningNumbers.add(num % 10);
            }
            num/=10;
        }



        Integer[] winningNums = winningNumbers.toArray(new Integer[winningNumbers.size()]);


        if (isNikoforWinner){
            bw.write("1");
            bw.newLine();
            bw.write(Integer.toString(winningNums[0]));

            for (int i = 1; i < winningNums.length; i++) {
                bw.write(" "+winningNums[i]);
            }
            bw.newLine();
        }else{
            bw.write("2");
            bw.newLine();
        }

        bw.flush();
    }

    private static int getWinner(int starting_player, int number){
        if (number == 0)
            return starting_player == Nikofor? Trofim : Nikofor;
        else
        {
            int num = number;
            while (num > 0){
                if(num%10 > 0 && getWinner(starting_player == Nikofor? Trofim : Nikofor,number-num%10) == starting_player)
                    return starting_player;
                num/=10;
            }

            return starting_player == Nikofor? Trofim : Nikofor;
        }
    }
}
