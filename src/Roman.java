
public class Roman {
    public static int calculation(String value1, String value2, String operator) throws Exception {

        if (value2.equals("I") || value2.equals("II") || value2.equals("III") || value2.equals("IV") || value2.equals("V") || value2.equals("VI") || value2.equals("VII") || value2.equals("VIII") || value2.equals("IX") || value2.equals("X")) {

            char[] opers = {'+', '-', '/', '*'};
            int rom1 = Roman.convertRom(value1);
            int rom2 = Roman.convertRom(value2);
            char op = operator.charAt(0); // ********

            int result;

            if (op == opers[0] || op == opers[1] || op == opers[2] || op == opers[3] ) {
                try {
                    result = operationRom(rom1, rom2, op);
                    String resultRoman = converter(result);
                    System.out.println(resultRoman);

                } catch (Exception e) {
                    throw new Exception("В римской системе нет отрицательных чисел");

                }
                return result;

            } else {
                throw new Exception("Неверный знак операции");
            }
        }else {
            throw new Exception("Используйте числа от 1 до 10 включительно и только арабскими или римскими цифрами одновременно");
        }
    }

    private static String converter (int result) {

        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String str = roman[result];
        return str;
    }
    static int convertRom(String roman) {

        if (roman.equals("I")) {
            return 1;
        } else if (roman.equals("II")) {
            return 2;
        } else if (roman.equals("III")) {
            return 3;
        } else if (roman.equals("IV")) {
            return 4;
        } else if (roman.equals("V")) {
            return 5;
        } else if (roman.equals("VI")) {
            return 6;
        } else if (roman.equals("VII")) {
            return 7;
        } else if (roman.equals("VIII")) {
            return 8;
        } else if (roman.equals("IX")) {
            return 9;
        } else if (roman.equals("X")) {
            return 10;
        }
        return 0;
    }

    public static int operationRom(int rom1, int rom2, char op) throws Exception {
        int result = 0;


            switch (op) {
                case '+':
                    result = rom1 + rom2;
                    break;
                case '-':
                    result = rom1 - rom2;
                    break;
                case '*':
                    result = rom1 * rom2;
                    break;
                case '/':
                    result = rom1 / rom2;
                    break;
                default:
                    throw new Exception("Неверный знак операции");

            }
                return result;
        }
    }



