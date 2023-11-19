package Designpatterns.abstarctFactory;

import Designpatterns.abstarctFactory.components.Button.Button;
import Designpatterns.abstarctFactory.components.Button.IosButton;
import Designpatterns.abstarctFactory.components.Menu.IosMenu;
import Designpatterns.abstarctFactory.components.Menu.Menu;

public class IosFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
