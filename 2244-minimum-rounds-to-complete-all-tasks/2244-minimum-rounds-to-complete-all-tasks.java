class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> hmMap = new HashMap<>();
        for (int num : tasks) {
            hmMap.put(num, hmMap.getOrDefault(num, 0) + 1);
        }
        Iterator<Integer> it = hmMap.keySet().iterator();
        int ans = 0;
        while (it.hasNext()) {
            int key = it.next();
            int val = hmMap.get(key);
            if (val == 1) return -1;
            else if (val % 3 != 0  ) ans += val / 3 + 1;
            else ans += val / 3;
        }
        return (int) ans;
    }
}