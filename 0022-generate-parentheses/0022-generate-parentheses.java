class Solution {
    public void generate(List<String> L, int n, char[] arr,int j, int open){
        if(n == open){
            for(int i = j; i < arr.length; i++)
                arr[i] = ')';
            L.add(String.valueOf(arr));
            return;
        }
        arr[j] = '(';
        generate(L, n - 1, arr, j + 1, open + 1);
        if(open > 0){
            arr[j] = ')';
            generate(L, n - 1, arr, j + 1, open - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        n *= 2;
        char[] arr = new char[n];
        generate(list, n, arr, 0, 0);
        return list;
    }
}