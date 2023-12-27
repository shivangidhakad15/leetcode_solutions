class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = getMaxCandies(candies);
        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;
    }

    private static int getMaxCandies(int[] candies) {
        int max = candies[0];
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        return max;
    }
}