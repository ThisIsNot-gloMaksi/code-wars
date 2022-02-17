package twicelinear;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

class DoubleLinear {
    public static int dblLinear (int n) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);

        for (int i = 0; i < n; i++) {
            int x = set.pollFirst();
            set.add(x * 2 +1);
            set.add(x * 3 +1);
        }
        return set.pollFirst();
    }
}
