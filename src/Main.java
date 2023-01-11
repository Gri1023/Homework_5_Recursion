public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,5,4,2,1};
        int start = 0;
        int end = arr.length-1;
        if (checkPalindrome(arr,start,end) == 1) {
            System.out.println("Conclusion: this array is palindrome");
        }
        else
            System.out.println("Conclusion: this array is not a palindrome");
    }
    static int checkPalindrome(int[] arr, int start, int end) {
            if (arr.length == 0 || arr.length == 1) {
                return 1;
            }
            if (arr[start] == arr[end] && start<=end) {
                System.out.println("match with start = " + start + " and end = " + end);
                return checkPalindrome(arr, start + 1, end - 1);
            }
            else if (arr[start] == arr[end] && start>end) {
                return 1;
            }
            else if (arr[start] != arr[end] && start<=end) {
                System.out.println("values with start = " + start + " and end = " + end + " do not match");
                return 0;
            }
            else {
                return 0;
            }
    }
}