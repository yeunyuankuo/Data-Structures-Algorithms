public class MovingAverageFromDataStream {
    /**
     * Initialize your data structure here.
     */
    private int size;
    private Queue<Integer> q;
    private int sum;

    // Time complexity: O(1)
    // Space complexity: O(N)
    public MovingAverage(int size) {
        this.size = size;
        q = new LinkedList<Integer>();
        sum = 0;
    }

    public double next(int val) {
        if (q.size() >= size) {
            sum -= q.poll();
        }
        q.add(val);
        sum += val;
        return (double) sum / Math.min(q.size(), size);
    }
}
