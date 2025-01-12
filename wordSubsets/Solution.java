package wordSubsets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> output = new ArrayList<>();

        Map<String, Integer> maxWordCountForWord2 = new HashMap<>();
        for(String word: words2){
            Map<String, Integer> charCount = getCharCount(word);
            for(String character : charCount.keySet()){
                if(maxWordCountForWord2.get(character) == null){
                    maxWordCountForWord2.put(character, charCount.get(character));
                }else{
                    if(charCount.get(character) > maxWordCountForWord2.get(character)){
                        maxWordCountForWord2.put(character, charCount.get(character));
                    }
                }
            }
        }

        for(String word : words1){
            if(isUniversal(word, maxWordCountForWord2)){
                output.add(word);
            }
        }
        System.out.println(output);
        return output;
    }

    private boolean isUniversal(String word, Map<String, Integer> maxWordCount ){
        Map<String, Integer> word1CharCount = getCharCount(word);
        for(String character : maxWordCount.keySet()) {
            if(word1CharCount.get(character) == null){
                return false;
            }

            if(word1CharCount.get(character) < maxWordCount.get(character)){
                return false;
            }

        }
        return true;
    }

    private Map<String, Integer> getCharCount(String word){
        Map<String, Integer> charCount = new HashMap<>();
        for(int i=0; i<word.length(); i++){
            String letter = String.valueOf(word.charAt(i));
            charCount.merge(letter, 1, Integer::sum);
        }
        return charCount;
    }


}
