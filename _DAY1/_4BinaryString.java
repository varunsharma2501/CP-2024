// here we are given a string array and we have to apply binary search and here the strings are lexiographically sorted so i used my oonw function
// space :O(1)          time :O(logn*k)          k-length of string compared

public class _4BinaryString {
 
    public static int compareStr(String s1,String s2){
        int n1=s1.length();
        int n2=s2.length();
        int n=Math.min(n1, n2);
        for(int i=0;i<n;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                continue;
            }
            else if(s1.charAt(i)>s2.charAt(i)){
                return 1;
            }
            else{
                return -1;
            }
        }
        return 0;
    }
    public static int Search(String str,String arr[]){
        int n=str.length();
        int l=0,h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            // if(arr[mid].equals(str)){
            //     return mid;
            // }
            // else if(arr[mid].compareTo(str)>0){
            //     h=mid-1;
            // }
            // else{
            //     l=mid+1;
            // }
            if(compareStr(arr[mid], str)==0){
                return mid;
            }
            else if(compareStr(arr[mid], str)==1){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String arr[]={"bat","car","cat","hello","ram","rat","ravan"};
        String arr2[]={"ca"};
        System.out.println(Search("cat", arr));
        System.out.println(Search("hello", arr));
        System.out.println(Search("heo", arr));
        System.out.println(Search("ca", arr2));
    }
}
