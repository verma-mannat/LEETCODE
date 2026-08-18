class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Build frequency count
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int n = nums.length / 2; // repeated element appears n times

        // Find the element with frequency == n
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) == n) {
                return key;
            }
        }
        return -1; // fallback (shouldn't happen)
    }
}
