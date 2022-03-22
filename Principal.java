
package emissaocarbono;
    
import java.util.ArrayList;

public class Principal {

    public static void main( String[] args ) {
	ArrayList< CarbonFootprint > categories = new ArrayList< CarbonFootprint >();
	categories.add( new Bicicleta( 300.00 ));
	categories.add( new Edificio( 5000.52 ));
	categories.add( new Carro( 3845.25, 10.5 ));
	System.out.println("Dados de cada objeto: ");

    for( CarbonFootprint currentObject : categories ) {
	System.out.printf("\n%s: %s \n%s %s: %.2f\n",
	    "Detalhes sobre ", currentObject.getClass().getName(),
	    currentObject.toString(),
	    "\nCarbon footprint é ", currentObject.getCarbonFootprint());
	}
    }
}