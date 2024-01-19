class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        int[] arr = new int[n];
        Arrays.fill(arr, 1);

        
        String r = "Radiant";
        String d = "Dire";

        int nor = 0;
        int nod = 0;
        int ignr = 0;
        int ignd = 0;
        boolean ist = true;

        for(int i = 0; i < n; i++) {
            if(senate.charAt(i) == 'R') {
                nor++;
            }
            else nod++;
        }

        while(nor > 0 && nod > 0) {

            for(int i = 0; i < n; i++) {

                if(arr[i] == 0) continue;
                if(senate.charAt(i) == 'R') {
                    if(ignr > 0) {
                        ignr--;
                        arr[i] = 0;
                    }
                    else {
                        nod--;
                        ignd++;
                    }
                }
                else {
                    if(ignd > 0) {
                        ignd--;
                        arr[i] = 0;
                    }
                    else {
                        nor--;
                        ignr++;
                    }
                }

            }
        }  
        if(nor <= 0) return d;
        return r;
    }
}