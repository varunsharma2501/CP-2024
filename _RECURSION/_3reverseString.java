// package _RECURSION;

public class _3reverseString {
    
    public static void reverse(char str[],int l,int h){
        if(l>=h){
            return;
        }

        // swap str[l] amd str[h]
        char temp=str[l];
        str[l]=str[h];
        str[h]=temp;
        reverse(str, l+1, h-1);
    }

    public static void rev(char str[],int l,int n){
        if(l>=n/2){
            return;
        }

        // swap str[i] and str[n-i-1]
        char temp=str[l];
        str[l]=str[n-l-1];
        str[n-l-1]=temp;

        rev(str, l+1, n);
    }
    public static void main(String[] args) {
        char str[]={'a','b','c','d','e','f'};
        reverse(str, 0, 5);
        System.out.println("After reversing");
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
        rev(str, 0, 6);
        System.out.println("After reversing");
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
    }
}
