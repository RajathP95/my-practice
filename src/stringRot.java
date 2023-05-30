import java.util.HashMap;

public class stringRot {
    public static boolean isSubstring(String s1, String s2){
        if(s1.contains(s2)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isRotation(String s1, String s2){
        int len=s1.length();
        if(len == s2.length() && len > 0 ){
            String s1s1 = s1 + s1;
            System.out.println(s1s1);
            return isSubstring(s1s1,s2);
        }
        return false;
    }
    public static void main(String[] args){
        String s1 = "waterbottle";
        String s2 = "srbottlewat";
        boolean res = isRotation(s1,s2);
        System.out.println(res);
    }
}
