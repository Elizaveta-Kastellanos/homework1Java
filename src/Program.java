import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // 1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
        IOHelper hl = new IOHelper();
        int numberDrawn = hl.saveRandomNumber();
        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = hl.CountUpNumberDrawn(numberDrawn);
        System.out.println(n);
        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        // 5. Сохранить оба массива в файлы с именами m1 и m2 соответственно.
        System.out.println("Введите число n: ");
        Scanner scan = new Scanner(System.in);
        boolean checkNum = scan.hasNextInt();
        int n1 = scan.nextInt();
        if (checkNum) {
            int[] m1 = hl.writeArrayMultipleOfN(n1);
            try (FileWriter fl = new FileWriter("m1.txt", false)) {
                for (int i = 0; i < m1.length - 1; i++) {
                    fl.write(m1[i] + ",");
                }
                fl.close();
            }
            catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            try (FileWriter fl = new FileWriter("m2.txt", false)) {
                int[] m2 = hl.writeArrayNon_multiplesOfN(n1);
                for (int i = 0; i < m2.length - 1; i++) {
                    fl.write(m2[i] + ",");
                }
                fl.close();
            }
            catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("Упс!Попробуй ввести число");
        }
    }
}








