class Solution {
    public double maxProbability(int n, int[][] edges, double[] 
    succProb, int start, int end) {
        List<double[]>[] adjList = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            adjList[edges[i][0]].add(new double[] {edges[i][1],succProb[i]});
            adjList[edges[i][1]].add(new double[] {edges[i][0],succProb[i]});
        }
        double[] prob = new double[n];
        prob[start] = 1.0;  // start to start prabability = 1.0

        boolean[] vis = new boolean[n];


        Queue <double[]> queue = new PriorityQueue<>(Collections.reverseOrder((a, b) -> Double.compare(a[1],b[1])));
        queue.add(new double[]{start,1.0});


        while (!queue.isEmpty()){
            double[] cur = queue.poll();
            int curNode = (int) cur[0];
            if(curNode == end) return cur[1]; 
            if(vis[curNode] == true) continue; 
            vis[curNode] = true; 

            double curProb = cur[1];


            for (double[] g : adjList[curNode]) {
                int nxt = (int)g[0];
                double p = g[1];
                double val = prob[nxt];
                if(curProb*p > prob[nxt]){ 
                    queue.add(new double[]{nxt,curProb*p});
                }
            }

        }
        return 0.0;
    }
}