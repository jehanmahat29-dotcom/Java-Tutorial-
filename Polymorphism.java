interface MyCamera2{
    void takePicture();
    void recordVideo();
    default void record4KVideo(){
        System.out.println("Recording in 4K...");
    }
}
interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
//==================================================================================
class MycellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }

    void pickUpCall(){
        System.out.println("Answering the call...");
    }
}
//==================================================================================
class MySmartPhone2 extends MycellPhone2 implements MyCamera2, MyWifi2{
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
public class Polymorphism {
    public static void main(String[] args) {
        MySmartPhone2 obj = new MySmartPhone2();
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

        // MyCamera2 obj = new MySmartPhone2(); //This is a smartphone but, use it as a camera
        // obj.takePicture();
        // obj.recordVideo();
        // obj.record4KVideo();
    }
}
