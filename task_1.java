/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
 приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        inputFlout();
    }
    private static float inputFlout() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Ввод дробного числа");
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                // TODO: handle exception
                System.out.println("Введите дробное число! ");
            }
    }
}
}