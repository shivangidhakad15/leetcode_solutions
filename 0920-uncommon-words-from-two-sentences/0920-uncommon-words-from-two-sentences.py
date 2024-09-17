class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        s1_words = s1.split()
        s2_words = s2.split()
        all_words = s1_words + s2_words
        word_count = Counter(all_words)

        res = []
        for s, count in word_count.items():
            if count == 1:
                res.append(s)
        
        return res
