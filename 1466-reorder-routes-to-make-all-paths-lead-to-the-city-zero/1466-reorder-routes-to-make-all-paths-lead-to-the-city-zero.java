class Solution {
    public int minReorder(int n, int[][] connections) {
        boolean[] reach = new boolean[n];
        int rows = connections.length;
        reach[0]=true;
        int count=0;
        Stack<Integer> s1 = new Stack<>();
        for(int i=0;i<rows;i++){
            if(reach[connections[i][0]]){
                count++;
                reach[connections[i][1]]=true;
            }else if(reach[connections[i][1]]){
               reach[connections[i][0]]=true;
            }else
                s1.push(i);
        }
        Stack<Integer> s2= new Stack<>();
        while(!s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty()){
                int i = s1.pop();
                if(reach[connections[i][0]]){
                    count++;
                    reach[connections[i][1]]=true;
                }else if(reach[connections[i][1]]){
                    reach[connections[i][0]]=true;
                }else
                    s2.push(i);
            }
            while(!s2.isEmpty()){
                int i = s2.pop();
                if(reach[connections[i][0]]){
                    count++;
                    reach[connections[i][1]]=true;
                }else if(reach[connections[i][1]]){
                    reach[connections[i][0]]=true;
                }else
                    s1.push(i);
            }
        }
        return count;
    }
}