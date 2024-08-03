class Solution:
    def winningPlayerCount(self, n: int, pick: List[List[int]]) -> int:
        pick_count = {}
    
        for player, color in pick:
            if player not in pick_count:
                pick_count[player] = {}
            if color not in pick_count[player]:
                pick_count[player][color] = 0
            pick_count[player][color] += 1
        
        winners = 0
        for player in range(n):
            if player in pick_count:
                for color in pick_count[player]:
                    if pick_count[player][color] > player:
                        winners += 1
                        break 
        return winners