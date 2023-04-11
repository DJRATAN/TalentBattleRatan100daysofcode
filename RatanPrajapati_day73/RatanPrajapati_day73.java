import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RatanPrajapati_day73 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        int m = 0;
        char[] c;
        while (T-- > 0) {
            m = Integer.parseInt(in.readLine());
            c = in.readLine().trim().toCharArray();
            int[] charCounter = new int[30];
            int longest = 0;
            char lastChar = c[0];
            int currLength = 1;
            for (int i = 1; i < c.length; i++) {
                if (c[i] == lastChar) {
                    currLength++;
                } else {
                    if (currLength >= charCounter[lastChar - 'a']) {
                        if (currLength > longest) {
                            if (currLength > charCounter[lastChar - 'a'] + 1) {
                                longest = currLength - 1;
                            } else {
                                longest = charCounter[lastChar - 'a'];
                            }
                        }
                        charCounter[lastChar - 'a'] = currLength;
                    }
                    lastChar = c[i];
                    currLength = 1;
                }

                if (i == (c.length - 1) && currLength > longest) {
                    if (currLength == c.length) {
                        longest = currLength - 1;
                    } else if (currLength >= charCounter[lastChar - 'a']) {
                        if (currLength > charCounter[lastChar - 'a'] + 1) {
                            longest = currLength - 1;
                        } else {
                            longest = charCounter[lastChar - 'a'];
                        }
                    }
                }
            }
            System.out.println(longest);
        }
    }
}