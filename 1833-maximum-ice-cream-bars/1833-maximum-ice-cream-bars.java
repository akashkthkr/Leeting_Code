class Solution {
    public int maxIceCream(int[] costs, int coins) {
         Arrays.sort(costs);

        // Use IntStream to filter the costs array and sum the elements
        final int[] numCoins = new int[]{coins};

        // Use IntStream to filter the costs array and count the number of elements
        int numIceCreamBars = Math.toIntExact(Arrays.stream(costs)
                .filter(cost -> cost <= numCoins[0]) // Keep only costs that can be afforded
                .peek(cost -> numCoins[0] -= cost) // Decrement the number of coins by the cost of the ice cream bar
                .count()); // Count the elements of the stream

        return numIceCreamBars;
    }
}