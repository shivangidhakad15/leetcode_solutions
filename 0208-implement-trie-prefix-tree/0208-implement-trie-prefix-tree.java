class Trie {
    Map<String, Boolean> map;
    public Trie() {
        map = new HashMap<>();
    }
    public void insert(String word) {
        map.put(word, true);
    }
    public boolean search(String word) {
        return map.getOrDefault(word, false);
    }
    public boolean startsWith(String prefix) {
        for (String word : map.keySet()) {
            if (word.startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */