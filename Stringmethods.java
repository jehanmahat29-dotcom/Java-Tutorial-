public class Stringmethods {
    public static void main(String[] args) {
        String name = "Jehan";
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String lstring =  name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "     Jehan     ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(2));

        System.out.println(name.replace("J", "R"));
        System.out.println(name.replace("Jehan", "Samir"));

        System.out.println(name.startsWith("Jeh"));
        System.out.println(name.endsWith("an"));

        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("n"));

        String modifiedName = "Jehanhan";
        System.out.println(modifiedName.indexOf("han"));
        System.out.println(modifiedName.indexOf("han",4));
        System.out.println(modifiedName.lastIndexOf("han"));

        System.out.println(name.equals("Jehan"));
        System.out.println(name.equalsIgnoreCase("jEhAN"));

        System.out.println("I am escape sequence \\ double quote");
    }
}
