import java.util.Scanner;
import java.util.Stack;

// 괄호
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 데이터의 수 저장
        int num = sc.nextInt();

        for(int i = 0 ; i < num; i++) {
            Stack<Character> st = new Stack<>();
            String s = sc.next();
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == '(') {
                    st.push('(');
                } else if (s.charAt(j) == ')') {
                    try {
                        st.pop();
                    } catch (Exception e) {
                        st.push(')');
                        break;
                    }
                }
            }
            if(st.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}

