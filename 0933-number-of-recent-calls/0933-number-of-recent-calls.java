class RecentCounter {
    int counter;
    public RecentCounter() {
        counter=0;
    }
    ArrayList<Integer> list = new ArrayList<>();
    public int ping(int t) {
        list.add(t);
        while(list.get(counter)<t-3000){
            counter++;
        } 
        return list.size()-counter;   
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */