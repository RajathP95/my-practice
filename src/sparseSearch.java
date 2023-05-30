import java.util.HashMap;

public class sparseSearch {
    public static int search(String[] strings, String str,int first,int last){
        if(first>last) return -1;
        int mid = (first+last)/2;
        if(strings[mid].isEmpty()) {
            int left = mid - 1, right = mid + 1;
            while (true) {
                if(left<first || right > last){
                    return -1;
                }else if(right <= last && !strings[right].isEmpty()){
                    mid=right;
                    break;
                }else if(left>=first && !strings[left].isEmpty()){
                    mid=left;
                    break;
                }
                left--;
                right++;
            }
        }
        if(strings[mid].equals(str)){
            return mid;
        }else if(strings[mid].compareTo(str) < 0){
            search(strings,str,mid+1,last);
        }else{
            search(strings, str, first, mid-1);
        }
        return 1;
    }
    public static void main(String[] args){
        String str = "ball";
        String[] strings = {"at","","","ball","","bat","","time"};
        int res = search(strings, str,0,strings.length-1);
        System.out.println(res);
    }
}
