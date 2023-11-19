package Designpatterns.abstarctFactory;

import Designpatterns.abstarctFactory.components.Button.AndroidButton;
import Designpatterns.abstarctFactory.components.Button.Button;
import Designpatterns.abstarctFactory.components.Menu.AndroidMenu;
import Designpatterns.abstarctFactory.components.Menu.Menu;

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
