
public class CalculateSumUntilSingleDigit {
    //cho một số nguên tính tổng các số trong số nguyên đó cho đến khi nhỏ hơn 10;

    public static int calculateSumUntilSingleDigit(int number){
        if(number<10 && number >=0) return number;
        if(number<0) number=Math.abs(number);
        int sum=0;
        while(number!=0){
            sum+=number%10;
            number/=10;
        }
        if(sum>=10){
            sum=calculateSumUntilSingleDigit(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculateSumUntilSingleDigit(899));
    }
}
