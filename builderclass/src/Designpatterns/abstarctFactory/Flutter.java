package Designpatterns.abstarctFactory;

public class Flutter {
    public void setTheme(){
        System.out.println("setting the theme");
    }
    public void setUI(){
        System.out.println("setting ui");
    }
    public UiFactory createFactory(SupportedPlatform platform){
//      1)here we are violating ocp
//      2)it is best coding practise that if we create a ocp code in another class
//        if(platform.contains("Android")){
//            return new AndroidFactory();
//        }else if(platform.contains("Ios")){
//            return new IosFactory();
//        }

//        if(platform.equals(SupportedPlatform.ANDROID)){
//            return new AndroidFactory();
//        }else if(platform.equals(SupportedPlatform.IOS)){
//            return new IosFactory();
//        }
        return UIFactoryCreator.Creator(platform);
    }
}
