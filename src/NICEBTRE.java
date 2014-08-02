import java.io.*;
import java.util.Stack;

/**
 * Created by VSZM on 2014-07-29.
 */
class NICEBTRE {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseCount = Integer.parseInt(br.readLine());

        while (caseCount-- > 0) {
                Stack<Integer> stack = new Stack<Integer>();
                int maxDepth = 0;
                boolean isLeft = false;
                stack.push(0);

                String tree = br.readLine();

                for (int i = 0; i < tree.length(); i++) {
                    if (isLeft) {
                        if (tree.charAt(i) == 'n')
                            stack.push(stack.peek() + 1);
                        else
                            isLeft = false;
                    } else {
                        if (tree.charAt(i) == 'n') {
                            stack.push(stack.peek() + 1);
                            isLeft = true;
                        } else
                            stack.pop();
                    }

                    if (!stack.isEmpty() && stack.peek() > maxDepth)
                        maxDepth = stack.peek();
                }

                bw.write(Integer.toString(maxDepth));
                bw.newLine();
        }
        
        bw.flush();
    }
}
