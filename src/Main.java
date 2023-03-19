import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int size = input.nextInt(); // Ввод количества строк
        String Array[] = new String[size];
        Scanner input2 = new Scanner(System.in);
        System.out.println("Введите значения строк: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Строка №" + (i + 1));
            Array[i] = input2.nextLine(); // Ввод значений этих строк
        }

        int[] count = new int[size];

        for (int i = 0; i < Array.length; i++) {
            for (int j = i; j < Array[i].length(); j++) {
                char temp = ' ';
                for (int z = j; z < Array[i].length(); z++) {

                    if (Array[i].charAt(j) != Array[i].charAt(z) && temp != Array[i].charAt(z)) {
                        temp = Array[i].charAt(z);
                        count[i]++;
                    }
                }
            }
        }
        int max = 0;
        String answer = "";
        for (int i = 0; i < count.length; i++) {
            if (max <= count[i]) {
                max = count[i];
                answer = Array[i];
            }
        }
        System.out.println("Ответ: " + answer);
    }
}