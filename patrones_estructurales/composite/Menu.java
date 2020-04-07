package patrones_estructurales.composite;

import java.util.ArrayList;

public class Menu implements IMenu {

    private ArrayList<IMenu> menus;

    public Menu() {
        this.menus = new ArrayList<IMenu>();

    }

    public boolean open() {
        System.out.println("Open!");
        return true;

    }

  

    public boolean close() {
        System.out.println("Colse!");
        return false;

    }

    public void addMenu(IMenu menu){
        this.menus.add(menu);
    }

    public IMenu getMenu(int index){
        return this.menus.get(index);
    }

}