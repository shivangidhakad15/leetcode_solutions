class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int room[]=new int[rooms.size()];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        while(st.isEmpty()!=true)
        {
            int idx=st.pop();
            if(room[idx]==1)
                continue;
            for(int i=0;i<rooms.get(idx).size();i++)
            {
                st.push(rooms.get(idx).get(i));
            }
            room[idx]=1;
        }
        for(int i=0;i<room.length;i++)
        {
            if(room[i]==0)
                return false;
        }
        return true;
    }
}