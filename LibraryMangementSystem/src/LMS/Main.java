package LMS;


public class Main {
    public static void main (String args[]) {
        Choice menu = new Choice();
        menu.lib.availableBook();   // load default books once
        menu.runMenu();
    }
}
