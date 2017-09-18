/**
 * Condicion de aprendisaje
 * Elije de forma aletoria PAn y/o PCz
 * Elije si desea aplicar una operación (sólo sabe + y -)
 * Preguntar al sentimiento si es OK o !OK
 * En el caso del OK almacenar la formula
 * 
 * En la comparación con el precio de cierre PCx si es positivo, agrega sentimiento positivo a la formula, 
 * si es negativo, agrega sentimiento negativo a la formula.
 */
package ilearn;

import java.util.Random;


/**
 * @author pcmon
 *
 */
public class main
{

	/**
	 * @param args
	 */

	public static void main(String[] args)
	{

		
		
		double[] precioApertura = { 440, 435, 440, 450, 450, 450, 460, 460, 465, 463.6, 460 };
		double[] precioCierre = { 445, 440, 450, 450, 450, 455, 460, 465, 463.6, 460 };

		// Días de iteración (modo estudio)
		int dias = 1;

		for (int i = 0; i < dias; i++)
		{
			// creación de la formula
			
			//Consideremos los presentimiento para la fomula
			boolean precioAperturaSentimiento = presentimiento(), precioCierreSentimiento = presentimiento();
			
			//Presiente que debe considerar la apertura
			if (precioAperturaSentimiento)
			{
				//presiente que si debe considerar precio cierre
				if (precioCierreSentimiento)
				{
					
				}
			} 
			else
			{
				//Descarta precio apertura y presiente que debe ir por el precoi cierre.
				if (precioCierreSentimiento)
				{
					
				}
				else
				{
					
				}
			}

		}

	}

	/**
	 * 
	 * @return
	 */
	public static boolean presentimiento()
	{
		return presentimiento(10);
	}

	/**
	 * 
	 * @param tamanioMemoria
	 * @return
	 */
	public static boolean presentimiento(int tamanioMemoria)
	{
		Random ran = new Random();
		int memoria = tamanioMemoria;
		int notFeelGood = 0, feelGood = 0;

		for (int i = 0; i < memoria; i++)
		{
			if (ran.nextBoolean())
			{
				feelGood++;
			} else
			{
				notFeelGood++;
			}
		}

		if (feelGood > notFeelGood)
		{
			return true;
		} else if (feelGood < notFeelGood)
		{
			return false;
		} else
		{
			return presentimiento();
		}
	}

}
