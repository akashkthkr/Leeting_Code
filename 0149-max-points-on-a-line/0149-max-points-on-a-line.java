class Solution {
    public int maxPoints(int[][] points) {
        int len = points.length;
        if (len == 1) return 1;
        int max = 2;
        for (int i = 0; i < points.length - 1; i++) {
            HashMap<Double, Integer> slopeMap = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if ( i != j) {
                    double slopeWrtPoint = (points[j][1] - points[i][1])/ (double) (points[j][0] - points[i][0]);
                    slopeMap.put(slopeWrtPoint, slopeMap.getOrDefault(slopeWrtPoint, 0) + 1);
                }
            }
            max = Math.max(max, Collections.max(slopeMap.values()) + 1);
        }
        return max;
    }
}