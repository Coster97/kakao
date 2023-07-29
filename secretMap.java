// import java.util.Arrays;

// class secretMap{

//     static String[] answer;
    
//     public static void main(String[] args){

//         int n = 6;
//         int[] arr1 = {46, 33, 33 ,22, 31, 50};
//         int[] arr2 = {27 ,56, 19, 14, 14, 10};

//         solution(n, arr1, arr2);

//         System.out.println(Arrays.toString(answer));
//     }



//     public static String[] solution(int n, int[] arr1, int[] arr2) {
//         answer = new String[n];
//         StringBuilder sb = new StringBuilder();
       
//         for(int i = 0; i < n; i ++){
            
//             sb.setLength(0);


//             String binary = Integer.toBinaryString(arr1[i]);
//             String binary2 = Integer.toBinaryString(arr2[i]);

//             while(true){

//                 if(binary.length() == n){
//                     break;
//                 }

//                 if(binary.length() < n){
//                     binary = "0"+binary;
//                 }
               
//             }
//             while(true){

//                 if(binary2.length() == n){
//                     break;
//                 }

//                 if(binary2.length() < n){
//                     binary2 = "0"+binary2;
//                 }
//             }
        
    

//             System.out.println(binary);
//             System.out.println(binary2);
//             for(int j = 0; j < 6; j ++){

//                  if(binary.charAt(j) == '0' && binary2.charAt(j) == '0'){
//                      sb.append(" ");
                     
//                  }else if(binary.charAt(j) == '1' && binary2.charAt(j) == '0' || binary.charAt(j) == '0' && binary2.charAt(j) == '1' || binary.charAt(j) == '1' && binary2.charAt(j) == '1'){
//                       sb.append("#");
//                  }
//             }
      
//             answer[i] = sb.toString();
           
//         }
//         return answer;

//     }
    
// }


class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }
}