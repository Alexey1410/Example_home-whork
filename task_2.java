/*Задание 2
 *  Если необходимо, исправьте данный код.
 * добавил массив
 */



public class task_2 {
    public static void main(String[] args) {
        correctCode();
    }
    private static void correctCode() {
    try {
        int[] intArray = {1, 2, 3, 5, 6, 7};
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exeption: " + e);
    }
}

}