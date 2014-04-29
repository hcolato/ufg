package sv.edu.ufg.maestria.tje0.ejemplos.red;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public final class ClienteSencillo {
	private ClienteSencillo() {
		super();
	}

	private void ejecuta(int puerto) {
		try {
			// Me conecto al servidor local que escuha es este puerto
			Socket cliente = new Socket("localhost", puerto);
			try {
				// Recupero un stream de lectura
				BufferedReader br = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
				String saludo;
				while((saludo = br.readLine()) != null)
					System.out.println(saludo);
			} finally {
				if(cliente != null) cliente.close();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ClienteSencillo().ejecuta(Integer.parseInt(args[0]));
	}
}
