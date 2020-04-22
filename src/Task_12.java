import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine(); // запись введённой строки в строковую переменную
        System.out.println("Ваша строка без пробелов: " + str.replace(" ", "")); //при выводе строки убираем символ пробела
    }
}
