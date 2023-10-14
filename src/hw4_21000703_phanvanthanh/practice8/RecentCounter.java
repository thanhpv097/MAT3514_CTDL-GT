package hw4_21000703_phanvanthanh.practice8;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {

    Queue<Integer> q = new LinkedList<>();
    public RecentCounter() {
    }
    public int ping(int t) {
        q.add(t);
        int s = t-3000;
        while(q.peek() < s)
        {
            q.poll();
        }
        return q.size();
    }
}

