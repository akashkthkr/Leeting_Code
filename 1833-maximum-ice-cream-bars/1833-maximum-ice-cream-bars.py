class Solution:
    def maxIceCream(self, costs: List[int], coins: int) -> int:
        costs.sort()
        noOfBars = 0
        for cost in costs:
            if (cost > coins): 
                break
            coins -= cost
            noOfBars += 1
        return noOfBars