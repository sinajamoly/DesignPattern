package Bridge;

public abstract class Shape {
    protected Color color;

    public Shape(Color color)
    {
        this.color = color;
    }

    public void RenderColor()
    {
        this.color.renderColor();
    }
}
