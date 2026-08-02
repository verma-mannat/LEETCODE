class Solution {
    public int sumOfUnique(int[] nums) {
        //freq count se ho sakta h ? jis num ki freq 1 uska sum?//oki
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        return sum;
    }
}