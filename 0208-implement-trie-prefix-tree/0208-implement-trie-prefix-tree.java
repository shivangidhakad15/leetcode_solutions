class Trie { 
    static class TreeNode {
        TreeNode[] children = new TreeNode[26];
        boolean theEnd;

        public TreeNode(){
            this.theEnd = false;
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }
    TreeNode root;
    public Trie() {
        this.root = new TreeNode();
    }
    public void insert(String word) {
        int n = word.length();
        int index;
        TreeNode temp = root;
        for (int i = 0; i < n; i++) {
            index = word.charAt(i) - 'a';
            if(temp.children[index] == null){
                temp.children[index] = new TreeNode();
            }
            temp = temp.children[index];
        }
        temp.theEnd = true;
    }
    public boolean search(String word) {
        int n = word.length();
        int index;
        TreeNode temp = root;
        for (int i = 0; i < n; i++) {
            index = word.charAt(i) - 'a';
            if(temp.children[index] == null){
                return false;
            }
            temp = temp.children[index];
        }
        return temp.theEnd;    
    }
    public boolean startsWith(String prefix) {
        int n = prefix.length();
        int index;
        TreeNode temp = root;
        for (int i = 0; i < n; i++) {
            index = prefix.charAt(i) - 'a';
            if(temp.children[index] == null){
                return false;
            }
            temp = temp.children[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */