public class _2generateCombinations {
   
//here each element has occurence max 2 
// time complexity :O(3^n)        space :O(n)
public static void generateComb(int arr[],int temp[],int ind,int cnt){
    if(ind==arr.length){
        // print the temp array
        for(int i=0;i<cnt;i++){
            System.out.print(temp[i]);
        }
        System.out.print(" | ");
        return;
    }

    // if 0 occurence
    generateComb(arr, temp, ind+1, cnt);

    // if 1 occurence
    temp[cnt]=arr[ind];
    generateComb(arr, temp, ind+1, cnt+1);

    // if 2 occurence
    temp[cnt]=arr[ind];
    temp[cnt+1]=arr[ind];
    generateComb(arr, temp, ind+1, cnt+2);
}

// this code will work for whatever number of occurences we are giving for each element
// here n is number of elements in set and k is the occurences
// time :O(k^n)      space:O(n)
public static void NgenerateComb(int arr[],int temp[],int ind,int cnt,int k){
    if(ind==arr.length){
        // print the temp array
        for(int i=0;i<cnt;i++){
            System.out.print(temp[i]);
        }
        System.out.print(" | ");
        return;
    }

    int i=0;
    while(i<=k){
        for(int j=0;j<i;j++){
            temp[cnt+j]=arr[ind];
        }
        NgenerateComb(arr, temp, ind+1, cnt+i,k);
        i++;
    }
}

    public static void main(String[] args) {
        int a1[]={1,2};
        generateComb(a1, new int[2*a1.length], 0, 0);
        System.out.println();
        NgenerateComb(a1, new int[2*a1.length], 0, 0,2);
    }
}
