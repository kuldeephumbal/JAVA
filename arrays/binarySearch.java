public class binarySearch{
    public static int findKey(int num[], int key){
        int low = 0;
        int high = num.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(num[mid] == key){
                return mid;
            }
            if(num[mid] < key){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int num[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 5;
        int result = findKey(num, key);
        if(result == -1){
            System.out.println("Key not found in the array");
        }
        else{
            System.out.println("Key found at index: " + result);
        }
    }
}