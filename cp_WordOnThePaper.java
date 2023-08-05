import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class cp_WordOnThePaper{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String str = "";
        String answer = "";
        for(int i = 0; i < t; i ++){
            for(int j = 0; j < 8; j ++){
                str = br.readLine();
                for(int k = 0; k < 8; k ++){
                     str = str.replace(".", "");
                }    
                answer += str;           
            }
            System.out.println(answer.replace(" ", ""));
            answer = "";
        }
    }
}