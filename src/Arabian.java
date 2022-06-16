public class Arabian {
    public static int calculation(String value1, String value2, String operator) throws Exception {

        if (value2.equals("1") || value2.equals("2") || value2.equals("3") || value2.equals("4") || value2.equals("5") || value2.equals("6") || value2.equals("7") || value2.equals("8") || value2.equals("9") || value2.equals("10")) {

            int val1 = Integer.valueOf(value1);
            int val2 = Integer.valueOf(value2);
            char op = operator.charAt(0);

            int result;

            try {
                result = operation(val1, val2, op);
            } catch (Exception e) {
                throw new RuntimeException(e);

            }
            System.out.println(result);
            return result;

        } else {
            throw new Exception("Используйте числа от 1 до 10 включительно и только арабскими или римскими цифрами одновременно");
        }
    }

    public static int operation(int val1, int val2, char op) throws Exception {
        int result;

            switch (op) {
                case '+':
                    result = val1 + val2;
                    break;
                case '-':
                    result = val1 - val2;
                    break;
                case '*':
                    result = val1 * val2;
                    break;
                case '/':
                    result = val1 / val2;
                    break;
                default:
                    throw new Exception("Неверный знак операции");
                    
            }
                return result;
        }
    }


