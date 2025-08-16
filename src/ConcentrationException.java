public class ConcentrationException extends Exception {
    //props
    int c;

    //constructor
     //clic dreapta-generate-constructor-al doilea
    public ConcentrationException(String message, int c) {
        super(message);
        this.c = c;
    }

    public int getConc() {
        return c;
    }
}
