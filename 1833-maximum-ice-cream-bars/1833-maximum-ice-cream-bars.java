class Solution {
    public int maxIceCream(int[] costs, int coins) {
      ArrayList<Integer> costVal = Arrays.stream(costs)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        Collections.sort(costVal);
        int noOfBars = 0;
        for (int i : costVal) {
            if (coins >= i) {
                coins -= i;
                noOfBars++;
            } else {
                return noOfBars;
            }
        }
        return noOfBars;  
    }
}