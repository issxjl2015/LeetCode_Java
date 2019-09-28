package DataStructureBasic.queueBasic;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    // store elements
    private List<Integer> data;
    // a pointer to indicate the start position
    private int p_start;
    public MyQueue() {
        data = new ArrayList<Integer>();
        p_start = 0;
    }

    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }

    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        p_start++;
        return true;
    }

    public int Front() {
        return data.get(p_start);
    }

    public boolean isEmpty() {
        return p_start >= data.size();
    }
}
