/* 
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит 
 * пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить 
 * нельзя.
 */

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        string = string.trim();
        if(string.isEmpty())
            throw new IllegalArgumentException("Строка пустая!");
        else
            System.out.println(string);
    }
}
