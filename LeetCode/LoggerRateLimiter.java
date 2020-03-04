import java.util.HashMap;

public class LoggerRateLimiter {
    private HashMap<String, Integer> map;

    /** Initialize your data structure here. */
    public LoggerRateLimiter() {
        map = new HashMap<>();
    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
     If this method returns false, the message will not be printed.
     The timestamp is in seconds granularity. */
    // Time complexity: O(1)
    // Space complexity: O(M); M: number of messages received
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!map.containsKey(message)) {
            map.put(message, timestamp);
            return true;
        }
        if (timestamp - map.get(message) >= 10) {
            this.map.put(message, timestamp);
            return true;
        }
        return false;
    }
}
