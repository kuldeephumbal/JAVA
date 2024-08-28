public class largestNum{
    public static int largestnumber(int num[]){
        int max = num[0];
        for(int i = 1; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int num[] = {26, 452, 253, 1124, 255};
        System.out.println("Largest number in the array is: " + largestnumber(num));
    }
}