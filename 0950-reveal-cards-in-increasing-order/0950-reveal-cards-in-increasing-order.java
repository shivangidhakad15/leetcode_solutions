class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int size = deck.length;
        int[] ans = new int[size];
        Arrays.sort(deck);
        return orderDeck(deck, ans, 0, 0, false);
    }

    public int[] orderDeck(int[] deck, int[] ans, int currentDeck, int currentAns, boolean flag) {
        int size = deck.length;

        if (currentDeck == size) {
            return ans;
        }

        while (currentAns < size) {
            if (ans[currentAns] == 0) {
                if (!flag) {
                    ans[currentAns] = deck[currentDeck];
                    currentDeck++;
                }
                flag = !flag;
            }
            
            currentAns++;
        }

        return orderDeck(deck, ans, currentDeck, 0, flag);
    }
}