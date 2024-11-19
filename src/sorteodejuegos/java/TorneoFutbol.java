
package sorteodejuegos.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TorneoFutbol {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese la etapa del torneo (octavos): ");
			String etapa = scanner.nextLine().toLowerCase();

			while (!etapa.equals("octavos")) {
			    System.out.println("Etapa inválida. Ingrese una etapa válida (octavos): ");
			    etapa = scanner.nextLine().toLowerCase();
			}

			List<String> equipos = new ArrayList<>();
			System.out.println("Ingrese los nombres de los equipos (16 en total):");
			for (int i = 0; i < 16; i++) {
			    System.out.print("Equipo " + (i + 1) + ": ");
			    equipos.add(scanner.nextLine());
			}

			List<String> ganadoresOctavos = simularOctavos(equipos);
			System.out.println("\nGanadores de Octavos:");
			for (String ganador : ganadoresOctavos) {
			    System.out.println(ganador);
			}

			List<String> ganadoresCuartos = simularCuartos(ganadoresOctavos);
			System.out.println("\nGanadores de Cuartos:");
			for (String ganador : ganadoresCuartos) {
			    System.out.println(ganador);
			}

			List<String> ganadorFinal = simularSemifinales(ganadoresCuartos);
			System.out.println("\nGanador de la Final:");
			System.out.println(ganadorFinal.get(0));
		}
    }

    private static List<String> simularOctavos(List<String> equipos) {
        List<String> ganadores = new ArrayList<>();
        Collections.shuffle(equipos);

        System.out.println("\nPartidos de Octavos:");
        for (int i = 0; i < equipos.size(); i += 2) {
            System.out.println(equipos.get(i) + " vs " + equipos.get(i + 1));
            int ganador = (Math.random() < 0.5) ? i : i + 1;
            ganadores.add(equipos.get(ganador));
        }

        return ganadores;
    }

    private static List<String> simularCuartos(List<String> equipos) {
        List<String> ganadores = new ArrayList<>();
        Collections.shuffle(equipos);

        System.out.println("\nPartidos de Cuartos:");
        for (int i = 0; i < equipos.size(); i += 2) {
            System.out.println(equipos.get(i) + " vs " + equipos.get(i + 1));
            int ganador = (Math.random() < 0.5) ? i : i + 1;
            ganadores.add(equipos.get(ganador));
        }

        return ganadores;
    }

    private static List<String> simularSemifinales(List<String> equipos) {
        List<String> ganadores = new ArrayList<>();
        Collections.shuffle(equipos);

        System.out.println("\nPartidos de Semifinales:");
        for (int i = 0; i < equipos.size(); i += 2) {
            System.out.println(equipos.get(i) + " vs " + equipos.get(i + 1));
            int ganador = (Math.random() < 0.5) ? i : i + 1;
            ganadores.add(equipos.get(ganador));
        }

        List<String> campeon = new ArrayList<>();
        System.out.println("\nPartido de la Final:");
        System.out.println(ganadores.get(0) + " vs " + ganadores.get(1));
        int campeonId = (Math.random() < 0.5) ? 0 : 1;
        campeon.add(ganadores.get(campeonId));

        return campeon;
    }
}