class Solution:
    def reportSpam(self, message: List[str], bannedWords: List[str]) -> bool:
        bannedSet = set(bannedWords)  # Convert bannedWords list to a set for O(1) lookups
        banned_count = 0
        
        for word in message:
            if word in bannedSet:
                banned_count += 1
                if banned_count >= 2:
                    return True  # Spam detected, no need to check further
        
        return False 