public class ExceptionClass {
    public static void division(int n1){
        try{
         System.out.println(n1/2);
        }
        catch(Exception e){
            System.out.println(0);
        }finally{
            System.out.println("Jehan ");
        }
       
    }
    public static void main(String[] args) {
        division(10);
    }
}
