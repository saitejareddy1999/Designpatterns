package abstarctFactory;

import abstarctFactory.components.Button.Button;
import abstarctFactory.components.Button.IosButton;
import abstarctFactory.components.Menu.IosMenu;
import abstarctFactory.components.Menu.Menu;

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
