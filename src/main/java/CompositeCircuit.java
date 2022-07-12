public abstract class  CompositeCircuit extends Circuit {


    public CompositeCircuit(double tresistance , Circuit[] c) {
        super(tresistance);
        this.circuits = getCircuits();
    }

    public Circuit[] getCircuits() {
        return circuits;
    }



    private final Circuit[] circuits;
}
