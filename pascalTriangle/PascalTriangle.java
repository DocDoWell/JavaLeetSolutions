package pascalTriangle;

import java.util.*;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> op = new ArrayList<>();

        Map<Integer,List<Integer>> levels = new HashMap<>();

        if(numRows == 1){
            return List.of(List.of(1));
        }

        levels.put(0, List.of(1));
        levels.put(1, List.of(1,1));

        for(int i =2; i< numRows; i++){
            List<Integer> ints = new ArrayList<>();
            List<Integer> prev = levels.get(i-1);

            ints.add(1);

            for(int j=0; j < prev.size()-1; j++){
                int next = prev.get(j) + prev.get(j+1);
                ints.add(next);
            }

            ints.add(1);

            levels.put(i, ints);
        }

        for(int key : levels.keySet()){
            op.add(levels.get(key));
        }

        return op;
    }
}
