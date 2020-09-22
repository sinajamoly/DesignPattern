package Composition;

import java.util.Iterator;

public class MenuItem extends MenuComponent{
    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        Iterator<MenuComponent> itr = this.menuComponents.iterator();

        StringBuilder builder = new StringBuilder();

        while(itr.hasNext()) {
            MenuComponent menuComponent = itr.next();

            builder.append("child of child ");
            builder.append(menuComponent.getName());
            builder.append("\n");
        }

        return this.print(this) + builder.toString();
    }
}
