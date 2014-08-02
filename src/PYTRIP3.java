import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by VSZM on 2014-08-02.
 */
class PYTRIP3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Long> aQueue = new LinkedList<Long>();
        Queue<Long> bQueue = new LinkedList<Long>();
        Queue<Long> cQueue = new LinkedList<Long>();

        aQueue.add(3L);
        bQueue.add(4L);
        cQueue.add(5L);


        long N = Long.parseLong(br.readLine());
        long result = 0;


        while (!cQueue.isEmpty()) {
            long a = aQueue.remove(), b = bQueue.remove(), c = cQueue.remove(), newc;

            result += N / c;

/*T1: 	a − 2b + 2c 	2a − b + 2c 	2a − 2b + 3c
T2: 	a + 2b + 2c 	2a + b + 2c 	2a + 2b + 3c
T3: 	−a + 2b + 2c 	−2a + b + 2c 	−2a + 2b + 3c*/
            if ((newc = 2 * a - 2 * b + 3 * c) <= N) {
                aQueue.add(a - 2 * b + 2 * c);
                bQueue.add(2 * a - b + 2 * c);
                cQueue.add(newc);
            }
            if ((newc = 2 * a + 2 * b + 3 * c) <= N) {
                aQueue.add(a + 2 * b + 2 * c);
                bQueue.add(2 * a + b + 2 * c);
                cQueue.add(newc);
            }
            if ((newc = 2 * b + 3 * c - 2 * a) <= N) {
                aQueue.add(2 * b + 2 * c - a);
                bQueue.add(b + 2 * c - 2 * a);
                cQueue.add(newc);
            }
        }


        bw.write(Long.toString(result));
        bw.newLine();

        bw.flush();
    }
}
