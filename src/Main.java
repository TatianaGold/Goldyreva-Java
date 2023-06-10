import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        num();
        name();
        array();
    }

    public static void num() {
        Scanner sc = new Scanner(System.in);
        if (sc.nextInt() > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Введите число больше 7");
            num();
        }
    }

    public static void name() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (name.equalsIgnoreCase("вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
            name();
        }
    }

    public static void array() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        int[] nums = new int [size];
        System.out.println("Введите числа: ");

        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Числа в массиве кратные 3: "+ Arrays.toString(IntStream.of(nums).filter(x -> x % 3 == 0).toArray())) ;
    }
}





