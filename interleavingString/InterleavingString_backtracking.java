package interleavingString;

import java.util.ArrayList;
import java.util.List;

public class InterleavingString_backtracking {

   //doesn't work for larger solutions - need another approach
    public boolean isInterleave(String s1, String s2, String s3) {
        List<String> solutionStore = new ArrayList<>();
        solve(0, 0, 0, s1, s2, s3, "", solutionStore);
        if(!solutionStore.isEmpty()){
            return true;
        }
        return false;
    }

    private boolean isValid(String first, int firstPointer, String third, int thirdPointer) {
        if (firstPointer < first.length()) {
            if (first.charAt(firstPointer) == third.charAt(thirdPointer)) {
                return true;
            }
        }
        return false;
    }

    private void solve(int firstPointer, int secondPointer, int thirdPointer, String first, String second, String third, String output, List<String> x) {
        if(third.equals(output)){
            x.add(third);
        }

        if(isValid(first, firstPointer, third, thirdPointer) || isValid(second, secondPointer, third, thirdPointer)) {
            if (isValid(first, firstPointer, third, thirdPointer)) {
                output = output + first.charAt(firstPointer);
                solve(firstPointer + 1, secondPointer, thirdPointer + 1, first, second, third, output, x);
                output = output.substring(0, output.length() - 1);
            }

            if (isValid(second, secondPointer, third, thirdPointer)) {
                output = output + second.charAt(secondPointer);
                solve(firstPointer, secondPointer + 1, thirdPointer + 1, first, second, third, output, x);
            }
        }
    }

}

