public class _9balance  {
    public static void main(String[] args) {
        printPossibleBalancedParentheses2(2);
    }

    private static void printPossibleBalancedParentheses2(int N) {
        workWithParentheses(new char[2*N], 0, 0, N);
    }

    private static void workWithParentheses(char[] str, int curr, int weight, int openBracketLimit) {
        if (weight == 0 && curr >= str.length) {
            System.out.println(new String(str));
            return;
        }

        if (weight == 0) {
            addOpeningBraces(str, curr, weight, openBracketLimit);
        }
        else {
            if (openBracketLimit > 0) {
                addOpeningBraces(str, curr, weight, openBracketLimit);
            }

            char lastOpenedBrace = getLastOpenedBrace(str, curr);
            char closingBrace = ')';

            switch (lastOpenedBrace) {
                case '[':
                    closingBrace = ']';
                    break;
                case '{':
                    closingBrace = '}';
                    break;
                default:
                    break;
            }

            str[curr] = closingBrace;
            workWithParentheses(str, curr+1, weight-1, openBracketLimit);
        }
    }

    private static char getLastOpenedBrace(char[] str, int curr) {
        char lastOpenedBrace = ' ';
        int tempWeight = 0;

        for (int i=curr-1; i>=0; i--) {
            if (str[i] == '{' || str[i] == '(' || str[i] == '[') {
                tempWeight++;
            }
            else tempWeight--;

            if (tempWeight > 0) {
                lastOpenedBrace = str[i];
                break;
            }
        }

        return lastOpenedBrace;
    }

    private static void addOpeningBraces(char[] str, int curr, int weight, int openBracketLimit) {
        str[curr] = '(';
        workWithParentheses(str, curr+1, weight+1, openBracketLimit-1);

        str[curr] = '[';
        workWithParentheses(str, curr+1, weight+1, openBracketLimit-1);

        str[curr] = '{';
        workWithParentheses(str, curr+1, weight+1, openBracketLimit-1);
    }
}