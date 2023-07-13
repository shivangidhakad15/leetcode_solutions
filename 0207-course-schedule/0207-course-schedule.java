class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        int[] in=new int[n];
        for(int i=0;i<prerequisites.length;i++)
        {      in[prerequisites[i][1]]++;
                adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(in[i]==0)
            {
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty())
        {
            count++;
            int temp=q.poll();
            for(int i:adj.get(temp))
            {
                in[i]--;
                if(in[i]==0)
                {
                    q.add(i);
                }
            }
        }
        if(count==n) return true;
        return false;
        
    }
}