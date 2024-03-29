package eva2_3_lista_doble;
/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class Node {
    private int value;
    private Node next;
    private Node previous;
    
    
    //Por default, un nuevo nodo va al final de la lista
    //El final de la lista se indica con null
    // Es por ello que siguiente = null.
    public Node(){
        this.next = null;
        this.previous = null;
    }

    public Node(int value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value= value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next =  next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

}
