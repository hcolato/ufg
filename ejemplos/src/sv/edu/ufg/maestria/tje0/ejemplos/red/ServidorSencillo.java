package sv.edu.ufg.maestria.tje0.ejemplos.red;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public final class ServidorSencillo {
	private ServidorSencillo() {
		super();
	}

	private void ejecuta(int puerto) {
		try {
			System.out.println("Servidor a la escucha");
			// Creamos un Socket servidor a la escucha en el puerto indicado
			ServerSocket servidor = new ServerSocket(puerto);
			Socket cliente;
			try {
				// Cada vez que se conecta un cliente le enviamos un saludo
				while((cliente = servidor.accept()) != null)
					new Thread(new Saludo(cliente)).start();
			} finally {
				servidor.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private class Saludo implements Runnable {
		private Socket cliente;

		public Saludo(Socket cliente) {
			this.cliente = cliente;
		}

		@Override
		public void run() {
			System.out.println("Cliente conectado");
			try {
				// Obtenemos un stream de escritura a partir del Socket del cliente
				PrintWriter pw = new PrintWriter(cliente.getOutputStream(), true);
				pw.println("Hola desde el servidor");
				pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]) {
		new ServidorSencillo().ejecuta(Integer.parseInt(args[0]));
	}
}
