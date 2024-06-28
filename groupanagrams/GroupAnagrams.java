package groupanagrams;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> temp = new HashMap<>();
        List<List<String>> output = new ArrayList<>();

        for(int i=0; i< strs.length; i++){
            String string = strs[i];
            String sorted = sortString(strs[i]);
            if(i == 0){
                temp.put(sorted, new ArrayList<>(){{add(string);}});
            }else{
                if(temp.get(sorted) != null){
                    temp.get(sorted).add(strs[i]);
                }else{
                    temp.put(sorted, new ArrayList<>(){{add(string);}});
                }
            }
        }

        for (String str : temp.keySet()) {
            output.add(temp.get(str));
        }

        return output;
    }

    private String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }


}
