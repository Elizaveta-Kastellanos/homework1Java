import Interfaces.IColor;

public class Color implements IColor {
    private String colorName;

    @Override
    public String GetColor() {
        return this.colorName;
    }

    @Override
    public void SetColor(String colorName) {
        this.colorName = colorName;
    }
}
