public class RiverCrossing {
    //Có một nhóm gồm n người tìm cách vượt qua con sông để sang bờ bên kia.
    //Cách duy nhất để vượt qua dòng sông là dùng chiếc thuyền duy nhất ở trên dòng sông.
    //Để lái được chiếc thuyền qua sông thì bắt buộc phải có một người ở trên thyền để lái.
    //Biết thuyền chỉ chở được tối đa k người.
    //Hãy tìm số lượt tối thiểu để họ có thể lái chiếc thuyền để sang bờ bên kia
    //(1 lượt là lượt đi hoặc lượt về, không bao gồm cả lượt đi lẫn lượt về).
    //Nếu nhóm người đó không thể qua sông sang bờ bên kia thì trả về -1.

    static int riverCrossing(int n,int k){
        if(k <=0 && n<=0) return -1;
        if(n<=k) return 1;
        int result =0;
        while(n>0) {
            n = n - k;
            result += 1;
            if (n > 0) {
                n++;
                result += 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Result :"+riverCrossing(3,2));
    }
}
