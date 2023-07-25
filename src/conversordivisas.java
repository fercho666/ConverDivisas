import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class conversordivisas {

 public static void main(String[] args) {

        Object[] opciones = { "Convertir Monedas", "Conversor de Temperatura", "Equivalencia longitudes","Salir" };
        int seleccion = JOptionPane.showOptionDialog(null, "Selecciona que quieres aplicar... ", "CHALLENGE II G5 ALURA LATAM By FDP ",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
      
        if (seleccion == 4) {JOptionPane.showMessageDialog(null, "Programa Cerrado, Bye!");
            System.exit(0);
        } else 
//convertir monedas
       
        if (seleccion == 0) {
        	      	  
        	   boolean conProgr = true;

		        while (conProgr) {

		            String[] opcion2 = { "Peso Mx a Euro", "Peso Mx a Dólar", "Peso MX a Libra Esterlina", "Peso MX a Yen Jap",
		                    "Peso Mx a Won","Euro a Peso Mx", "Dólar a Peso Mx", "Libra Esterlina a Peso Mx","Yen a Peso Mx", "Won a Peso Mx", };
		            String seleccion2 = (String) JOptionPane.showInputDialog(null, "Elija una opción:","Conversor de Moneda  By FDP",
		            		JOptionPane.QUESTION_MESSAGE, null, opcion2, opcion2[4]);
	
		            String input = JOptionPane.showInputDialog("Ingrese la cantidad : ");
		                 
		            double pesos = 0;
		          
		            try {
		                pesos = Double.parseDouble(input);
		            } catch (NumberFormatException e) {JOptionPane.showMessageDialog(null, "Valor no válido, solo \n numeros para convertir. \n Intente de  nuevo");
		                System.exit(0);
		            }
		            
		            DecimalFormat FormatearDecimal = new DecimalFormat("#.###");

		            if (seleccion2.equals("Peso Mx a Dólar")) {double dol = pesos / 18.50;
		                JOptionPane.showMessageDialog(null,"$ " + pesos + " Peso MX son " + FormatearDecimal.format(dol) + " dólares.");
		            } else if (seleccion2.equals("Peso Mx a Euro")) {double euros = pesos / 18.85 ;
		                JOptionPane.showMessageDialog(null,"$ " + pesos + " Pesos Mx son " + euros + " Euros.");
		            } else if (seleccion2.equals("Peso MX a Libra Esterlina")) {double pounds = pesos / 21.9387;
		                JOptionPane.showMessageDialog(null,"$ " + pesos + " Pesos Mx son " + pounds + " libras esterlinas.");
		            } else if (seleccion2.equals("Peso MX a Yen Jap")) {double yen = pesos / 0.120711;
		                JOptionPane.showMessageDialog(null,"$ " + pesos + " Pesos Mx son " + yen + " Yen japoneses.");
		            } else if (seleccion2.equals("Peso Mx a Won")) {double won = pesos / 0.0132352;
		                JOptionPane.showMessageDialog(null,"$ " + pesos + " Peso MX son " + won + " Won Sur Coreano.");
		            } 
		              else if (seleccion2.equals("Euro a Peso Mx")) {double eur1 = pesos * 18.85;
		                JOptionPane.showMessageDialog(null, pesos + " Euros son " + eur1 + " Pesos Mx.");
		            } else if (seleccion2.equals("Dólar a Peso Mx")) {double dol1 = pesos * 18.50;
		                JOptionPane.showMessageDialog(null, pesos + " Dolares son " + dol1 + " Pesos Mx.");
		            } else if (seleccion2.equals("Libra Esterlina a Peso Mx")) {double pounds1 = pesos * 21.9387;
		                JOptionPane.showMessageDialog(null, pesos + " libras esterlinas son " + pounds1 + " Pesos Mx.");
		            } else if (seleccion2.equals("Yen a Peso Mx")) {double yen1 = pesos * 0.03;
		                JOptionPane.showMessageDialog(null, pesos + " Yenes Jap. son " + yen1 + " Pesos Mx.");
		            } else if (seleccion2.equals("Won a Peso Mx")) {double won1 = pesos * 0.0027;
		                JOptionPane.showMessageDialog(null, pesos + " Won son " + won1 + " Pesos Mx.");
		            }	          
		            int continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
		            		JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
		            
		           if (continuar == JOptionPane.NO_OPTION || continuar == JOptionPane.CANCEL_OPTION ) {
		             conProgr = false;
		                JOptionPane.showMessageDialog(null, "Programa Finalizado, Bye!");
		                System.exit(0);
		            }}}
        	  else 
//Conversor temperatura	  
         if (seleccion == 1) {

            boolean SeguirPrograma2 = true;
            while (SeguirPrograma2) {

                String[] opcion3 = { "Celsius a Fahrenheit","Celsius a Kelvin","Celsius a Rankine", "Fahrenheit a Celsius", "Grados Kelvin a Celsius", "Rankine a Celsius"};
                int seleccion3 = JOptionPane.showOptionDialog(null, "Elige una opción de conversión:",
                        "Convertidor de Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, opcion3, opcion3[0]);
                               
                String valorStr = JOptionPane.showInputDialog("Ingresa la temperatura a convertir: ");
               
                double temp = 0;
                try {
                    temp = Double.parseDouble(valorStr);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido, solo \n numeros para convertir. \n Intente de  nuevo");
                    System.exit(0);
                }
                
                double resultado = 0;
                
                if (seleccion3 == 0) {resultado = (temp * 1.8) + 32;
                    JOptionPane.showMessageDialog(null, temp + " grados Celsius son " + resultado + " grados Fahrenheit");
                } else if (seleccion3 == 1) {resultado = (temp + 273.15);
                    JOptionPane.showMessageDialog(null, temp + " grados Celsius son " + resultado + " grados Kelvin");
               } else if (seleccion3 == 2) {resultado = (temp + 273.15) * 1.8;
                       JOptionPane.showMessageDialog(null, temp + " grados Celsius son " + resultado + " grados Rakine");
               } else if (seleccion3 == 3) {resultado = (temp - 32)  / 1.8;
                       JOptionPane.showMessageDialog(null,temp + " grados Fahrenheit son " + resultado + " grados Celsius");
           	   } else if (seleccion3 == 4) {resultado = (temp - 273.15);
	                    JOptionPane.showMessageDialog(null,temp + " grados Kelvin son " + resultado + " grados Celsius");
	           } else if (seleccion3 == 5) {resultado = (temp - 491.67) / 1.8;
	                        JOptionPane.showMessageDialog(null, temp + " grados Rankine son " + resultado + " grados Celsius");}
	             
                int continuar2 = JOptionPane.showConfirmDialog(null, "¿Deseas continuar usando el programa?", "Confirmación",
                		JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
                if (continuar2 == JOptionPane.NO_OPTION || continuar2 == JOptionPane.CANCEL_OPTION) {
                    SeguirPrograma2 = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado, Bye!");
                    System.exit(0);
               }}
            }
            
        		  else 
//converson longitudes 
          if (seleccion == 2) {
        				  
        	   boolean SeguirPrograma3 = true;
        	   while (SeguirPrograma3) {

        	  String[] opcion4 = { "Metro a Milla","Metro a Pulgada","Metro a Yarda","Metro a Pie", "Milla a Metro", "Pulgada a Metro"," Yarda a Metro","Pie a Metro"};
        	   int seleccion4 = JOptionPane.showOptionDialog(null, "Elige una opción de conversión:",
        	      "Convertidor de Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, opcion4, opcion4[0]);

        	   String valorStr4 = JOptionPane.showInputDialog("Ingresa la distancia a convertir: ");

        		 double medida = 0;
        		   try {
        		     medida = Double.parseDouble(valorStr4);
        		       } catch (NumberFormatException e) {
        		       JOptionPane.showMessageDialog(null, "Valor no válido, solo \n numeros para convertir. \n Intente de  nuevo");
        		       System.exit(0);
        		      }

        		       double resultado2 = 0;
        		                
        		                if (seleccion4 == 0) {resultado2 = (medida / 1.609);
        		                    JOptionPane.showMessageDialog(null, medida + " Metros son " + resultado2 + " Millas.");
        		                } else if (seleccion4 == 1) {resultado2 = ( medida * 39.37 );
        		                    JOptionPane.showMessageDialog(null, medida + " Metros son " + resultado2 + " Pulgadas. ");
        		               } else if (seleccion4 == 2) {resultado2 = (medida * 1.094) ;
        		                       JOptionPane.showMessageDialog(null, medida + " Metros son " + resultado2 + " Yardas. ");
        		               } else if (seleccion4 == 3) {resultado2 = (medida * 3.281) ; 
        		                       JOptionPane.showMessageDialog(null, medida + " Metros son " + resultado2 + " Pies");
        		           	   } else if (seleccion4 == 4) {resultado2 = (1609 * medida );
        			                    JOptionPane.showMessageDialog(null, medida + " Milla son " + resultado2 + " Metros");
        			           } else if (seleccion4 == 5) {resultado2 = (medida / 39.37);
        			                        JOptionPane.showMessageDialog(null, medida + " Pulgadas " + resultado2 + " Metros");
        			           } else 
        			               if (seleccion4 == 6) {resultado2 = (medida / 1.094  );
        	        		          JOptionPane.showMessageDialog(null, medida + " Yarda son " + resultado2 + " Metros");
        	        			           }
        			               else
        			            	if (seleccion4 == 7) {resultado2 = ( medida / 3.281);
        	         			      JOptionPane.showMessageDialog(null, medida + " Pies son " + resultado2 + " Metros");
        	         			           }
        			                          			             
        		                int continuar3 = JOptionPane.showConfirmDialog(null, "¿Deseas continuar usando el programa?", "Confirmación",
        		                		JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
        		                if (continuar3 == JOptionPane.NO_OPTION || continuar3 == JOptionPane.CANCEL_OPTION) {
        		                    SeguirPrograma3 = false;
        		                    JOptionPane.showMessageDialog(null, "Programa Finalizado, Bye!");
        		                    System.exit(0);
        		               }}}}}
        		                   				  
