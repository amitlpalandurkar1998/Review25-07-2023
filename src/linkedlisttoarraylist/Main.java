package linkedlisttoarraylist;

// Convert LinkedList to ArrayList

public class Main {
    public static void main(String[] args) {
        Method method = new Method();

        method.addElement(1);
        method.addElement(2);
        method.addElement(3);
        method.addElement(4);
        method.addElement(5);
        method.addElement(6);

        method.display();

        System.out.println();
        method.convertToArrayList();
        System.out.print("LinkedList Convert to ArrayList : ");
        method.displayArrayList();
    }
}
