
import java.util.*;



public class ListTypes{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0 ; i<= 10; i++){
            list.add(i);
        }

       
        System.out.println(list.get(5));

        list.addFirst(100);

        System.out.println(list);
        System.out.println( list.size());
    }
}