import java.util.*;

public class expired {

    public static void main(String[] args) {
        System.out.println(solution("2020.01.01", new String[]{"Z 3", "D 5"}, new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"}));
       
    }

    public static ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
     
        String[] todayString = today.split("\\."); //점을 특수문자로 인식하지 않게
        int year = Integer.parseInt(todayString[0]);
        int month = Integer.parseInt(todayString[1]);
        int day = Integer.parseInt(todayString[2]);
        int dateToday = year * 12 * 28 + month * 28 + day;

        HashMap<String, Integer> arr = new HashMap<>();
        for(String term : terms){
       
            String type = term.split(" ")[0];
            int typeMonth = Integer.parseInt(term.split(" ")[1]);

            arr.put(type, typeMonth);
       
        }
 
        for(int i = 0 ; i < privacies.length; i ++){
            
            String priDate = privacies[i].split(" ")[0];
            String[] todayString2 = priDate.split("\\."); //점을 특수문자로 인식하지 않게
            int year2 = Integer.parseInt(todayString2[0]);
            int month2 = Integer.parseInt(todayString2[1]);
            int day2 = Integer.parseInt(todayString2[2]);
           
            int dateToday2 = year2 * 12 * 28 + month2 * 28 + day2;
            int plusDate = arr.get(privacies[i].split(" ")[1]);
           
            if(dateToday2 + plusDate * 28 <= dateToday){
               answer.add(i + 1);
            }
          
        }
        
        return answer;
    }
}
