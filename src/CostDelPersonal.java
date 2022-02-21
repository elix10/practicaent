import java.util.ArrayList;
import java.util.Collection;

public class CostDelPersonal
{
    public static final int PREUHORES = 20;

	class Treballador
    {
        static String DIRECTOR = "Director"; //Declarar las globales para que comprobar si es director o no.
        static String SUBDIRECTOR = "Subdirector"; //Declarar las globales para que comprobar si es subdirector o no.
        String tipusTreballador;
        float nomina;                            //Declarar variables
        int horesExtres;
        String getTipusTreballador() 
        {
            return tipusTreballador;
        }
        
        float getNomina()
        {
            return nomina;
        }
        
        int getHoresExtres()
        {
            return horesExtres;
        }

    }
    
    static float CostDelPersonal(Treballador treballadors[])
    {
        float costFinal = 0;
        Treballador treballador;
        for (int i = 0; i < treballadors.length; i++)
        {
            treballador = treballadors[i];
            costFinal = extracted(costFinal, treballador);
        }
        return costFinal;
    }

	public static float extracted(float costFinal, Treballador treballador) {
		if (treballador.getTipusTreballador() == Treballador.DIRECTOR
		        || treballador.getTipusTreballador() == Treballador.SUBDIRECTOR)        
		{
		    costFinal += treballador.getNomina();
		}
		else 
		{
		    costFinal += treballador.getNomina() + (treballador.getHoresExtres() * PREUHORES);
		}
		return costFinal;
	}
}