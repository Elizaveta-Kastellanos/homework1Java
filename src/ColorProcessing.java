import Interfaces.IColor;
import Interfaces.IColorProcessing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ColorProcessing implements IColorProcessing {

    private static List<IColor> colors = new ArrayList<>();

    @Override
    public List<IColor> GetColor() throws Exception {
        return ColorRepository.GetMockListWithColors();
    }

    @Override
    public void AddColor(String nameColor) throws Exception {
        colors = GetColor();
        if (CheckColor(nameColor) == false){
            IColor color = new Color();
            color.SetColor(nameColor);
            ColorRepository.SaveNewColor(color);
        }
    }

    @Override
    public void ChangeColor(List<IColor> changeColor, boolean flag) throws Exception{
        ColorRepository.ChangeColor(changeColor, flag);
    }

    @Override
    public boolean CheckColor(String nameColor) throws Exception{
        colors = GetColor();
        boolean check = false;
        for (IColor item: colors){
            String tmp = item.GetColor();
            if (tmp.equals(nameColor)){
                check = true;
            }
        }
        return check;
    }





}
