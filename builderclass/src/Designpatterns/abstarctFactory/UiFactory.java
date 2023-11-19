package Designpatterns.abstarctFactory;

import Designpatterns.abstarctFactory.components.Button.Button;
import Designpatterns.abstarctFactory.components.Menu.Menu;
public interface UiFactory {
    Button createButton();
    Menu createMenu();
}
