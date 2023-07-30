import java.util.*;

class emoticon {

    static int[] sale = {10, 20, 30, 40};
    static int[] arr;
    static int emoPlus = 0;
    static int emoAmount = 0;

    public static void main(String[] args){

        int[][] users = {{40, 10000}, {25, 10000}};
        int[] emoticons = {7000, 9000};
        System.out.println(solution(users, emoticons));


    }

    public static int[] solution(int[][] users, int[] emoticons) {

        ArrayList<Integer> arr = new ArrayList<>();

        int[] answer = new int[2];
        for(int i = 0 ; i < emoticons.length; i++){
            emoticons[i] = emoticons[i] / 100;
        }
        dfs(0, emoticons, users,  arr);
        answer[0] = emoPlus;
        answer[1] = emoAmount;
        System.out.println(answer[0]);
        return answer;
    }

    public static void dfs(int depth, int[] emoticons, int[][] users,  ArrayList<Integer> arr){

        int plusMem = 0;
        int plusAmount = 0;
        if(depth == emoticons.length){
            for(int i = 0; i < users.length; i ++){

                int userSale = users[i][0];
                int userAmount = users[i][1];
                int AllAmount = 0;
                for(int j = 0 ; j < arr.size(); j ++){
                    if(arr.get(j) >= userSale){
                        AllAmount += (100 - arr.get(j)) * emoticons[j];
                    }else{
                        continue;
                    }
                    
                    
                }
                if(AllAmount >= userAmount){
                    plusMem ++;
                }else{
                    plusAmount += AllAmount;
                }
            
            }
           
            if(emoPlus < plusMem){
                emoPlus = plusMem;
                emoAmount = plusAmount;
            }else if(emoPlus == plusMem){
                if(emoAmount < plusAmount){ 
                    emoAmount = plusAmount;
                }
            }

            
        }else{
            for(int i = 0; i < 4; i ++){
                arr.add(sale[i]);
               
                dfs(depth + 1, emoticons, users, arr);
                arr.remove(arr.size() - 1);
             
            }
        }

    }
   
}
