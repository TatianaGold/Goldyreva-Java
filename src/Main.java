import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            num();
        } catch (InputMismatchException e) {
            System.out.println("Введите дробное число с запятой");
            num();
        }
        name();
        array();
    }

    public static void num() {

        Scanner sc = new Scanner(System.in);
        if (sc.nextDouble() > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Введите число больше 7");
            num();
        }
    }

    public static void name() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
            name();
        }
    }

    public static void array() {
        double[] nums = {5.1,33.3,39,9,21,48.1,71.2,6.66,15,99};

        System.out.println(Arrays.toString(DoubleStream.of(nums).filter(x -> x % 3 == 0).toArray()));
    }
}




