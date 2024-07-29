package pascalstriangletwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PascalsTriangleTwo {

    public List<Integer> getRow(int rowIndex) {
        Map<Integer, List<Integer>> levels = new HashMap<>();
        List<Integer> levelZero = new ArrayList<>();
        levelZero.add(1);
        List<Integer> levelOne = new ArrayList<>();
        levelOne.add(1);
        levelOne.add(1);
        levels.put(0, levelZero);
        levels.put(1, levelOne);

        for(int index=2; index <= rowIndex; index++){
            List<Integer> prevLevel = levels.get(index-1);
            List<Integer> level = new ArrayList<>();
            level.add(1);
            for(int j =1; j<=prevLevel.size()-1; j++){
                level.add(prevLevel.get(j)+prevLevel.get(j-1));
            }
            level.add(1);
            levels.put(index, level);
        }

        return levels.get(rowIndex);
    }

}
