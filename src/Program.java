import com.sun.source.util.SourcePositions;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // 1.)
        Homework2 hw2 = new Homework2();
        String str1 = "Hello my sweet candy, my yummy muffin";
        String str2 = "my";
        System.out.println(hw2.Task1(str1,str2));
        // 2.)
        String one = "1,2,3,4,5";
        String two = "5,4,3,2,1";
        System.out.println(hw2.CheckForReverse(one, two));
        // 3.)
        String task2 = "Hello,my name is Krullia";
        char[] mas = task2.toCharArray();
        hw2.RecursionReverse(mas, 0, mas.length - 1);
        System.out.print(new String(mas));
        System.out.println("------------------");
        // 4.)
        int a = 3;
        int b = 56;
        ArrayList<String> lsStr = hw2.MakingStrOfTwoNums(a,b);
        lsStr.forEach((elem) -> System.out.println(elem));
        // 5.)
        System.out.println(hw2.DeleteandInsertCharEquals("2+2 = 4"));
        // 6.)
        System.out.println(hw2.ReplaceCharEquals("2+2 = 4"));
        // 7.)
        System.out.println(hw2.Comparison());
    }
}








