import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

class RatanPrajapati_day76 {

    static boolean isPoss(int x, long[] arr, int k, int c) {
        ArrayList<ArrayList<Long>> list = new ArrayList<>();
        int cur = 0, n = arr.length;
        for (int i = 0; i < x; i++) {
            list.add(new ArrayList<Long>());
        }
        for (int i = 0; i < n; i++) {
            cur = cur % x;
            int sz = list.get(cur).size() - 1;
            if (sz < 0 || list.get(cur).get(sz) * c <= arr[i]) {
                list.get(cur).add(arr[i]);
                cur = (cur + 1) % x;
            }
        }
        if (list.get(x - 1).size() >= k)
            return true;

        return false;
    }

    static long divset(long[] arr, int k, int c) {
        int n = arr.length;
        int l = 1, r = n;// To avoid zero x
        int res = 0;
        Arrays.sort(arr);
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (isPoss(mid, arr, k, c)) {
                l = mid + 1;
                res = mid;
            } else
                r = mid - 1;
        }
        return res;
    }

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        StringBuffer str = new StringBuffer("");
        while (t-- > 0) {
            String s[] = bf.readLine().trim().split("\\s+");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);
            long arr[] = new long[n];
            s = bf.readLine().trim().split("\\s+");
            for (int i = 0; i < n; i++)
                arr[i] = Long.parseLong(s[i]);

            str.append(divset(arr, k, c) + "\n");
        }
        System.out.println(str);
    }
}