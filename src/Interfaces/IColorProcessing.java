package Interfaces;

import java.util.List;

public interface IColorProcessing {
    public void AddColor(String nameColor) throws Exception;
    public void ChangeColor(List<IColor> changeColor, boolean flag) throws Exception;
    public List<IColor> GetColor() throws Exception;
    public boolean CheckColor(String nameColor) throws Exception;
}
