package abstarctFactory;

import abstarctFactory.components.Button.Button;
import abstarctFactory.components.Menu.Menu;
public interface UiFactory {
    Button createButton();
    Menu createMenu();
}
