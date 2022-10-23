import java.util.ArrayList;

public class Homework2 {
    private final char _chEquals = '=';
    private final String _equalsStr = "равно";
    //1.) Напишите программу на Java, чтобы найти наименьшее окно в строке,
    //     содержащей все символы другой строки.
    public int Task1(String str1, String str2){
        return str1.indexOf(str2);
    }

    //2.) Напишите программу на Java, чтобы проверить,
    //     являются ли две данные строки вращением друг друга.

    public boolean CheckForReverse(String one, String two){
        if (one.length() != two.length()){
            return false;
        } else {
            boolean check = false;
            int indexOneStr = 0;
            int indexTwoStr = two.length() - 1;
            for (int i = 0; i < one.length(); i++){
                if(one.charAt(indexOneStr) == two.charAt(indexTwoStr)){
                    check = true;
                    indexOneStr++;
                    indexTwoStr--;
                } else {
                    return false;
                }

            }
            return true;
        }
    }

    //3.) *Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.
    private static void HelperReverse(char[] mas, int a,int b){
        char tmp = mas[a];
        mas[a] = mas[b];
        mas[b] = tmp;
    }
    public void RecursionReverse(char[] mas, int a, int b){
        if (a < b){
            HelperReverse(mas, a,b);
            RecursionReverse(mas, a + 1, b - 1);
        }
    }

    // 4.) Дано два числа,
    //     например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168
    //     Используем метод StringBuilder.append().

    private static String StrSum(int oneNum, int twoNum){
        int sum = oneNum + twoNum;
        StringBuilder strB = new StringBuilder();
        strB.append(oneNum);
        strB.append(" + ");
        strB.append(twoNum);
        strB.append(" = ");
        strB.append(sum);
        return strB.toString();
    }
    private static String StrSubtraction(int oneNum, int twoNum){
        int subtraction = oneNum - twoNum;
        StringBuilder strB = new StringBuilder();
        strB.append(oneNum);
        strB.append(" - ");
        strB.append(twoNum);
        strB.append(" = ");
        strB.append(subtraction);
        return strB.toString();
    }
    private static String StrMult(int oneNum, int twoNum){
        int multiplication = oneNum * twoNum;
        StringBuilder strB = new StringBuilder();
        strB.append(oneNum);
        strB.append(" * ");
        strB.append(twoNum);
        strB.append(" = ");
        strB.append(multiplication);
        return strB.toString();
    }
    public ArrayList MakingStrOfTwoNums(int oneNum, int twoNum){
        ArrayList<String> lsStr = new ArrayList<>();
        lsStr.add(StrSum(oneNum, twoNum));
        lsStr.add(StrSubtraction(oneNum,twoNum));
        lsStr.add(StrMult(oneNum,twoNum));
        return lsStr;
    }
    // 5.) Замените символ “=” на слово “равно”.
    //      Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

    public String DeleteandInsertCharEquals(String txt){
        StringBuilder strB = new StringBuilder();
        strB.append(txt);
        boolean checkCharEquals = true;
        while (checkCharEquals){
            int index = strB.indexOf(String.valueOf(_chEquals));
            if (index != -1){
                strB.deleteCharAt(index);
                strB.insert(index,_equalsStr);
            } else {
                break;
            }
        }
        return strB.toString();
    }

    // 6.) *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

    public String ReplaceCharEquals(String txt){
        StringBuilder strB = new StringBuilder();
        strB.append(txt);
        boolean checkCharEquals = true;
        while(checkCharEquals){
            int index = strB.indexOf(String.valueOf(_chEquals));
            if(index != -1){
                StringBuilder str = strB.replace(index, index+1, _equalsStr);
            } else {
                break;
            }
        }
        return strB.toString();
    }

    // перегрузка для stringBuilder
    public String ReplaceCharEquals(StringBuilder txt){
        boolean checkCharEquals = true;
        while(checkCharEquals){
            int index = txt.indexOf(String.valueOf(_chEquals));
            if(index != -1){
                StringBuilder str = txt.replace(index, index+1, _equalsStr);
            } else {
                break;
            }
        }
        return txt.toString();
    }

    // Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов
    // "=" средствами String и StringBuilder.
    private long CounterTimeString(){
        String str = new String();
        for(int i = 0;i<10000;i++){
            str+="=";
        }
        String str2 = "";
        long start = System.nanoTime();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == _chEquals){
                str2 += "равно";
            }
        }
        long end = System.nanoTime();
        return end - start;
    }
    private long CounterTimeStringBuilder(){
        StringBuilder str = new StringBuilder();
        for(int i = 0;i < 10000;i++){
            str.append(_chEquals);
        }
        long start = System.nanoTime();
        ReplaceCharEquals(str);
        long end = System.nanoTime();
        return end - start;
    }

    public String Comparison(){
        long subtraction = CounterTimeString() - CounterTimeStringBuilder();
        return "Время затраченное на преобразование String: " + CounterTimeString() + "ns\n" +
                "Время затраченное на преобразование StringBuilder: " + CounterTimeStringBuilder() + "ns\n" +
                "StringBuilder работает быстрее String на: " + subtraction + "ns";
    }

    // It is from the class program
    //        // 1.)
//        Homework2 hw2 = new Homework2();
//        String str1 = "Hello my sweet candy, my yummy muffin";
//        String str2 = "my";
//        System.out.println(hw2.Task1(str1,str2));
//        // 2.)
//        String one = "1,2,3,4,5";
//        String two = "5,4,3,2,1";
//        System.out.println(hw2.CheckForReverse(one, two));
//        // 3.)
//        String task2 = "Hello,my name is Krullia";
//        char[] mas = task2.toCharArray();
//        hw2.RecursionReverse(mas, 0, mas.length - 1);
//        System.out.print(new String(mas));
//        System.out.println("------------------");
//        // 4.)
//        int a = 3;
//        int b = 56;
//        ArrayList<String> lsStr = hw2.MakingStrOfTwoNums(a,b);
//        lsStr.forEach((elem) -> System.out.println(elem));
//        // 5.)
//        System.out.println(hw2.DeleteandInsertCharEquals("2+2 = 4"));
//        // 6.)
//        System.out.println(hw2.ReplaceCharEquals("2+2 = 4"));
//        // 7.)
//        System.out.println(hw2.Comparison());
}
