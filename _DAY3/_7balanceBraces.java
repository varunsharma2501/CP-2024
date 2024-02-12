// here we are given a number n and we need to print all the possible balanced braces possible with n pairs of ().
public class _7balanceBraces{
    

    // time complexity would have been O(2^2n) but since we are using if condiitons so many unwanted cases are being skipped and hence it reduces
    public static void printBalance(int n,char temp[],int cnt,int open,int close){
        if(open==close && open==n){
            // print the temp array
            for(int j=0;j<cnt;j++){
                System.out.print(temp[j]);
            }
            System.out.println();
            return;
        }

        // we are having equal number of braces then next choice can only be opening
        // case 1: opening =closing
        if(open==close){
            temp[cnt]='(';
            printBalance(n, temp, cnt+1, open+1, close);
        }
        else{
            // case 2.1 :when all the opeing have been utilized then surely next is closing
            if(open==n){
                temp[cnt]=')';
                printBalance(n, temp, cnt+1, open, close+1);
            }
            // case 2.2 :when opening braces are left
            else{
                // adding opening bracket
                temp[cnt]='(';
                printBalance(n, temp, cnt+1, open+1, close);
                // adding closing bracket
                temp[cnt]=')';
                printBalance(n, temp, cnt+1, open, close+1);
            }

        }
    }
    
    public static void main(String[] args) {
        printBalance(3, new char[6], 0, 0, 0);
    }
}