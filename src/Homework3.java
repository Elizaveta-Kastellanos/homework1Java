import Interfaces.IColor;
import Interfaces.IColorProcessing;

import java.util.ArrayList;
import java.util.List;

public class Homework3 {
    // 1.) Создать новый список, добавить несколько строк и вывести коллекцию на экран.
    public List<String> CreateAndAddNewList(String str1, String str2){
        List<String> myList = new ArrayList<>();
        myList.add(str1);
        myList.add(str2);
        return myList;
    }
    // 2.) Итерация всех элементов списка цветов и добавления к каждому символа '!'.
    public void AdditionToEachCharExclamationPoint() throws Exception{
        IColorProcessing cp = new ColorProcessing();
        List<IColor> colors = cp.GetColor();
        List<IColor> changeColor = new ArrayList<>();
        for (IColor item:colors){
            String nStr = item.GetColor() + "!";
            item.SetColor(nStr);
            changeColor.add(item);
        }
        cp.ChangeColor(changeColor, false);
    }
    // 3.) Вставить элемент в список массивов в первой позиции.
    public List<int[]> InsertItemInHead(int[] mas){
        List<int[]> myListArray = new ArrayList<>();
        myListArray.add(new int[]{1,2,3});
        myListArray.add(new int[]{4,5,6});
        myListArray.add(new int[]{7,8,9});
        myListArray.add(0,mas);
        return myListArray;
    }
    // 4.) Извлечь элемент (по указанному индексу) из заданного списка.
    public String ExtractItemFromList(int index) throws Exception{
        IColorProcessing cp = new ColorProcessing();
        List<IColor> colors = cp.GetColor();
        if (index >= colors.size() || index < 0 ){
           new IndexOutOfBoundsException("Index out of range");
        }
        else {
             IColor color = colors.get(index);
             return color.GetColor();
        }
        return "Index out of range";
    }
    // 5.) Обновить определенный элемент списка по заданному индексу.
    public String ChangeByIndex(int index, String nameColor) throws Exception{
        IColorProcessing cp = new ColorProcessing();
        List<IColor> colors = cp.GetColor();
        if (index >= colors.size() || index < 0 ){
            return "Index out of range";
        }
        if (cp.CheckColor(nameColor) == false){
            IColor color = new Color();
            color.SetColor(nameColor);
            colors.add(index,color);
            cp.ChangeColor(colors, true);
            return "Great color under index of " + index + " added";
        } else {
            return "Sorry this color already exists in the database";
        }
    }
    // 6.) Удалить третий элемент из списка.
    public String DeleteThreeElemFromList() throws Exception{
        final int index = 2;
        IColorProcessing cp = new ColorProcessing();
        List<IColor> colors = cp.GetColor();
        if (colors.size() > index){
            colors.remove(index);
            cp.ChangeColor(colors, true);
            return "You have successfully deleted the item";
        }
        return "Unfortunately, there is no element at index 3 in the list. You can use the method AddColor";
    }
    // 7.) Поиска элемента в списке по строке.
    public String FindItemBySrting(String nameColor) throws Exception{
        IColorProcessing cp = new ColorProcessing();
        List<IColor> colors = cp.GetColor();
        int count = 0;
        for (IColor item: colors){
            if (item.GetColor().equals(nameColor)){
                return "This " + nameColor + " has in list. It has index " + count;
            }
            count++;
        }
        return "Element doesn't find(";
    }
    // 8.) *Сортировка заданного списка массивов.
    // 9.) *Копирования одного списка массивов в другой.
}
