import java.util.Arrays; 
public class reverseArray {
    public static int[] reverse(int num[]) {
        int start = 0;
        int end = num.length - 1;
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
        return num; 
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reversedArray = reverse(num);
        System.out.println("Reversed array is: " + Arrays.toString(reversedArray));
    }
}
