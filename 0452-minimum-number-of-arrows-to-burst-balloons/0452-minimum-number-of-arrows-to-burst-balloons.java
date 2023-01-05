class Solution {
    public int findMinArrowShots(int[][] points) {
        ArrayList<Pair<Integer, Integer>> pointsList = (ArrayList<Pair<Integer, Integer>>) Arrays.stream(points)
                .map(point -> new Pair<>(point[0], point[1]))
                .collect(Collectors.toList());

        Collections.sort(pointsList, (o1, o2) -> {
            if (o1.getKey() < o2.getKey()) return -1;
            if (o1.getKey() > o2.getKey()) return 1;
            return 0;
        });
        int ans = 1;
        Pair<Integer, Integer> curr = pointsList.get(0);
        int currEnd = curr.getValue();
        for (int i = 0; i < pointsList.size(); i++) {

            if ( currEnd< pointsList.get(i).getKey()) {
                ans++;
                currEnd = pointsList.get(i).getValue();
            } else {
                currEnd = Math.min(currEnd, pointsList.get(i).getValue());
            }
        }

        return ans;
        
    }
}