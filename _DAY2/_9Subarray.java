public class _9Subarray {

    public static int maxSub(int arr[], int x) {
        int n = arr.length;
        int start = 0, end = 0, sum = 0, minLength = Integer.MAX_VALUE;

        while (end < n) {
            sum += arr[end];

            if(sum >= x) {
                minLength = Math.min(minLength, end - start);
            }
            while(sum<x && end<n){
                sum=sum+arr[end]-arr[start];
                start++;
                end--;
            }
            if(end==n){
                return minLength;
            }
            end++;
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4};
        int a2[] = {10, 20, 30};
        System.out.println(maxSub(a1, 8));
        System.out.println(maxSub(a2, 6));
    }
}


