package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class NumberOfRecentCalls {
    private Queue<Integer> calls;

    public RecentCounter() {
        calls = new LinkedList<>();
    }

    public int ping(int t) {
        calls.add(t);
        while(t - calls.peek() > 3000) {
            calls.poll();
        }
        return calls.size();
    }
}
