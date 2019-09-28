import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        Scanner scanner = new Scanner(System.in);
        Integer num = Integer.parseInt(scanner.nextLine());
        num = KotlinMainKt.sumDigits(num);
        //num = sumDigits(num);
        System.out.println(num);

    }

    public static Integer sumDigits(Integer number)
    {
        String sNumber = number.toString();
        int iNum = 0;
        for (int i = 0; i < sNumber.length(); i++) {
             iNum += Integer.parseInt(String.valueOf(sNumber.charAt(i)));
        }
        return iNum;
    }
}
