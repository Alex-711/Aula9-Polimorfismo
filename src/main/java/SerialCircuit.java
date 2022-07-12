public class SerialCircuit extends CompositeCircuit {

    public SerialCircuit(double tresistance, Circuit[] c) {
        super(tresistance, c);
    }

    @Override
    public double getResistance() {
        double soma = 0;
        double[] Circuits = getCircuits();
        for (int i=0; i<Circuits.length; i++) {
            soma = soma + Circuits[i];
        }
        return soma;
    }
}
