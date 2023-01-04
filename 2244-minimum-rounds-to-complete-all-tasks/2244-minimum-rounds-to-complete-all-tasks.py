class Solution:
    def minimumRounds(self, tasks: List[int]) -> int:
        sorted(tasks)
        mp = {};
        ans = 0
        for val in tasks:
            if val not in mp:
                mp[val] = 0;
            mp[val] += 1;
        for key, val in mp.items():
            if (val == 1): return -1;
            ans += math.ceil(val/3)
        return ans;
        
        