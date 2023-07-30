import java.util.*;

public class delivery {
    static int result = 0;
    public static void main(String[] args) {
        int cap = 2;
        int n = 7;
        int[] deliveries = {1,0,2,0,1,0,2};
        int[] pickups = {0,2,0,1,0,2,0};

        System.out.println(solution(cap, n, deliveries, pickups));

    }

    public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
       
        int gocap = 0;
        int backcap = 0;
        long answer = 0;

        for(int i = n - 1; i >= 0 ; i --){ //끝에서 부터 해치우고 거리 좁혀나가는게 효율적이니까
            gocap += deliveries[i]; //현 위치에서 얼만큼 배달해야하는지 일단 축적
            backcap += pickups[i]; //현 위치에서 얼마나 수가해야하는지 일단 축적

            while(gocap > 0 || backcap > 0){ //만약 그 값이 양수라면 ? 일단 거쳐야하는 곳 == 일해야하는 곳 == 이동거리에 포함되는 곳
                gocap -= cap; //내가 한번에 배달할 수 있는 박스를 뺀다
                backcap -= cap; //내가 한번에 수거할 수 있는 박스를 뺀다
                answer += (i + 1) * 2; //일단 일이 있는 곳은 우리의 이동거리에 포함시킨다 왕복 ㅇㅇ
                //만약에 이렇게 cap을 차감했는데 양수라는 것은 내가 한번 더 창고에 다녀와야 감당한 양, 음수라면 내가 나온김에 처리할 수 있는 양임을 뜻함
            }
        }
        
      
        return answer;
    }
    
}
