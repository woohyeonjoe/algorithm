import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //후보 인원 입력
        int n = Integer.parseInt(br.readLine());
        String[] name = new String[n];

        //후보들 이름 입력
        for(int i=0; i<n; i++) {
            name[i] = br.readLine();
        }

        String input = "";
        Queue<Integer>[] score = new LinkedList[1001];  //투표수는 최대 1000
        int count = 0;      //투표 수

        while((input = br.readLine()) != null && input.length() != 0) {         //빈 문자 입력할때 까지 투표 내역 계속 입력
            String[] arr = input.split(" ");        //찍은 후보의 번호
            score[count] = new LinkedList<>();
            for(int i=0; i<n; i++) {
                score[count].add(Integer.parseInt(arr[i])-1);
            }
            count++;
        }


        /**
         * v[0]의 값: 0번 후보의 득표수
         * v[1]의 값: 1번 후보의 득표수
         * v[2]의 값: 2번 후보의 득표수
         * 이런식으로 쭉..
         */
        int[] v = new int[n];        //후보들의 투표수를 카운트하는 배열

        while(true) {
            for(int i=0; i<count; i++) {
                while(v[score[i].peek()] == -1) {           //해당 투표 내역의 1순위 후보가 탈락한 후보라면
                    score[i].poll();                        //다음 순위 후보를 체크하기 위해 해당 투표의 1순위 후보는 제거
                }
                v[score[i].peek()]++;                       //투표 내역 하나를 까서 1순위 후보 카운트++; <-- 이걸 for 문으로 모든 투표의 1순위 후보를 카운트한다.
            }

            int maxi = 0, mini = Integer.MAX_VALUE;
            for(int i=0; i<n; i++) {
                maxi = Math.max(maxi, v[i]);     //maxi: 최다 득표 후보가 받은 투표수
                if(v[i] != -1) {                 //탈락하지 않은 후보라면
                    mini = Math.min(mini, v[i]); //mini: 최소 득표 후보가 받은 투표수
                }
            }

            if(maxi*2 > count || maxi == mini) {        //50% 이상의 투표를 얻은 후보가 나오거나 || 탈락되지 않은 모든 후보의 투표수가 동률이라면 종료
                for(int i=0; i<n; i++) {
                    if(v[i] == maxi) {                  //최다 투표수 값으로 후보의 이름 찾기
                        System.out.println(name[i]);
                    }
                }
                return;
            }

            for(int i=0; i<n; i++) {
                if(v[i] == mini) {      //최소 득표를 받은 후보는 탈락이므로 -1로 표시
                    v[i] = -1;
                }
                else if(v[i] != -1) {   //탈락한 후보를 제외하고 투표수를 초기화
                    v[i] = 0;
                }
            }
        }


    }
}