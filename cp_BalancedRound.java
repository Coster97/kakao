import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class cp_BalancedRound {
    static Integer[] arr;
    static int answer = 0;
    static int answer2 = 0;
    static int min = 0;

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < t; i ++){
            String nk = br.readLine();
            StringTokenizer st = new StringTokenizer(nk, " ");
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            String str = br.readLine();
            StringTokenizer st2 = new StringTokenizer(str, " ");
            arr = new Integer[n];
            for(int j = 0; j < n; j ++){
                arr[j] = Integer.parseInt(st2.nextToken());
            }
            Arrays.sort(arr);
            
            for(int j = 0; j < arr.length-1; j ++){
                if(arr[j+1] - arr[j] > k ){
                    answer ++;
                
                }else{
                    break;
                }
            }
            Arrays.sort(arr,Collections.reverseOrder());
            System.out.println(Arrays.toString(arr));
            for(int j = 0; j < arr.length-1; j ++){
                if(arr[j] - arr[j+1] > k ){
                    answer2 ++;
                   
                }else{
                    break;
                }
            }
            if(answer == answer2){
                
            }
            System.out.println(answer);
            

        }
        

    }
    
}
