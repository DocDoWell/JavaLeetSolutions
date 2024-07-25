package wordladder;

import java.util.*;

public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if (!wordList.contains(endWord)) {
            return 0;
        }

        //assume beginWord is not in wordlist
        int[][] adjacencyMatrix = getAdjacentMatrix(beginWord, endWord, wordList);

        return bfsTraverse(0,adjacencyMatrix, new boolean[adjacencyMatrix.length], wordList.indexOf(endWord) + 1);
    }

    private int[][] getAdjacentMatrix(String beginWord, String endWord, List<String> wordList) {
        int[][] adjacencyMatrix = new int[wordList.size() + 1][wordList.size() + 1];

        for (int col = 0; col < adjacencyMatrix.length; col++) {
            if (col == 0) {
                adjacencyMatrix[0][0] = 0;
            } else {
                adjacencyMatrix[col][0] = difference(beginWord, wordList.get(col - 1));
            }
        }

        for (int row = 0; row < adjacencyMatrix[0].length; row++) {
            if (row > 0) {
                adjacencyMatrix[0][row] = difference(beginWord, wordList.get(row - 1));
            }
        }

        for (int i = 1; i < adjacencyMatrix.length; i++) {
            for (int j = 1; j < adjacencyMatrix[i].length; j++) {
                adjacencyMatrix[i][j] = difference(wordList.get(i - 1), wordList.get(j - 1));
            }
        }

        displayContent(adjacencyMatrix);
        return adjacencyMatrix;
    }


    public int bfsTraverse(int source, int[][] adjacencyMatrix, boolean[] visited, int target) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);

        int output = 0;

        while(queue.size() > 0){
            int size = queue.size();
            output++;
            for(int k=0; k < size; k++){
                int index = queue.remove();
                if(index == target){
                    return output;
                }
                if (!visited[index]) {
                    for(int j=0; j < adjacencyMatrix[index].length; j++){
                        if (adjacencyMatrix[index][j] == 1) {
                            queue.add(j);
                        }
                    }
                }
            }
        }

        return 0;
    }

    private int difference(String beginWord, String endWord){
        int output = 0;
        for(int i=0; i< beginWord.length();i++){
            if(beginWord.charAt(i) != endWord.charAt(i)){
                output++;
            }
        }
        return output;
    }

    public void displayContent(int[][] adjacencyMatrix){
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            // length returns number of rows
            System.out.print("row " + i + " : ");
            for (int j = 0; j < adjacencyMatrix[i].length; j++)
            {
                // here length returns # of columns corresponding to current row
                System.out.print(adjacencyMatrix[i][j] + "  ");
            }
            System.out.println();
        }
    }



}
