public class TemperatureException extends Exception {
    //props
    int t;

    //constructor
         //clic dreapta-generate-constructor-al doilea
    public TemperatureException(String message, int t) {
        super(message);
        this.t = t;
    }

    //getter

    public int getTemp() {
        return t;
    }
}
