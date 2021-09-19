package factoryDevices;

public class FactoryDevice {
    public enum DevicesType{
        ANDROID,
        IOS,
        WINDOWS_PHONE,
        CLOUD
    }

    public static IDevice make(DevicesType type){

        IDevice device;
        switch (type){
            case ANDROID:
                device= new Android();
                break;
            case IOS:
                device=new Ios();
                break;
            case WINDOWS_PHONE:
                device= new WindowsPhone();
                break;
            case CLOUD:
                device= new CloudDevice();
                break;
            default:
                device= new Android();
                break;
        }
        return device;
    }
}
