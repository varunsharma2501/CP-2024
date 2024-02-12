public class _8balanceFollow {

    public static void balanceFo(int n, char temp[], int ind, int open1, int close1, int open2, int close2) {

        if (open1 == close1 && open2 == close2 && open1 == open2 && open1 == n) {
            // print temp
            for (int i = 0; i < ind; i++) {
                System.out.print(temp[i]);
            }
            System.out.println();
            return;
        }

        if (open1 == close1 && open2 == close2) {
            // getting ( 
            temp[ind] = '(';
            balanceFo(n, temp, ind + 1, open1 + 1, close1, open2, close2);
            // getting {
            temp[ind] = '{';
            balanceFo(n, temp, ind + 1, open1, close1, open2 + 1, close2);
        } else {
            int t = ind - 1;
            int br1 = 0;
            int br2 = 0;

            while (t >= 0) {
                if (temp[t] == '(') {
                    br1 -= 1;
                }
                if (temp[t] == '{') {
                    br2 -= 1;
                }
                if (temp[t] == ')') {
                    br1 += 1;
                }
                if (temp[t] == '}') {
                    br2 += 1;
                }
                if (br1 == -1) {
                    temp[ind] = ')';
                    balanceFo(n, temp, ind + 1, open1, close1 + 1, open2, close2);
                    if (open1 != n) {
                        temp[ind] = '(';
                        balanceFo(n, temp, ind + 1, open1 + 1, close1, open2, close2);
                    }
                    if(open2!=n){
                        temp[ind]='{';
                        balanceFo(n, temp, ind+1, open1, close1, open2+1, close2);
                    }
                    br1 = 0; // Reset br1 after recursive calls
                }
                if (br2 == -1) {
                    temp[ind] = '}';
                    balanceFo(n, temp, ind + 1, open1, close1, open2, close2 + 1);
                    if (open2 != n) {
                        temp[ind] = '{';
                        balanceFo(n, temp, ind + 1, open1, close1, open2 + 1, close2);
                    }
                    br2 = 0; // Reset br2 after recursive calls
                }
                t--;
            }
            
        }
    }

    public static void main(String[] args) {
        balanceFo(2, new char[8], 0, 0, 0, 0, 0);
    }
}
