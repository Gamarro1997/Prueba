package mipaquete.es.githublocal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Githublocal
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader lectura = new BufferedReader(new
				InputStreamReader(System.in));
		int opcion;
		float cantidad;
		System.out.println("Indicar el n�mero correspondiente a una opci�n del siguiente men�:");
					System.out.println(" *MENU*");
		System.out.println(" 1. Pasar de Pesetas a Euros");
		System.out.println(" 2. Pasar de Euros a Pesetas");
		System.out.println(" 3. Salir");
		opcion = Integer.parseInt(lectura.readLine());
		if ((opcion==1)||(opcion==2))
		{
			System.out.println("Indicar la cantidad a convertir:");
			cantidad=Float.parseFloat(lectura.readLine());
			if (opcion==1)
			{
				System.out.println("La cantidad indicada equivale a"+ConversionAe (cantidad)+" Euros");
			}
			if (opcion==2)
			{
				System.out.println("La cantidad indicada equivale a "
						+ConversionAp (cantidad) +" Pesetas");
			}
		}
	}
	public static float ConversionAe (float cantidad)
	{
		final float e=(float)166.386;
		return cantidad/e;
	}
	public static float ConversionAp (float cantidad)
	{
		final float e= (float)166.386;
		return cantidad*e;
	}
}

