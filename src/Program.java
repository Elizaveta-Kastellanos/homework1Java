import java.util.List;

public class Program {
    public static void main(String[] args) throws Exception {
        // 1.)
        String str1 = "Ivanova Marina";
        String str2 = "Petrov Alexandr";
        Homework3 hw3 = new Homework3();
        List<String> myList = hw3.CreateAndAddNewList(str1,str2);
        myList.forEach(n -> System.out.println(n));
        // 2.)
         hw3.AdditionToEachCharExclamationPoint();
        // 3.)
        List<int[]> myNumArray = hw3.InsertItemInHead(new int[]{-3,-2, -1});
        int[] mas = myNumArray.get(0);
        System.out.println(mas[0]+ "," + mas[1] + "," + mas[2]);
        // 4.)
        System.out.println(hw3.ExtractItemFromList(0));
        // 5.)
        System.out.println(hw3.ChangeByIndex(3, "Light Green"));
        // 6.)
        //System.out.println(hw3.DeleteThreeElemFromList());
        // 7.)
        System.out.println(hw3.FindItemBySrting("AbraKadabra"));

    }
}








