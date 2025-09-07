public class Practiceset3 {
    public static void main(String[] args) {
        //problem 1------------------------------------------
        String name = " Jehan Mahat";
        name = name.toLowerCase();
        System.out.println(name);

        //problem 2------------------------------------------
        String text = "Jehan is writing code in java.";
        text = text.replace(" ","_");
        System.out.println(text);

        //problem 3------------------------------------------
        String letter = "Dear <|name|>, Thanks a lot.";
        letter = letter.replace("<|name|>","Jehan");
        System.out.println(letter);

        //problem 4------------------------------------------
        String space = "This  code is written  by   Jehan Mahat.";
        System.out.println(space.indexOf("  "));
        System.out.println(space.indexOf("   "));

        //problem 5------------------------------------------
        String letter2 = "Dear Jehan,\n This code is working properly.\n Thanks a lot.";
        System.out.println(letter2);
    }
}
