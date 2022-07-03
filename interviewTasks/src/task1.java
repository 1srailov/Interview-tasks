import java.util.Scanner;

public class task1 {
    public static Scanner  scanner = new Scanner(System.in);

    public static Integer findDifference(int[][] nums){
        for(int i = 0; i < 7; i++)
            for(int j = 0; j < 7; j++)
                if(nums[i][j] == 1){
                    int a = i < 3 ? 3 - i : i - 3;
                    int b = j < 3 ? 3 - j : j - 3;
                    return a + b;
                }
        return 0;
    }

    public static Integer numberValidation(Integer number){
        if(number <= 7)
            return number - 1;

        while(number > 7) {
            System.out.println("please insert number less than seven: ");
            number = scanner.nextInt();
        }

        return number - 1;
    }

    public static void main(String[] args){

        System.out.println("0 0 0 0 0 0 0\n" +
                "0 0 0 0 0 0 0\n" +
                "0 0 0 0 0 0 0\n" +
                "0 0 0 0 0 0 0\n" +
                "0 0 0 0 0 0 0\n" +
                "0 0 0 0 0 0 0\n" +
                "0 0 0 0 0 0 0\n");

        System.out.println("insert row: ");
        int a = numberValidation(scanner.nextInt());
        System.out.println("insert line: ");
        int b = numberValidation(scanner.nextInt());

        int[][] place = new int[7][7];

        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                if(i == a && j == b)
                    place[i][j] = 1;
                else
                    place[i][j] = 0;
            }
        }

        System.out.println(findDifference(place));
    }
}
