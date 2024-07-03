package plusOne;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        int index = digits.length-1;;

        while(index>=0){
            if(digits[index] + 1 < 10){
                digits[index] = digits[index]+1;
                break;
            }else{
                digits[index] = 0;
            }
            index--;
        }

        if(index < 0){
            int[] plusOne = new int[digits.length+1];
            plusOne[0]=1;
            return plusOne;
        }

        return digits;
    }

}
