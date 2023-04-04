import java.io.*;
import java.util.*;

public class Main {

    public static HashMap<String, Integer> candidates = new HashMap<>();
    public static int n;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        n = Integer.parseInt(br.readLine());
        ArrayList<String> nameList = new ArrayList<>();

        // 17 ~ 40 initialize
        for(int i=0; i<n; i++) {
            String name = br.readLine();
            candidates.put(name, 0);
            nameList.add(name);
        }

        int votes[][] = new int[1000][1000];

        int idx = 0;
        while((input = br.readLine())!= null){
            StringTokenizer st = new StringTokenizer(input);

            for(int i=0; i<n; i++)
                votes[idx][i] = Integer.parseInt(st.nextToken());

            idx ++;

        }

        for(int i=0; i<idx; i++){
            String name = nameList.get(votes[i][0]-1);
            candidates.put(name, candidates.getOrDefault(name, 0)+1);
        }

        while(true){
            // 44 ~ 45 투표순으로 후보자 오름차순 정렬
            List<Map.Entry<String, Integer>> entryList = new LinkedList<>(candidates.entrySet());
            entryList.sort(Map.Entry.comparingByValue());

            // 최다 득표수의 백분율
            double max = (entryList.get(entryList.size()-1).getValue() / (double) idx) * 100;

            int minValue = entryList.get(0).getValue();
            int maxValue = entryList.get(entryList.size()-1).getValue();

            // 최다 득표수가 과반 수 이거나 최대 값과 최소 값이 같으면 후보자들을 출력하고 종료 54 ~ 69
            if(max > 50 || minValue == maxValue) {
                Stack<String> st = new Stack<>();

                // 최대 득표 후보가 여러명 있을 수 있으므로 모두 출력
                for(int i=entryList.size()-1; i>=0; i--){
                    st.push(entryList.get(i).getKey());

                    if(i == 0 || entryList.get(i).getValue() != entryList.get(i-1).getValue()) break;
                }

                // entryList를 맨 끝에서 부터 탐색 했기 때문에 거꾸로 다시 출력
                while(!st.isEmpty())
                    System.out.println(st.pop());

                break;
            }

            // 최소 득표 후보자들을 제거 (최소 득표 후보자들이 여러명 있을 수 있으므로 모두 제거) (72 ~ 83)
            for(int i=0; i<entryList.size()-1; i++, idx--){
                String name = entryList.get(i).getKey();
                int index = nameList.indexOf(name);

                entryList.remove(0);
                candidates.remove(name);

                // 최소 득표자 제거 후 다음 순위 후보자에게 표를 넘겨줌
                findNextVote(votes, index+1, nameList, minValue);

                if(minValue != entryList.get(0).getValue()) break;
            }
        }

    }

    public static void findNextVote(int [][] votes, int idx, ArrayList<String> nameList, int minValue){

        for(int i=0; i<votes.length; i++){

            if(votes[i][0] != idx) continue;

            for(int j=1; j<n; j++){
                String name = nameList.get(votes[i][j] - 1);

                if(candidates.containsKey(name)){
                    if(minValue < candidates.get(name))
                        candidates.put(name, candidates.get(name) + 1);
                    break;
                }
            }
        }
    }

}