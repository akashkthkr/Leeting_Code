class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> hmMap = new HashMap<>();
        for (int num : tasks) {
            hmMap.put(num, hmMap.getOrDefault(num, 0) + 1);
        }
        Iterator<Integer> it = hmMap.keySet().iterator();
        int ans = 0;
        while (it.hasNext()) {
            int val = hmMap.get(it.next());
            if (val == 1) return -1;
            ans += val / 3;
            if (val % 3 != 0) ans++;
        }
        return (int) ans;
    }
}