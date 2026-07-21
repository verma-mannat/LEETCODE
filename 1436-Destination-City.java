class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();

        for (List<String> pair : paths) {
            map.put(pair.get(0), pair.get(1));
        }

        for (String value : map.values()) {
            if (!map.containsKey(value)) {
                return value; // directly return destination city
            }
        }
        return "";
    }
}
