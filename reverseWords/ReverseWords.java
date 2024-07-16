package reverseWords;

public class ReverseWords {
    public String reverseWords(String s) {
        String output = "";
        s = s.trim().replaceAll("( )+"," ");
        String[] split = s.split(" ");
        for(int i = split.length-1; i >=0; i--){
            output = output + split[i] + " ";
        }
        return output.trim();
    }
}
