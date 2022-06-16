import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        start();

        Scanner scan = new Scanner(System.in);

        while (true) {
            String line = scan.nextLine();

            try {
                String[] string = line.split(" ");
                if (string.length != 3) throw new Exception("Что-то пошло не так, попробуйте еще раз");

                String value1 = string[0];
                String operator = string[1];
                String value2 = string[2];


                if (value1.equals("1") || value1.equals("2") || value1.equals("3") || value1.equals("4") || value1.equals("5") || value1.equals("6") || value1.equals("7") || value1.equals("8") || value1.equals("9") || value1.equals("10")) {

                    Arabian.calculation(value1, value2, operator);


                }else if(value1.equals("I") || value1.equals("II") || value1.equals("III") || value1.equals("IV") || value1.equals("V") || value1.equals("VI") || value1.equals("VII") || value1.equals("VIII") || value1.equals("IX") || value1.equals("X")){

                    Roman.calculation(value1, value2, operator);

                }else {
                    throw new Exception("Используйте числа от 1 до 10 включительно и только арабскими или римскими цифрами одновременно");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
    private static void start() {
        System.out.println("Введите выражение, два операнда и один оператор (+, -, /, *),арабскими или римскими цифрами от 1 до 10, ");
        System.out.println("каждое число через пробел от знака операции: ");
    }
}







