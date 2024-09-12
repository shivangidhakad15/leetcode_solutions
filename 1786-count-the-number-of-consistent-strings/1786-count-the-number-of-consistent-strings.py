class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        allow = set(allowed)
        count = 0

        for word in words:
            for letter in word:
                if letter not in allow:
                    break
            else:
                count += 1

        return count