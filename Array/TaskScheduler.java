package Array;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        // Time complexity = O(N)
        // Space complexity = O(1)
        int[] map = new int[26];
        for (char ch: tasks) {
            map[ch - 'A']++;
        }
        Arrays.sort(map);
        int max_vertical_slots = map[25] - 1;
        int idle_slot = max_vertical_slots * n;
        for (int i = 24; i >= 0 && map[i] > 0; i--) {
            idle_slot -= Math.min(map[i], max_vertical_slots);
        }
        return idle_slot > 0 ? idle_slot + tasks.length : tasks.length;
    }
}
