public class arrayreverse_recursion {
        public static void reverse(int[] arr, int start, int end) {
            if (start >= end) {
                return;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
    reverse(arr, start + 1, end - 1);
        }
    
        public static void printArray(int[] arr, int start) {
            if (start >= arr.length) {
                return;
            }
    
            System.out.print(arr[start] + " ");
    
            printArray(arr, start + 1) ;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
    
            reverse(arr, 0, arr.length - 1);
    
            printArray(arr, 0);
        }
    }

