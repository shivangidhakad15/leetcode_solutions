class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1], b[1]));
        int i=0;
        int cnt =0;
        int x = points[0][1];
        while (i<points.length) {
           if(points[i][0]>x){
               cnt++;
               x=points[i][1];
           }
           i++;
        }
        return cnt+1;
    }
}