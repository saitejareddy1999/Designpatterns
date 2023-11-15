package abstarctFactory;

import abstarctFactory.components.Button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UiFactory uifactory = flutter.createFactory(SupportedPlatform.IOS );
        Button button = uifactory.createButton();
        button.changeSize();
    }
}
