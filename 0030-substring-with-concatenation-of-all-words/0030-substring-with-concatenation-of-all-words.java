class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String,Integer> globalWordsFreqMap = new HashMap<>();
        for(String word:words)
            globalWordsFreqMap.put(word,globalWordsFreqMap.getOrDefault(word,0)+1);
        
        int n = words.length;
        int wordLength = words[0].length();
        int windowLength = wordLength * n;

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < wordLength; i++) {
            for (int j = i; j + windowLength <= s.length(); j += wordLength) {
                Map<String, Integer> windowWordsFreqMap = new HashMap<>();
                String currentWindow = s.substring(j, j + windowLength);
                for (int k = n - 1; k >= 0; k--) {
                  String windowWord = currentWindow.substring(k * wordLength, (k + 1) * wordLength);
                  int count = windowWordsFreqMap.getOrDefault(windowWord, 0) + 1;

                  if (count > globalWordsFreqMap.getOrDefault(windowWord, 0)) {
                    j += k * wordLength;
                    break;
                  } else if (k == 0)
                    result.add(j);
                  else
                    windowWordsFreqMap.put(windowWord, count);
                  }
            }     
        }
       
        return result;
    }
}