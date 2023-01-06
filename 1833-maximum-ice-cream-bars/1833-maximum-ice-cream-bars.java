class Solution {
    public int maxIceCream(int[] costs, int coins) {
         Arrays.sort(costs);

        final int[] numCoins = new int[]{coins};

        int numIceCreamBars = Math.toIntExact(Arrays.stream(costs)
                .filter(cost -> cost <= numCoins[0])
                .peek(cost -> numCoins[0] -= cost) 
                .count()); 

        return numIceCreamBars;
    }
}