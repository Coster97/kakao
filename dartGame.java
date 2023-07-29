import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class dartGame {
    static ArrayList<Integer> arr = new ArrayList<>();
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        solution(str);
        System.out.println(arr.toString());

    }
    public static int solution(String dartResult) {

        StringBuilder sb = new StringBuilder();
        int answer = 0;
        String sum;
        int score = 0;
       
        for(int i = 0 ; i < dartResult.length(); i ++){
            
            if(dartResult.charAt(i) != '*' && dartResult.charAt(i) != '#' && dartResult.charAt(i) != 'S'  && dartResult.charAt(i) != 'D' && dartResult.charAt(i) != 'T' ){
                sb.append(dartResult.charAt(i));
            }
            else{
                score = Integer.parseInt(sb.toString());
                System.out.println(score);
                sb.setLength(0);
            }
            System.out.println(sb);

            if(dartResult.charAt(i) == 'S' || dartResult.charAt(i) == 'D' || dartResult.charAt(i) == 'T' || dartResult.charAt(i) == '*' || dartResult.charAt(i) == '#'){
                char SDT = dartResult.charAt(i);
                switch(SDT){
                    case 'S' : arr.add(score);
                    break;
                    case 'D' : arr.add(score * score);
                    break;
                    case 'T' : arr.add(score * score * score);
                    break;
                    case '*' : 
                    if(arr.size() == 1){
                        arr.set(0, arr.get(0) * 2);
                    }
                   
                    if(arr.size() > 1){
                        arr.set(arr.size()-1, arr.get(0) * 2);
                        arr.set(arr.size()-2, arr.get(0) * 2);
                    }
                    break;
                    case '#' : 
                        arr.set(arr.size()-1, arr.get(arr.size()-1)-1);
                    break;
                }
            }
           
        }
        return answer;
    }
    
}
