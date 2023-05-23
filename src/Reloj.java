import java.util.Scanner;

public class Reloj {

	
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		
		String ejec;
		
		do {
			int h, m, s;

		
			System.out.println("Hora: ");
			h=Integer.parseInt(sc.nextLine());
			System.out.println("Minutos: ");
			m=Integer.parseInt(sc.nextLine());
			System.out.println("Segundos: ");
			s=Integer.parseInt(sc.nextLine());
		
		
			for (int hor=h; hor<24; hor++) { 
				for (int min=m; min<60; min++) {	
					for (int seg=s; seg<60; seg++) {
						System.out.println(hor + ":" + min + ":" + seg);
						Thread.sleep(1000);
					}
					s=0;
				}
				m=0;
			}
			
			System.out.println("Ejecutar de nuevo? s/n");
			ejec = sc.nextLine();
			
		} while(ejec.equalsIgnoreCase("s"));
	}	
}
