import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class PPS {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		ThreadLocalRandom rnd = ThreadLocalRandom.current();
		boolean end = false;

		while(!end) {
			System.out.println("¿Piedra, papel o tijeras?");
			String usuario = in.nextLine();

			//1 = piedra, 2 = papel, 3 = tijeras
			int maquina = rnd.nextInt(1, 4);

			if(usuario.equalsIgnoreCase("piedra")) {
				if(maquina == 1)
					System.out.println("Empate, la máquina ha sacado piedra");
				if(maquina == 2)
					System.out.println("Pierdes, la máquina ha sacado papel");
				if(maquina == 3)
					System.out.println("Ganas, la máquina ha sacado tijeras");
			}else if(usuario.equalsIgnoreCase("papel")) {
				if(maquina == 1)
					System.out.println("Ganas, la máquina ha sacado piedra");
				if(maquina == 2)
					System.out.println("Empate, la máquina ha sacado papel");
				if(maquina == 3)
					System.out.println("Pierdes, la máquina ha sacado tijeras");
			}else if(usuario.equalsIgnoreCase("tijeras") || usuario.equalsIgnoreCase("tijera")) {
				if(maquina == 1)
					System.out.println("Pierdes, la máquina ha sacado piedra");
				if(maquina == 2)
					System.out.println("Ganas, la máquina ha sacado papel");
				if(maquina == 3)
					System.out.println("Empate, la máquina ha sacado tijeras");
			}else {
				System.out.println("No he entendido lo que has dicho");
			}
			
			System.out.println("Deseas jugar otra vez? S/N");
			String respuesta = in.nextLine();
			
			if(respuesta.equalsIgnoreCase("n")) {
				System.out.println("Hasta luego!");
				end = true;
				break;
			}else if(respuesta.equalsIgnoreCase("s")) {
				System.out.println("Juguemos");
			}else {
				System.out.println("No te he entendido así que jugaremos otra partida :)");
			}
		}
		in.close();
	}
}
