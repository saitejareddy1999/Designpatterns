package abstarctFactory;

import abstarctFactory.components.Button.AndroidButton;
import abstarctFactory.components.Button.Button;
import abstarctFactory.components.Menu.AndroidMenu;
import abstarctFactory.components.Menu.Menu;

public class AndroidFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
