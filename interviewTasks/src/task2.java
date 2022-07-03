import java.util.Scanner;

public class task2 {

    public static Scanner scanner = new Scanner(System.in);
    static long checkPrime(int n){
        if(n <= 2){
            return 0L;
        }
        boolean checker = true;
        long result = 2L;
        int m;
        for(int i = 3; i <= n; i++){
            m = i / 2;
            for (int j = 2; j <= m; j++) {
                if (i % j == 0) {
                    checker = false;
                    break;
                }
            }
            if (checker) {
                result = result * i;
            }
            checker = true;
        }
        return result;
    }

    public static Integer numberValidation(Integer number){
        if(number <= 1018)
            return number;

        while(number > 1018) {
            System.out.println("please insert number less than 1018: ");
            number = scanner.nextInt();
        }

        return number;
    }

    public static void main(String[] args) {
        int count = 0;
        System.out.println("insert number >> ");
        String num = String.valueOf(checkPrime(numberValidation(scanner.nextInt())));
        for(int i = num.length() - 1; i != -1; i--){
            if(num.charAt(i) == '0'){
                count++;
            }
            else break;
        }
        System.out.println(count);

    }
}
