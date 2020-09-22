package Composition;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    protected String name;

    protected String url;

    protected List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();

    public String getName()
    {
        return this.name;
    }

    public String getUrl()
    {
        return this.url;
    }

    protected String print(MenuComponent menuComponent)
    {
        StringBuilder builder = new StringBuilder(menuComponent.name);

        builder.append(": ");
        builder.append(menuComponent.url);
        builder.append("\n");

        return builder.toString();
    }

    public MenuComponent add(MenuComponent menuComponent)
    {
        this.menuComponents.add(menuComponent);

        return menuComponent;
    }

    public MenuComponent remove(MenuComponent menuComponent)
    {
        this.menuComponents.remove(menuComponent);

        return menuComponent;
    }

    public abstract String toString();
}
