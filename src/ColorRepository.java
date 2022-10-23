import Interfaces.IColor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ColorRepository {
    private static final String file = "color.txt";
    final static String changeFile = "ChangeColor.txt";

    public static List<IColor> GetMockListWithColors() throws Exception{
        List<IColor> colors = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String nameColor;
        while ((nameColor = br.readLine()) != null){
            IColor color = new Color();
            color.SetColor(nameColor);
            colors.add(color);
        }
        br.close();
        return colors;
    }

    public static void SaveNewColor(IColor color) {
        try (FileWriter fl = new FileWriter(file, true)) {
            fl.write(color.GetColor() + "\n");
            fl.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void ChangeColor(List<IColor> newColor, boolean flag){
        if (flag){
            try (FileWriter fl = new FileWriter(file, false)) {
                for (IColor item: newColor){
                    fl.write(item.GetColor() + "\n");
                }
                fl.close();
            }
            catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            try (FileWriter fl = new FileWriter(changeFile, false)) {
                for (IColor item:newColor){
                    fl.write(item.GetColor() + "\n");
                }
                fl.close();
            }
            catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}


