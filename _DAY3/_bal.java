public class _bal{

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
                // backtracking for both types of parentheses
                if (open1 < n) {
                    temp[ind] = '(';
                    balanceFo(n, temp, ind + 1, open1 + 1, close1, open2, close2);
                }
                if (close1 < open1) {
                    temp[ind] = ')';
                    balanceFo(n, temp, ind + 1, open1, close1 + 1, open2, close2);
                }
                if (open2 < n) {
                    temp[ind] = '{';
                    balanceFo(n, temp, ind + 1, open1, close1, open2 + 1, close2);
                }
                if (close2 < open2) {
                    temp[ind] = '}';
                    balanceFo(n, temp, ind + 1, open1, close1, open2, close2 + 1);
                }
            }
        }

        public static void main(String[] args) {
            balanceFo(2, new char[8], 0, 0, 0, 0, 0);
        }
}