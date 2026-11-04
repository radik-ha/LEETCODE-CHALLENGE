
import java.util.*;

class Solution {

    class SlidingMedian {

        TreeMap<Integer, Integer> low = new TreeMap<>();
        TreeMap<Integer, Integer> high = new TreeMap<>();

        int lowSize = 0;
        int highSize = 0;

        long lowSum = 0;
        long highSum = 0;

        void addToLow(int num) {
            low.put(num, low.getOrDefault(num, 0) + 1);
            lowSize++;
            lowSum += num;
        }

        void addToHigh(int num) {
            high.put(num, high.getOrDefault(num, 0) + 1);
            highSize++;
            highSum += num;
        }

        void removeFromLow(int num) {
            int count = low.get(num);

            if (count == 1) {
                low.remove(num);
            } else {
                low.put(num, count - 1);
            }

            lowSize--;
            lowSum -= num;
        }

        void removeFromHigh(int num) {
            int count = high.get(num);

            if (count == 1) {
                high.remove(num);
            } else {
                high.put(num, count - 1);
            }

            highSize--;
            highSum -= num;
        }

        void rebalance() {

            int requiredLow = (lowSize + highSize + 1) / 2;

            while (lowSize > requiredLow) {
                int num = low.lastKey();

                removeFromLow(num);
                addToHigh(num);
            }

            while (lowSize < requiredLow) {
                int num = high.firstKey();

                removeFromHigh(num);
                addToLow(num);
            }
        }

        void add(int num) {

            if (low.isEmpty() || num <= low.lastKey()) {
                addToLow(num);
            } else {
                addToHigh(num);
            }

            rebalance();
        }

        void remove(int num) {

            if (low.containsKey(num)) {
                removeFromLow(num);
            } else {
                removeFromHigh(num);
            }

            rebalance();
        }

        long getCost() {

            int median = low.lastKey();

            long leftCost = (long) median * lowSize - lowSum;

            long rightCost = highSum - (long) median * highSize;

            return leftCost + rightCost;
        }
    }

    public long minOperations(int[] nums, int x, int k) {

        int n = nums.length;

        long[] cost = new long[n - x + 1];

        SlidingMedian sm = new SlidingMedian();

        for (int i = 0; i < x; i++) {
            sm.add(nums[i]);
        }

        cost[0] = sm.getCost();

        // Remaining windows
        for (int i = x; i < n; i++) {

            sm.remove(nums[i - x]);

            sm.add(nums[i]);

            cost[i - x + 1] = sm.getCost();
        }
        long INF = Long.MAX_VALUE / 4;

        long[][] dp = new long[k + 1][n + 1];

        for (int j = 0; j <= k; j++) {
            Arrays.fill(dp[j], INF);
        }
        for (int i = 0; i <= n; i++) {
            dp[0][i] = 0;
        }

        for (int j = 1; j <= k; j++) {
            for (int i = 1; i <= n; i++) {
                dp[j][i] = dp[j][i - 1];
                if (i >= x && dp[j - 1][i - x] != INF) {

                    long take = dp[j - 1][i - x]
                                + cost[i - x];

                    dp[j][i] = Math.min(dp[j][i], take);
                }
            }
        }

        return dp[k][n];
    }
}
