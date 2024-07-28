class Solution:
    def canAliceWin(self, nums: List[int]) -> bool:
        alice_single_sum = 0
        alice_double_sum = 0
        total_sum = 0

        for num in nums:
            if 1 <= num <= 9:
                alice_single_sum += num
            elif 10 <= num <= 99:
                alice_double_sum += num

            total_sum += num

        bob_single_sum = total_sum - alice_single_sum 
        bob_double_sum = total_sum - alice_double_sum

        if alice_single_sum > bob_single_sum or alice_double_sum > bob_double_sum:
            return True
        
        return False


        