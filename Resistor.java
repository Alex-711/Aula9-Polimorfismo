public class Resistor extends Circuit {

    public Resistor(double resistance) {
        super(resistance);
        if (resistance >= 0){
            this.resistance = resistance;
        }
        else {
            throw new IllegalArgumentException(" o valor tem que ser positivo");

        }
    }

    @Override
    public double getResistance() {
        return resistance;
    }

    private final double resistance;


}
