public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        int start = 0;
        int end = arr.length-1;
        System.out.println ("end =" + end/2);
        if (checkpalindrome(arr,start,end) == 1) {
            System.out.println("this array is palindrome");
        }
        else
            System.out.println("this array is not a palindrome");
    }
    static int checkpalindrome(int[] arr, int start, int end) {
        while (start <= end/2) {
            if (arr.length == 0 || arr.length == 1) {
                return 1;
            }
            else if (arr[start] == arr[end]) {
                return checkpalindrome(arr, start + 1, end - 1);
            }
            else {
                return 0;
            }
        }
        return 2;
    }
}