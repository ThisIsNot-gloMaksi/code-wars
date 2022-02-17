package numbyfactors;

import java.util.ArrayList;
import java.util.List;

public class SumOfDivided {
    public static String sumOfDivided(int[] l) {
        List<int[]> arr = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < l.length; i++) {
            if (Math.abs(l[i]) > max) {
                max = l[i];
            }
        }

        for(int i = 2; i < Math.abs(max); i++) {
            if (prime(i)) {
                int result = 0;
                boolean flag = false;
                for (int j = 0; j < l.length; j++) {
                    if (l[j] % i == 0) {
                        flag = true;
                        result += l[j];
                    }
                }
                if (flag) {
                    arr.add(new int[]{i, result});
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        arr.forEach(item -> {
            builder.append("(").append(item[0]).append(" ").append(item[1]).append(")");
        });
        return builder.toString();
    }

    private static boolean prime(int n){
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

}
