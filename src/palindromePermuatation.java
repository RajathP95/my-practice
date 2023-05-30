import java.util.HashMap;

public class palindromePermuatation {

    public static boolean isPalindrome(String s){
        HashMap<Character,Integer> mapper = new HashMap<>();
        int odds=0;
        for(char c:s.toCharArray()){
            if(c!=' ') {
//                System.out.println("c");
                mapper.put(c, mapper.getOrDefault(c, 0) + 1);
            }
        }
        for(int n: mapper.values()){
            if(n%2!=0){
                odds++;
            }
            if(odds>1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "taci coa";
        boolean res = isPalindrome(s);
        System.out.println(res);
    }
}
