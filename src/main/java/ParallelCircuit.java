public class ParallelCircuit extends CompositeCircuit {

    public ParallelCircuit(Circuit[] c) {
        this.getCircuits()
    }

    @Override
    public double getResistance() {
        double multi = 1 ;
        double soma = 0;
        double resultado =0;
        Circuit[] circuits = getCircuits();
        for (int i=0; i<circuits.length; i++) {
            soma = soma + circuits[i].getResistance();
            multi = multi * circuits[i].getResistance();
        }
        resultado = multi / soma;

        return resultado;
            }
        }

    }



