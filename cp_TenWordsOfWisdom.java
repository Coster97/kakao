import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class cp_TenWordsOfWisdom {

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < t; i ++){
            int n = Integer.parseInt(br.readLine());
            int max = 0;
            int x = 0;
            for(int j = 0; j < n; j ++){
                String str = br.readLine();
                StringTokenizer st = new StringTokenizer(str, " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                if(a <= 10){
                    if(max < b){
                        max = b;
                        x = j + 1;
                    }

                }else{
                    continue;
                }
            }
            System.out.println(x);
        }
    }
}
