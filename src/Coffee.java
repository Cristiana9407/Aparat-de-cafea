public class Coffee {
    private int temp;
    private int conc;
    Coffee(int t, int c) {
        temp = t;
        conc = c;
    }
//scrim get si apare
    public int getTemp() {
        return temp;
    }
//scrim get si alegem
    public int getConc() {
        return conc;
    }


    //toString (a doua)
    @Override
    public String toString() {
        return "Coffee{" +
                "temp=" + temp +
                ", conc=" + conc +
                '}';
    }
}

