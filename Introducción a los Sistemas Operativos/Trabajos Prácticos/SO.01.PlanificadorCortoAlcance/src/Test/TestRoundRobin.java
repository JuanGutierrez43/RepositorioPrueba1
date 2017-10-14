package Test;

import Model.admProcesamiento;
import Model.Proceso.Prioridad;

public class TestRoundRobin {

	public static void main(String[] args) {
		
		admProcesamiento admP1 = new admProcesamiento(10, 30);
		System.out.println("-----------Creando-----------");
		admP1.agregarProceso("P1", 1, 4, 3, 3, Prioridad.Alta);
		admP1.agregarProceso("P2", 1, 2, 4, 3, Prioridad.Baja);
		admP1.agregarProceso("P3", 3, 2, 5, 1, Prioridad.Media);
		admP1.agregarProceso("P4", 3, 1, 4, 5, Prioridad.Media);
		admP1.agregarProceso("P5", 5, 3, 2, 3, Prioridad.Alta);
		System.out.println(admP1.mostrarAlgoritmoRoundRobin(3));
		
		admProcesamiento admP2 = new admProcesamiento(10, 30);
		System.out.println("-----------Creando-----------");
		admP2.agregarProceso("P1", 1, 4, 2, 1, Prioridad.Baja);
		admP2.agregarProceso("P2", 1, 2, 4, 3, Prioridad.Media);
		admP2.agregarProceso("P3", 2, 1, 2, 1, Prioridad.Alta);
		admP2.agregarProceso("P4", 2, 3, 1, 2, Prioridad.Media);
		admP2.agregarProceso("P5", 3, 3, 2, 4, Prioridad.Alta);
		System.out.println(admP2.mostrarAlgoritmoRoundRobin(3));
		
		
		
	}

}
