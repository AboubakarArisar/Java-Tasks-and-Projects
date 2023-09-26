import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the brackets: ");
        String brackets = sc.nextLine();
        Stack<Character> st = new Stack<>(); 

        for (int i = 0; i < brackets.length(); i++) {
            char currentBracket = brackets.charAt(i);

            if (currentBracket == '(' || currentBracket == '{' || currentBracket == '[') {
                st.push(currentBracket);
            } else if (currentBracket == ')' || currentBracket == '}' || currentBracket == ']') {
                if (st.isEmpty()) {
                    System.out.println("Unbalanced");
                    return;
                }
                char openingBracket = st.pop();
                if (!areBracketsMatching(openingBracket, currentBracket)) {
                    System.out.println("Unbalanced");
                    return;
                }
            }
        }

        if (st.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Unbalanced");
        }
    }

    private static boolean areBracketsMatching(char openingBracket, char closingBracket) {
        return (openingBracket == '(' && closingBracket == ')') ||
               (openingBracket == '{' && closingBracket == '}') ||
               (openingBracket == '[' && closingBracket == ']');
    }
}
