package view;
import java.util.Scanner;

import model.Cube;
import model.ConsultaCubo;

public class Solution {

	public static void main(String[] args) {
		//codigo de creacion del cubo 3D
		Cube cubo = new Cube();
		System.out.println("ingrese la coordenada para X");
		Scanner x = new Scanner(System.in);
		int valorX = x.nextInt();
		cubo.setX(valorX);
		
		System.out.println("ingrese la coordenada para Y");
		Scanner y = new Scanner(System.in);
		int valorY = y.nextInt();
		cubo.setY(valorY);
		
		System.out.println("ingrese la coordenada para Z");
		Scanner z = new Scanner(System.in);
		int valorZ = z.nextInt();
		cubo.setZ(valorZ);
		
		
		
		int[][][] matriz = new int[cubo.getX()][cubo.getY()][cubo.getZ()];
		System.out.println("su matriz es de [" + cubo.getX() + "],[" + cubo.getY() +"],[" + cubo.getZ() + "]");
		
		
		//consulta de los campos del cubo 3D(controller)
		
		System.out.println("ingrese el número de consultas que desea realizar");
		
		Scanner con = new Scanner(System.in);
		int consultas = con.nextInt();
		int suma = 0;
		
		for(int aux = 0; aux < consultas; aux++){
			ConsultaCubo consulta = new ConsultaCubo();
			System.out.println("a continuacion, se le pedirá ingresar una posición de la matriz anteriormente creada para ingresarle un valor, sera de la forma [x][y][z]");
			
			System.out.println("ingrese la coordenada para X");
			Scanner subx = new Scanner(System.in);
			int valorSubX = subx.nextInt();
			
			
			System.out.println("ingrese la coordenada para Y");
			Scanner suby = new Scanner(System.in);
			int valorSubY = suby.nextInt();
			
			
			System.out.println("ingrese la coordenada para Z");
			Scanner subz = new Scanner(System.in);
			int valorSubZ = subz.nextInt();
			
			
			
			System.out.println("ingrese el valor de la posición de la matriz seleccionada");
			Scanner w = new Scanner(System.in);
			int valorW = w.nextInt();
			
			
			//suma acumulativa y seteo del valor pedido(controller)
			consulta.setW(valorW);
			suma = suma + consulta.getW();
			matriz[valorSubX-1][valorSubY-1][valorSubZ-1] = consulta.getW();
			
			
			
			System.out.println("a continuacion se ingresará las coordenadas de busqueda, se manejaran de la siguiente manera:");
			System.out.println("se pediran los valores de X, Y y Z para el rango de matrices a buscar(primera matriz: [x1][y1][z1] y segunda matriz: [x2][y2][z2]");
			
			System.out.println("valor de x1");
			Scanner x1 = new Scanner(System.in);
			int valorX1 = x1.nextInt();
			
			System.out.println("valor de y1");
			Scanner y1 = new Scanner(System.in);
			int valorY1 = y1.nextInt();
			
			
			System.out.println("valor de z1");
			Scanner z1 = new Scanner(System.in);
			int valorZ1 = z1.nextInt();
			
			
			System.out.println("valor de x2");
			Scanner x2 = new Scanner(System.in);
			int valorX2 = x2.nextInt();
			
			
			System.out.println("valor de y2");
			Scanner y2 = new Scanner(System.in);
			int valorY2 = y2.nextInt();
			
			
			System.out.println("valor de z2");
			Scanner z2 = new Scanner(System.in);
			int valorZ2 = z2.nextInt();
			
			
			consulta.setX1(valorX1);
			consulta.setY1(valorY1);
			consulta.setZ1(valorZ1);
			
			consulta.setX2(valorX2);
			consulta.setY2(valorY2);
			consulta.setZ2(valorZ2);
			
			
			
			//lectura de la matriz(controller)
			
			for(int i = consulta.getX1()-1; i < consulta.getX2(); i++){
				for(int j = consulta.getY1()-1; j < consulta.getY2(); j++){
					for(int k = consulta.getZ1()-1; k < consulta.getZ2(); k++){
						System.out.println("el elemento en la posicion [" + (i +1)+ "],[" + (j+1)+ "],[" + (k +1)+ "] es: " + matriz[i][j][k]);
					}
				}
			}
			
			System.out.println("valor acumulado:" + suma);
		
		}System.out.println("número de consultas superado, programa finalizado!");
		
		
		
		
		
		

	}

}
