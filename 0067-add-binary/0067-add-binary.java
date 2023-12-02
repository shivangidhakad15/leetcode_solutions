class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1, j = b.length()-1;
        StringBuilder ans = new StringBuilder(); 
        int sum = 0,carry = 0;

        while(i>=0 || j>=0)
        {
            sum = carry;
            if(i>=0) sum += a.charAt(i--) - '0';
            if(j>=0) sum += b.charAt(j--) - '0';
            ans.append(sum%2);
            carry = sum/2;
        }
        if(carry!=0)
            ans.append(carry);

        return ans.reverse().toString(); 
    }
}