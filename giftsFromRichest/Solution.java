package giftsFromRichest;

public class Solution {
    public long pickGifts(int[] gifts, int k) {
        while(k>0){
            int col = getMaxCol(gifts);
            gifts = reducePile(gifts, col);
            k--;
        }
        return sumGifts(gifts);
    }

    private long sumGifts(int[] gifts){
        long output =0;
        for(int i=0; i < gifts.length; i++){
            output = output + (long) gifts[i];
        }
        return output;
    }

    private int getMaxCol(int[] gifts){
        int maxCol = 0;
        for(int i=1; i < gifts.length; i++){
            if(gifts[i] > gifts[maxCol]){
                maxCol = i;
            }
        }
        return maxCol;
    }

    private int[] reducePile(int[] gifts, int col){
        gifts[col] = (int) Math.sqrt(gifts[col]);
        return gifts;
    }
}
