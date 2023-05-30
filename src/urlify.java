//class start{
//    public static void reverseANumber(int n){
//        int rev=0;
//        while(n>0){
//            int rem=n%10;
//            n=n/10;
//            rev = rev*10 + rem;
//        }
//        System.out.println(rev);
//
//    }
//    public static void main(String[] args){
//        int num = 123;
//        reverseANumber(num);
//    }
//}

class HelloWorld {
    public static void urlify(char[] s, int n){
        int spaceCount=0;
        for(int i=0;i<n;i++){
            if(s[i]==' '){
                spaceCount++;
            }
        }
        int index = n + spaceCount*2;
        System.out.println(index);
        for(int j=n-1;j>=0;j--){
            if(s[j]==' ') {
                s[index - 1] = '%';
                s[index - 2] = '0';
                s[index - 3] = '2';
                index-=3;
            }else{
                s[index-1]= s[j];
                index--;
            }
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        String s = "Mr John Smith    ";
        int n = 13;
        urlify(s.toCharArray(),n);
    }
}