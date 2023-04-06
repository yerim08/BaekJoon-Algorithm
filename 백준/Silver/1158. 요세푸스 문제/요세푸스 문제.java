import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        
        // 1 ~ N 번까지 N 명의 사람
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        // k - 1 까지 큐 처음에 있는 값을 맨 뒤로 보냄
        while (q.size() != 1) {
            for(int i = 0; i < k - 1; i++) {
                q.offer(q.poll());
            }
            // k 번째 값은 출력 문자열에 저장
            sb.append(q.poll() + ", ");
        }

        sb.append(q.poll() + ">");
        System.out.println(sb);

    }
}
