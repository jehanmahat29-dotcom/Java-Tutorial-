interface MyCamera{
    void takePicture();
    void recordVideo();
    default void record4KVideo(){
        System.out.println("Recording in 4K...");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
//==================================================================================
class MycellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }

    void pickUpCall(){
        System.out.println("Answering the call...");
    }
}
//==================================================================================
class MySmartPhone extends MycellPhone implements MyCamera, MyWifi{
    @Override
    public void takePicture(){
        System.out.println("Taking Picture");
    }
    @Override
    public void recordVideo(){
        System.out.println("Recording Video...");
    }
    @Override
    public String[] getNetworks(){
        System.out.println("Getting List of Networks...");
        String[] networks = {"A", "B", "C", "D", "E", "F"};
        return networks;
    }
    @Override
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
//==================================================================================
public class Interfaces_Example {
    public static void main(String[] args) {
        MySmartPhone obj = new MySmartPhone();
        String[] ar = obj.getNetworks();
        for (String item: ar){
            System.out.println(item);
        }
        obj.connectToNetwork("A");
        obj.callNumber(1234567890);
        obj.pickUpCall();
        obj.takePicture();
        obj.recordVideo();
        obj.record4KVideo();
    }
}