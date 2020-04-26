import javax.swing.JOptionPane;

import org.jpl7.PrologException;
import org.jpl7.Query;

public class Prolog {

	public static void main(String[] args) {
		try {
			while(true) {
				String opcion = 
						JOptionPane.showInputDialog("Seleccione el estudiante para calcular la definitiva : \n" 
								+ "1. Andres Martinez \n"
								+ "2. Miguel Venegas \n"
								+ "3. Sergio Gonzalez \n"
								+ "4. Carlos Castro \n"
								+ "5. Salir");
						calcularNota(opcion);
			}
			//System.out.println (System.getProperty ("java.library.path"));	
		} catch (PrologException e) {
			System.out.println(e.getMessage());
		}

	}
	
	
	public static void calcularNota(String opcion) {
		String cadena=null;
		boolean aux =  false;
		switch (opcion) {
		case "1":
			cadena = "andres";
			break;
		case "2":
			cadena = "miguel";
			break;
		case "3":
			cadena = "sergio";
			break;
		case "4":
			cadena = "carlos";
			break;
		case "5":
			System.exit(0);
			break;
		default:
			aux= true;
			JOptionPane.showMessageDialog(null, "Opcion no valida");
			break;
		}
		
		String conexion = "consult('ejercicio1.pl')";
		Query con = new Query(conexion);
		System.out.println(conexion + " " + (con.hasMoreSolutions() ? "Aceptado" : "Fallado"));
		
		//Insertar Dinamicamente
		/*String dinamico = "asserta(calificacion(carlos, taller, 1)).";
		Query ejecutar2 = new Query(dinamico);
		ejecutar2.hasSolution();
		
		dinamico = "asserta(calificacion(carlos, taller, 1)).";
		ejecutar2 = new Query(dinamico);
		ejecutar2.hasSolution();
		
		dinamico = "asserta(calificacion(carlos, taller, 1)).";
		ejecutar2 = new Query(dinamico);
		ejecutar2.hasSolution();
		
		dinamico = "asserta(calificacion(carlos, parcial, 1)).";
		ejecutar2 = new Query(dinamico);
		ejecutar2.hasSolution();
		
		dinamico = "asserta(calificacion(carlos, parcial, 1)).";
		ejecutar2 = new Query(dinamico);
		ejecutar2.hasSolution();
		
		dinamico = "asserta(calificacion(carlos, asistencia, 1)).";
		ejecutar2 = new Query(dinamico);
		ejecutar2.hasSolution();*/
		
		String consult = "notaTotal("+cadena+",Y3).";
		Query ejecutar = new Query(consult);
		
		if(ejecutar.hasSolution()) {
			JOptionPane.showMessageDialog(null, "La nota definitiva es : "+ ejecutar.oneSolution().get("Y3"));
		}else if(!aux) {
			JOptionPane.showMessageDialog(null, "No existen notas para el estudiante. ");
		}
	}

}
