package abstarctFactory;

public class UIFactoryCreator {
    public static UiFactory Creator(SupportedPlatform platform){
        if(platform.equals(SupportedPlatform.ANDROID)){
            return new AndroidFactory();
        }else if(platform.equals(SupportedPlatform.IOS)){
            return new IosFactory();
        }
        return null;
    }

}
