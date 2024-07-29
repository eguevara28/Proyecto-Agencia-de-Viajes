/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guevara_ernesto_proyectoagenciaviajes;

/**
 *
 * @author ernes
 */
import java.util.Scanner;

public class Guevara_Ernesto_Proyecto1 {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        int opcion, boletosCDMXNeg = 0, boletosCDMXTur = 0, boletosMCNeg = 0, boletosMCTur = 0, boletosSJCRNeg = 0, boletosSJCRTur = 0, boletosSCNeg = 0, boletosSCTur = 0, subtotalCDMXNeg = 0, subtotalCDMXTur = 0, subtotalMCNeg = 0, subtotalMCTur = 0, subtotalSJCRNeg = 0, subtotalSJCRTur = 0, subtotalSCNeg = 0, subtotalSCTur = 0, subtotalPTCDMX = 0, subtotalPTSJCR = 0, subtotalPTMC = 0, subtotalPTSC = 0, paquetesturisticosvendidos = 0, dinerodescuento = 0, subtotalgeneral = 0, dinerohotelCDMX = 0, dinerohotelSJCR = 0, dinerohotelMC = 0, dinerohotelSC = 0, dinerorentaautoCDMX = 0, dinerorentaautoSJCR = 0, dinerorentaautoMC = 0, dinerorentaautoSC = 0, dinerorecorridoCDMX = 0, dinerorecorridoSJCR = 0, dinerorecorridoMC = 0, dinerorecorridoSC = 0, boletosPTCDMX = 0, boletosPTSJCR = 0, boletosPTMC = 0, boletosPTSC = 0, paquetesturisticosCDMX = 0, paquetesturisticosSJCR = 0, paquetesturisticosMC = 0, paquetesturisticosSC = 0, totalboletosCDMX = 0, totalboletosSJCR = 0, totalboletosMC = 0, totalboletosSC = 0, totalPTCDMX = 0, totalPTSJCR = 0, totalPTMC = 0, totalPTSC = 0, contadorAccesoOP2 = 0, contadorAccesoOP1 = 0, contadorAccesoOP3 = 0;

        while (true) {
            System.out.println("---Bienvenido a la Agencia de Viajes---");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Venta de boletos aereos\n2. Venta de Paquetes turisticos\n3. Reportes\n4. Salir del Sistema");
            opcion = lea.nextInt();

            if (opcion == 4) {
                System.out.println("Ha salido con exito, vuelva pronto!");
                break;
            }

            if (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4) {
                System.out.println("Esta opcion no es valida, intentelo de nuevo");
            }

            if (opcion == 1) {
                contadorAccesoOP1++;
                int contadorop1 = 0;
                do {
                    System.out.println("--------------Ingreso al menu de Venta de Boletos Aereos--------------");
                    System.out.println("      Destino                   Clase Negocios               Clase Turista");
                    System.out.println("a. Ciudad de Mexico                Lps.8000                     Lps. 5500");
                    System.out.println("b. San Jose, Costa Rica            Lps.7000                     Lps. 4800");
                    System.out.println("c. Medellin, Colombia              Lps.11200                    Lps. 8000");
                    System.out.println("d. Santiago, Chile                 Lps.18000                    Lps. 11600");
                    System.out.println("e. Salir");
                    char seleccionboleto = lea.next().charAt(0);

                    if (seleccionboleto == 'e' || seleccionboleto == 'E') {
                        System.out.println("Ha salido con exito");
                        break;
                    }

                    if (seleccionboleto != 'a' && seleccionboleto != 'A' && seleccionboleto != 'b' && seleccionboleto != 'B' && seleccionboleto != 'c' && seleccionboleto != 'C' && seleccionboleto != 'd' && seleccionboleto != 'D' && seleccionboleto != 'e' && seleccionboleto != 'E') {
                        System.out.println("Esta no es una opcion valida, vuelva a intentarlo");
                        continue;
                    }

                    System.out.println("Que clase de boleto desea comprar? Clase de Negocios o Turista");
                    String tipoBV = lea.next();

                    if (seleccionboleto == 'a' || seleccionboleto == 'A') {

                        String precioCDMX = (tipoBV.equals("negocios")) ? "8000"
                                : (tipoBV.equals("turista")) ? "5500" : "No existe";

                        if (precioCDMX.equals("No existe")) {
                            System.out.println("Esta clase no existe");
                            continue;
                        }

                        System.out.println("Cuantos boletos desea comprar?");
                        int cantidadBV = lea.nextInt();

                        double preciotemp = Integer.parseInt(precioCDMX) * cantidadBV;

                        double subtotal = preciotemp, descuentocdmx = 0, descuentotemp = 0;

                        if (cantidadBV < 0) {
                            System.out.println("No se aceptan numeros negativos, sera reenviado al menu");
                            break;
                        }

                        if (cantidadBV >= 3) {
                            descuentotemp = preciotemp * 0.05;
                            preciotemp = preciotemp - descuentotemp;
                            descuentocdmx = 5;
                        }

                        System.out.println("Su destino: Ciudad de Mexico");
                        System.out.println("La cantidad de boletos: " + cantidadBV);
                        System.out.println("Descuento: " + descuentocdmx + "% Lps." + descuentotemp);
                        System.out.println("Subtotal:" + subtotal);
                        System.out.println("Confirme su compra escribiendo 1, si no escriba cualquier otro numero");
                        int confirmacionCD = lea.nextInt();

                        if (confirmacionCD == 1 && tipoBV.equals("negocios")) {
                            double subtotalDolares = subtotal / 25, descuentotempDolares = descuentotemp / 25, totalDolares = preciotemp / 25;
                            System.out.println("Su compra ha sido confirmada, gracias por confiar en nuestros servicios");
                            System.out.println("--------------------FACTURA--------------------");
                            System.out.println("Su destino: Ciudad de Mexico, Mexico");
                            System.out.println("La cantidad de boletos: " + cantidadBV);
                            System.out.println("En clase de: " + tipoBV);
                            System.out.println("Subtotal: Lps." + subtotal + " o  $." + subtotalDolares);
                            System.out.println("Descuento " + descuentocdmx + "%: Lps." + descuentotemp + " o  $." + descuentotempDolares);
                            System.out.println("Total: " + preciotemp + " o  $." + totalDolares);
                            boletosCDMXNeg += cantidadBV;
                            subtotalgeneral += subtotal;
                            subtotalCDMXNeg += subtotal;
                            dinerodescuento += descuentotemp;
                            break;
                        }

                        if (confirmacionCD == 1 && tipoBV.equals("turista")) {
                            double subtotalDolares = subtotal / 25, descuentotempDolares = descuentotemp / 25, totalDolares = preciotemp / 25;
                            System.out.println("Su compra ha sido confirmada, gracias por confiar en nuestros servicios");
                            System.out.println("--------------------FACTURA--------------------");
                            System.out.println("Su destino: Ciudad de Mexico, Mexico");
                            System.out.println("La cantidad de boletos: " + cantidadBV);
                            System.out.println("En clase de: " + tipoBV);
                            System.out.println("Subtotal: Lps." + subtotal + " o  $." + subtotalDolares);
                            System.out.println("Descuento " + descuentocdmx + "%: Lps." + descuentotemp + " o  $." + descuentotempDolares);
                            System.out.println("Total: " + preciotemp + " o  $." + totalDolares);
                            boletosCDMXTur += cantidadBV;
                            subtotalCDMXTur += subtotal;
                            subtotalgeneral += subtotal;
                            dinerodescuento += descuentotemp;
                            totalboletosCDMX += preciotemp;
                            break;
                        }
                    }

                    if (seleccionboleto == 'b' || seleccionboleto == 'B') {

                        String precioSJCR = (tipoBV.equals("negocios")) ? "7000"
                                : (tipoBV.equals("turista")) ? "4800" : "No existe";

                        System.out.println("Cuantos boletos desea comprar?");
                        int cantidadBV = lea.nextInt();

                        if (precioSJCR.equals("No existe")) {
                            System.out.println("Esta clase no existe");
                            continue;
                        }

                        double preciotemp = Integer.parseInt(precioSJCR) * cantidadBV;

                        double subtotal = preciotemp;

                        double preciotemp2 = 0, descuentoSJCR = 0, descuentotemp = 0;

                        if (cantidadBV < 0) {
                            System.out.println("No se puede ingresar numeros negativos, sera reenviado al menu");
                            break;
                        }

                        if (cantidadBV <= 2 && tipoBV.equals("negocios")) {
                            descuentotemp = preciotemp * 0.10;
                            preciotemp = preciotemp - descuentotemp;
                            descuentoSJCR = 10;
                        }

                        if (cantidadBV > 2 && tipoBV.equals("negocios")) {
                            descuentotemp = preciotemp * 0.20;
                            preciotemp = preciotemp - descuentotemp;
                            descuentoSJCR = 20;
                        }

                        if (tipoBV.equals("turista")) {
                            descuentotemp = preciotemp * 0.05;
                            preciotemp = preciotemp - descuentotemp;
                            descuentoSJCR = 5;
                        }

                        System.out.println("Su destino: San Jose, Costa Rica");
                        System.out.println("La cantidad de boletos: " + cantidadBV);
                        System.out.println("En clase de: " + tipoBV);
                        System.out.println("Subtotal: Lps." + subtotal);
                        System.out.println("Confirme su compra escribiendo 1, si no escriba cualquier otro numero");
                        int confirmacionCD = lea.nextInt();

                        if (confirmacionCD == 1 && tipoBV.equals("negocios")) {
                            double subtotalDolares = subtotal / 25, descuentotempDolares = descuentotemp / 25, totalDolares = preciotemp / 25;
                            System.out.println("Su compra ha sido confirmada, gracias por confiar en nuestros servicios");
                            System.out.println("--------------------FACTURA--------------------");
                            System.out.println("Su destino: San Jose, Costa Rica");
                            System.out.println("La cantidad de boletos: " + cantidadBV);
                            System.out.println("En clase de: " + tipoBV);
                            System.out.println("Subtotal: Lps." + subtotal + " o  $." + subtotalDolares);
                            System.out.println("Descuento " + descuentoSJCR + "%: Lps." + descuentotemp + " o  $." + descuentotempDolares);
                            System.out.println("Total: " + preciotemp + " o  $." + totalDolares);
                            boletosSJCRNeg += cantidadBV;
                            subtotalSJCRNeg += subtotal;
                            subtotalgeneral += subtotal;
                            dinerodescuento += descuentotemp;
                            break;
                        }

                        if (confirmacionCD == 1 && tipoBV.equals("turista")) {
                            double subtotalDolares = subtotal / 25, descuentotempDolares = descuentotemp / 25, totalDolares = preciotemp / 25;
                            System.out.println("Su compra ha sido confirmada, gracias por confiar en nuestros servicios");
                            System.out.println("--------------------FACTURA--------------------");
                            System.out.println("Su destino: San Jose, Costa Rica");
                            System.out.println("La cantidad de boletos: " + cantidadBV);
                            System.out.println("En clase de: " + tipoBV);
                            System.out.println("Subtotal: Lps." + subtotal + " o  $." + subtotalDolares);
                            System.out.println("Descuento " + descuentoSJCR + "%: Lps." + descuentotemp + " o  $." + descuentotempDolares);
                            System.out.println("Total: " + preciotemp + " o  $." + totalDolares);
                            boletosSJCRTur += cantidadBV;
                            totalboletosSJCR += preciotemp;
                            subtotalSJCRTur += subtotal;
                            subtotalgeneral += subtotal;
                            dinerodescuento += descuentotemp;
                            break;
                        }
                    }

                    if (seleccionboleto == 'c' || seleccionboleto == 'C') {

                        String precioMC = (tipoBV.equals("negocios")) ? "11200"
                                : (tipoBV.equals("turista")) ? "8000" : "No existe";

                        System.out.println("Cuantos boletos desea comprar?");
                        int cantidadBV = lea.nextInt();

                        if (precioMC.equals("No existe")) {
                            System.out.println("Esta clase no existe");
                            continue;
                        }

                        double preciotemp = Integer.parseInt(precioMC) * cantidadBV;

                        double subtotal = preciotemp;

                        double descuentoMC = 0, descuentotemp = 0;

                        if (cantidadBV < 0) {
                            System.out.println("No se puede ingresar numeros negativos, sera reenviado al menu");
                            break;
                        }

                        if (cantidadBV >= 2 && tipoBV.equals("turista")) {
                            descuentotemp = preciotemp * 0.15;
                            preciotemp = preciotemp - descuentotemp;
                            descuentoMC = 15;
                        }

                        System.out.println("Su destino: Medellin, Colombia");
                        System.out.println("La cantidad de boletos: " + cantidadBV);
                        System.out.println("Subtotal: Lps." + subtotal);
                        System.out.println("Descuento " + descuentoMC + "%: $" + descuentotemp);
                        System.out.println("Total: " + preciotemp);
                        System.out.println("Confirme su compra escribiendo 1, si no escriba cualquier otro numero");
                        int confirmacionCD = lea.nextInt();

                        if (confirmacionCD == 1 && tipoBV.equals("negocios")) {
                            double subtotalDolares = subtotal / 25, descuentotempDolares = descuentotemp / 25, totalDolares = preciotemp / 25;
                            System.out.println("Su compra ha sido confirmada, gracias por confiar en nuestros servicios");
                            System.out.println("--------------------FACTURA--------------------");
                            System.out.println("Su destino: Medellin, Colombia");
                            System.out.println("La cantidad de boletos: " + cantidadBV);
                            System.out.println("En clase de: " + tipoBV);
                            System.out.println("Subtotal: Lps." + subtotal + " o  $." + subtotalDolares);
                            System.out.println("Descuento " + descuentoMC + "%: Lps." + descuentotemp + " o  $." + descuentotempDolares);
                            System.out.println("Total: " + preciotemp + " o  $." + totalDolares);
                            boletosMCNeg += cantidadBV;
                            totalboletosMC += preciotemp;
                            subtotalMCNeg += subtotal;
                            subtotalgeneral += subtotal;
                            dinerodescuento += descuentotemp;
                            break;
                        }

                        if (confirmacionCD == 1 && tipoBV.equals("turista")) {
                            double subtotalDolares = subtotal / 25, descuentotempDolares = descuentotemp / 25, totalDolares = preciotemp / 25;
                            System.out.println("Su compra ha sido confirmada, gracias por confiar en nuestros servicios");
                            System.out.println("--------------------FACTURA--------------------");
                            System.out.println("Su destino: Medellin, Colombia");
                            System.out.println("La cantidad de boletos: " + cantidadBV);
                            System.out.println("En clase de: " + tipoBV);
                            System.out.println("Subtotal: Lps." + subtotal + " o  $." + subtotalDolares);
                            System.out.println("Descuento " + descuentoMC + "%: Lps." + descuentotemp + " o  $." + descuentotempDolares);
                            System.out.println("Total: " + preciotemp + " o  $." + totalDolares);
                            boletosMCTur += cantidadBV;
                            totalboletosMC += preciotemp;
                            subtotalMCTur += subtotal;
                            subtotalgeneral += subtotal;
                            dinerodescuento += descuentotemp;
                            break;
                        }
                    }

                    if (seleccionboleto == 'd' || seleccionboleto == 'D') {

                        String precioSC = (tipoBV.equals("negocios")) ? "11200"
                                : (tipoBV.equals("turista")) ? "8000" : "No existe";

                        System.out.println("Cuantos boletos desea comprar?");
                        int cantidadBV = lea.nextInt();

                        if (precioSC.equals("No existe")) {
                            System.out.println("Esta clase no existe");
                            continue;
                        }

                        double preciotemp = Integer.parseInt(precioSC) * cantidadBV;

                        double subtotal = preciotemp, preciotemp2 = 0, descuentoSC = 0, descuentotemp = 0;

                        if (cantidadBV < 0) {
                            System.out.println("No se puede ingresar numeros negativos, sera reenviado al menu");
                            break;
                        }

                        System.out.println("Su destino: Santiago, Chile");
                        System.out.println("La cantidad de boletos: " + cantidadBV);
                        System.out.println("Subtotal: Lps." + subtotal);
                        System.out.println("Descuento " + descuentoSC + "%: $" + descuentotemp);
                        System.out.println("Total: " + preciotemp);
                        System.out.println("Confirme su compra escribiendo 1, si no escriba cualquier otro numero");
                        int confirmacionCD = lea.nextInt();

                        if (confirmacionCD == 1 && tipoBV.equals("negocios")) {
                            double subtotalDolares = subtotal / 25, descuentotempDolares = descuentotemp / 25, totalDolares = preciotemp / 25;
                            System.out.println("Su compra ha sido confirmada, gracias por confiar en nuestros servicios");
                            System.out.println("--------------------FACTURA--------------------");
                            System.out.println("Su destino: Medellin, Colombia");
                            System.out.println("La cantidad de boletos: " + cantidadBV);
                            System.out.println("En clase de: " + tipoBV);
                            System.out.println("Subtotal: Lps." + subtotal + " o  $." + subtotalDolares);
                            System.out.println("Descuento " + descuentoSC + "%: Lps." + descuentotemp + " o  $." + descuentotempDolares);
                            System.out.println("Total: " + preciotemp + " o  $." + totalDolares);
                            boletosSCNeg += cantidadBV;
                            totalboletosSC += preciotemp;
                            subtotalSCNeg += subtotal;
                            subtotalgeneral += subtotal;
                            dinerodescuento += descuentotemp;
                            break;
                        }

                        if (confirmacionCD == 1 && tipoBV.equals("turista")) {
                            double subtotalDolares = subtotal / 25, descuentotempDolares = descuentotemp / 25, totalDolares = preciotemp / 25;
                            System.out.println("Su compra ha sido confirmada, gracias por confiar en nuestros servicios");
                            System.out.println("--------------------FACTURA--------------------");
                            System.out.println("Su destino: Santiago, Chile");
                            System.out.println("La cantidad de boletos: " + cantidadBV);
                            System.out.println("En clase de: " + tipoBV);
                            System.out.println("Subtotal: Lps." + subtotal + " o  $." + subtotalDolares);
                            System.out.println("Descuento " + descuentoSC + "%: Lps." + descuentotemp + " o  $." + descuentotempDolares);
                            System.out.println("Total: " + preciotemp + " o  $." + totalDolares);
                            boletosSCTur += cantidadBV;
                            totalboletosSC += preciotemp;
                            subtotalSCTur += subtotal;
                            subtotalgeneral += subtotal;
                            dinerodescuento += descuentotemp;
                            break;
                        }
                    }

                } while (contadorop1 == 0);

            }

            if (opcion == 2) {
                contadorAccesoOP2++;
                do {
                    System.out.println("-----------------------------------Ingreso al menu de paquetes turisticos-----------------------------------");
                    System.out.println("             Destino           Boleto Aereo (1 persona)    Hotel(3 personas)    Renta de auto     Recorrido");
                    System.out.println("a. Ciudad de Mexico, Mexico           Gratis                   Lps.5500          Lps.3000         Lps.1800");
                    System.out.println("b. San Jose, Costa Rica               Gratis                   Lps.4000          Lps.2500         Lps.2000");
                    System.out.println("c. Medellin, Colombia                 Gratis                   Lps.4800          Lps.3200         Lps.3000");
                    System.out.println("d. Santiago, Chile                    Gratis                   Lps.6000          Lps.3500         Lps.3800");
                    System.out.println("e. Salir");
                    System.out.println("Que opcion desea elegir?:");
                    char eleccionTuristica = lea.next().charAt(0);

                    if (eleccionTuristica != 'a' && eleccionTuristica != 'A' && eleccionTuristica != 'b' && eleccionTuristica != 'B' && eleccionTuristica != 'c' && eleccionTuristica != 'd' && eleccionTuristica != 'D' && eleccionTuristica != 'e' && eleccionTuristica != 'E') {
                        System.out.println("Ha ingresado una opcion invalida, vuelva a intentarlo");
                        continue;
                    }

                    if (eleccionTuristica == 'e') {
                        System.out.println("Ha salido.");
                        break;
                    }

                    if (eleccionTuristica == 'a' || eleccionTuristica == 'A') {
                        System.out.println("Cuantas personas tomaran este paquete turistico?:");
                        int cantidadPT = lea.nextInt();
                        double hotel = 5500, rentaauto = 0, recorrido = 0, diascarro = 5, boletospagados = 0, boletosgratis = 1, paquetesturisticos = 1;

                        if (cantidadPT < 0) {
                            System.out.println("No se aceptan numeros negativos");
                            break;
                        }

                        if (cantidadPT > 3) {
                            System.out.println("Se le cobrara un segundo paquete turistico debido a que mas de 3 personas tomaran el paquete");
                        }

                        System.out.println("El servicio de renta de auto y el recorrido son opcionales, desea incluirlos? (s/n)");
                        char decisionopcional = lea.next().charAt(0);

                        if (decisionopcional == 's' || decisionopcional == 'S') {
                            rentaauto = 3000;
                            recorrido = 1800;
                            diascarro = 5;
                            if (cantidadPT > 3) {
                                rentaauto = 3000 * 2;
                                recorrido = 1800 * 2;
                                hotel = 5500 * 2;
                                boletosgratis = 2;
                                paquetesturisticos = 2;
                                diascarro = 10;
                            }
                            System.out.println("Ahorita mismo cuenta con renta de auto para " + diascarro + " dias, desea extender este plazo de tiempo por 30$ por dia? (s/n)");
                            char aumentarauto = lea.next().charAt(0);
                            if (aumentarauto == 's' || aumentarauto == 'S') {
                                System.out.println("Cuantos dias desea aumentar?");
                                int diasextracarro = lea.nextInt();
                                if (diasextracarro < 0) {
                                    System.out.println("No se aceptan numeros negativos");
                                    break;
                                }
                                diascarro = diascarro + diasextracarro;
                                rentaauto = (rentaauto + ((diasextracarro * 30) * 25));
                                System.out.println("Por una renta de " + diascarro + " dias se le cobrara Lps." + rentaauto);
                                System.out.println("Por el recorrido se le cobrara: Lps." + recorrido);
                            } else if (aumentarauto == 'n' || aumentarauto == 'N') {
                                System.out.println("Por la renta de " + diascarro + " dias se le cobrara Lps." + rentaauto);
                                System.out.println("Por el recorrido se le cobrara: Lps" + recorrido);
                            }
                        } else if (decisionopcional != 's' || decisionopcional != 'S') {
                            System.out.println("No se le incluira la renta de auto y el recorrido");
                        } else if (decisionopcional != 'n' && decisionopcional != 'N' && decisionopcional != 's' && decisionopcional != 'S') {
                            System.out.println("Esta no es una opcion valida");
                        }

                        System.out.println("Confirme su compra escribiendo 1, de lo contrario escriba cualquier otro numero");
                        int confirmacionPT = lea.nextInt();

                        if (confirmacionPT == 1) {
                            boletospagados = cantidadPT - boletosgratis;
                            double pagarboletos = boletospagados * 5500, descuentotemp = 0, pagoboletos = pagarboletos, numdescuento = 0;

                            if (boletospagados > 3) {
                                descuentotemp = pagarboletos * 0.05;
                                pagarboletos = pagarboletos - descuentotemp;
                                numdescuento = 5;
                            }

                            double pagoboletosDolares = pagoboletos / 25, descuentotempDolares = descuentotemp / 25, hotelDolares = hotel / 25, recorridoDolares = recorrido / 25, rentaautoDolares = rentaauto / 25, subtotal = pagoboletos + hotel + rentaauto + recorrido, subtotaldolares = subtotal / 25, total = subtotal - descuentotemp, totaldolares = total / 25;

                            System.out.println("------------------------------------Factura------------------------------------");
                            System.out.println("Destino: Ciudad de Mexico, Mexico");
                            System.out.println("Paquetes turisticos: " + paquetesturisticos);
                            System.out.println("Boletos: Gratis-" + boletosgratis + " Pagados-" + boletospagados + ": Lps." + pagoboletos + " o  $." + pagoboletosDolares);
                            System.out.println("Descuento en boletos: " + numdescuento + "% : Lps." + descuentotemp + " o  $." + descuentotempDolares);
                            System.out.println("Hotel: Lps." + hotel + " o  $." + hotelDolares);
                            System.out.println("Renta de Auto: Lps." + rentaauto + " o  $." + rentaautoDolares);
                            System.out.println("Recorrido: Lps." + recorrido + " o  $." + recorridoDolares);
                            System.out.println("Subtotal: " + subtotal + " o  $." + subtotaldolares);
                            System.out.println("Total: Lps." + total + " o  $." + totaldolares);
                            subtotalPTCDMX += subtotal;
                            totalPTCDMX += total;
                            subtotalCDMXTur += pagoboletos;
                            boletosPTCDMX += pagoboletos;
                            dinerodescuento += descuentotemp;
                            subtotalgeneral += subtotal;
                            dinerohotelCDMX += hotel;
                            dinerorentaautoCDMX += rentaauto;
                            dinerorecorridoCDMX += recorrido;
                            paquetesturisticosvendidos += paquetesturisticos;
                            paquetesturisticosCDMX += paquetesturisticos;
                            boletosCDMXTur += boletosgratis + boletospagados;
                            break;
                        } else {
                            System.out.println("Se cancelo su compra existosamente, volvera al Menu");
                        }
                    }

                    if (eleccionTuristica == 'b' || eleccionTuristica == 'B') {
                        System.out.println("Cuantas personas tomaran este paquete turistico?:");
                        int cantidadPT = lea.nextInt();
                        double hotel = 4000, rentaauto = 0, recorrido = 0;
                        int boletospagados = 0, boletosgratis = 1, diascarro = 5, paquetesturisticos = 1;

                        if (cantidadPT < 0) {
                            System.out.println("No se aceptan numeros negativos");
                            break;
                        }

                        if (cantidadPT > 3) {
                            System.out.println("Se le cobrara un segundo paquete turistico debido a que mas de 3 personas tomaran el paquete");
                        }

                        System.out.println("El servicio de renta de auto y el recorrido son opcionales, desea incluirlos? (s/n)");
                        char decisionopcional = lea.next().charAt(0);

                        if (decisionopcional == 's' || decisionopcional == 'S') {
                            rentaauto = 2500;
                            recorrido = 2000;
                            diascarro = 5;
                            if (cantidadPT > 3) {
                                rentaauto = 2500 * 2;
                                recorrido = 2000 * 2;
                                hotel = 4000 * 2;
                                boletosgratis = 2;
                                paquetesturisticos = 2;
                                diascarro = 10;
                            }
                            System.out.println("Ahorita mismo cuenta con renta de auto para " + diascarro + " dias, desea extender este plazo de tiempo por 30$ por dia? (s/n)");
                            char aumentarauto = lea.next().charAt(0);
                            if (aumentarauto == 's' || aumentarauto == 'S') {
                                System.out.println("Cuantos dias desea aumentar?");
                                int diasextracarro = lea.nextInt();
                                if (diasextracarro < 0) {
                                    System.out.println("No se aceptan numeros negativos");
                                    break;
                                }
                                diascarro = diascarro + diasextracarro;
                                rentaauto = (rentaauto + ((diasextracarro * 30) * 25));
                                System.out.println("Por una renta de " + diascarro + " dias se le cobrara Lps." + rentaauto);
                                System.out.println("Por el recorrido se le cobrara: Lps." + recorrido);
                            } else if (aumentarauto != 's' || aumentarauto != 'S') {
                                System.out.println("Por la renta de " + diascarro + " dias se le cobrara Lps." + rentaauto);
                                System.out.println("Por el recorrido se le cobrara: Lps" + recorrido);
                            }
                        } else if (decisionopcional == 'n' || decisionopcional == 'N') {
                            System.out.println("No se le incluira la renta de auto y el recorrido");
                        } else if (decisionopcional != 'n' && decisionopcional != 'N' && decisionopcional != 's' && decisionopcional != 'S') {
                            System.out.println("Esta no es una opcion valida");
                        }

                        System.out.println("Confirme su compra escribiendo 1, de lo contrario escriba cualquier otro numero");
                        int confirmacionPT = lea.nextInt();

                        if (confirmacionPT == 1) {
                            boletospagados = cantidadPT - boletosgratis;
                            double pagarboletos = boletospagados * 4800, descuentotemp = 0, pagoboletos = pagarboletos, numdescuento = 0;

                            if (boletospagados >= 1) {
                                descuentotemp = pagarboletos * 0.05;
                                pagarboletos = pagarboletos - descuentotemp;
                                numdescuento = 5;
                            }

                            double pagoboletosDolares = pagoboletos / 25, descuentotempDolares = descuentotemp / 25, hotelDolares = hotel / 25, recorridoDolares = recorrido / 25, rentaautoDolares = rentaauto / 25, subtotal = pagoboletos + hotel + rentaauto + recorrido, subtotalDolares = subtotal / 25, total = subtotal - descuentotemp, totalDolares = total / 25;

                            System.out.println("------------------------------------Factura------------------------------------");
                            System.out.println("Su destino: San Jose, Costa Rica");
                            System.out.println("Boletos: Gratis-" + boletosgratis + " Pagados-" + boletospagados + ": Lps." + pagoboletos + " o  $." + pagoboletosDolares);
                            System.out.println("Descuento en boletos: " + numdescuento + "% : Lps." + descuentotemp + " o  $." + descuentotempDolares);
                            System.out.println("Hotel: Lps." + hotel + " o  $." + hotelDolares);
                            System.out.println("Renta de Auto: Lps." + rentaauto + " o  $." + rentaautoDolares);
                            System.out.println("Recorrido: Lps." + recorrido + " o  $." + recorridoDolares);
                            System.out.println("Subtotal: " + subtotal + " o  $." + subtotalDolares);
                            System.out.println("Total: " + total + " o  $." + totalDolares);
                            subtotalPTSJCR += subtotal;
                            totalPTSJCR += total;
                            boletosPTSJCR += pagoboletos;
                            boletosSJCRTur += boletosgratis + boletospagados;
                            subtotalSJCRTur += pagoboletos;
                            dinerohotelSJCR += hotel;
                            dinerorentaautoSJCR += rentaauto;
                            dinerorecorridoSJCR += recorrido;
                            subtotalgeneral += subtotal;
                            dinerodescuento += descuentotemp;
                            paquetesturisticosvendidos += paquetesturisticos;
                            paquetesturisticosSJCR += paquetesturisticos;
                            break;
                        } else {
                            System.out.println("Se cancelo su compra existosamente, volvera al Menu");
                        }
                    }

                    if (eleccionTuristica == 'c' || eleccionTuristica == 'c') {
                        System.out.println("Cuantas personas tomaran este paquete turistico?:");
                        int cantidadPT = lea.nextInt();
                        double hotel = 4800, rentaauto = 0, recorrido = 0;
                        int boletospagados = 0, boletosgratis = 1, diascarro = 5, paquetesturisticos = 1;

                        if (cantidadPT < 0) {
                            System.out.println("No se aceptan numeros negativos");
                            break;
                        }

                        if (cantidadPT > 3) {
                            System.out.println("Se le cobrara un segundo paquete turistico debido a que mas de 3 personas tomaran el paquete");
                        }

                        System.out.println("El servicio de renta de auto y el recorrido son opcionales, desea incluirlos? (s/n)");
                        char decisionopcional = lea.next().charAt(0);

                        if (decisionopcional == 's' || decisionopcional == 'S') {
                            rentaauto = 3200;
                            recorrido = 3000;
                            if (cantidadPT > 3) {
                                rentaauto = 3200 * 2;
                                recorrido = 3000 * 2;
                                hotel = 4800 * 2;
                                boletosgratis = 2;
                                paquetesturisticos = 2;
                            }
                            System.out.println("Ahorita mismo cuenta con renta de auto para " + diascarro + " dias, desea extender este plazo de tiempo por 30$ por dia? (s/n)");
                            char aumentarauto = lea.next().charAt(0);
                            if (aumentarauto == 's' || aumentarauto == 'S') {
                                System.out.println("Cuantos dias desea aumentar?");
                                int diasextracarro = lea.nextInt();
                                if (diasextracarro < 0) {
                                    System.out.println("No se aceptan numeros negativos");
                                    break;
                                }
                                diascarro = diascarro + diasextracarro;
                                rentaauto = (rentaauto + ((diasextracarro * 30) * 25));
                                System.out.println("Por una renta de " + diascarro + " dias se le cobrara Lps." + rentaauto);
                                System.out.println("Por el recorrido se le cobrara: Lps." + recorrido);
                            } else if (aumentarauto == 'n' || aumentarauto == 'N') {
                                System.out.println("Por la renta de " + diascarro + " dias se le cobrara Lps." + rentaauto);
                                System.out.println("Por el recorrido se le cobrara: Lps" + recorrido);
                            }
                        } else if (decisionopcional != 's' || decisionopcional != 'S') {
                            System.out.println("No se le incluira la renta de auto y el recorrido");
                        } else if (decisionopcional != 'n' && decisionopcional != 'N' && decisionopcional != 's' && decisionopcional != 'S') {
                            System.out.println("Esta no es una opcion valida");
                        }

                        System.out.println("Confirme su compra escribiendo 1, de lo contrario escriba cualquier otro numero");
                        int confirmacionPT = lea.nextInt();

                        if (confirmacionPT == 1) {
                            boletospagados = cantidadPT - boletosgratis;
                            double pagarboletos = boletospagados * 8000, descuentotemp = 0, pagoboletos = pagarboletos, numdescuento = 0;

                            if (boletospagados >= 2) {
                                descuentotemp = pagarboletos * 0.15;
                                pagarboletos = pagarboletos - descuentotemp;
                                numdescuento = 15;
                            }

                            double pagoboletosDolares = pagoboletos / 25, descuentotempDolares = descuentotemp / 25, hotelDolares = hotel / 25, recorridoDolares = recorrido / 25, rentaautoDolares = rentaauto / 25, subtotal = pagoboletos + hotel + rentaauto + recorrido, subtotalDolares = subtotal / 25, total = subtotal - descuentotemp, totalDolares = total / 25;

                            System.out.println("------------------------------------Factura------------------------------------");
                            System.out.println("Su destino: Medellin, Colombia");
                            System.out.println("Boletos: Gratis-" + boletosgratis + " Pagados-" + boletospagados + ": Lps." + pagoboletos + " o  $." + pagoboletosDolares);
                            System.out.println("Descuento en boletos: " + numdescuento + "% : Lps." + descuentotemp + " o  $." + descuentotempDolares);
                            System.out.println("Hotel: Lps." + hotel + " o  $." + hotelDolares);
                            System.out.println("Renta de Auto: Lps." + rentaauto + " o  $." + rentaautoDolares);
                            System.out.println("Recorrido: Lps." + recorrido + " o  $." + recorridoDolares);
                            System.out.println("Subtotal: Lps." + subtotal + " o  $." + subtotalDolares);
                            System.out.println("Total: Lps." + total + " o  $." + totalDolares);
                            subtotalPTMC += subtotal;
                            totalPTMC += total;
                            subtotalMCTur += pagoboletos;
                            boletosPTMC += pagoboletos;
                            boletosMCTur += boletosgratis + boletospagados;
                            dinerohotelMC += hotel;
                            dinerorentaautoMC += rentaauto;
                            dinerorecorridoMC += recorrido;
                            subtotalgeneral += subtotal;
                            dinerodescuento += descuentotemp;
                            paquetesturisticosvendidos += paquetesturisticos;
                            paquetesturisticosMC += paquetesturisticos;
                            break;
                        } else {
                            System.out.println("Se cancelo su compra existosamente, volvera al Menu");
                        }
                    }

                    if (eleccionTuristica == 'd' || eleccionTuristica == 'D') {
                        System.out.println("Cuantas personas tomaran este paquete turistico?:");
                        int cantidadPT = lea.nextInt();
                        double hotel = 6000, rentaauto = 0, recorrido = 0;
                        int boletospagados = 0, boletosgratis = 1, diascarro = 5, paquetesturisticos = 1;

                        if (cantidadPT < 0) {
                            System.out.println("No se aceptan numeros negativos");
                            break;
                        }

                        if (cantidadPT > 3) {
                            System.out.println("Se le cobrara un segundo paquete turistico debido a que mas de 3 personas tomaran el paquete");
                        }

                        System.out.println("El servicio de renta de auto y el recorrido son opcionales, desea incluirlos? (s/n)");
                        char decisionopcional = lea.next().charAt(0);

                        if (decisionopcional == 's' || decisionopcional == 'S') {
                            rentaauto = 3500;
                            recorrido = 3800;
                            diascarro = 5;
                            if (cantidadPT > 3) {
                                rentaauto = 3500 * 2;
                                recorrido = 3800 * 2;
                                hotel = 6000 * 2;
                                boletosgratis = 2;
                                paquetesturisticos = 2;
                                diascarro = 10;
                            }
                            System.out.println("Ahorita mismo cuenta con renta de auto para " + diascarro + " dias, desea extender este plazo de tiempo por 30$ por dia? (s/n)");
                            char aumentarauto = lea.next().charAt(0);
                            if (aumentarauto == 's' || aumentarauto == 'S') {
                                System.out.println("Cuantos dias desea aumentar?");
                                int diasextracarro = lea.nextInt();
                                if (diasextracarro < 0) {
                                    System.out.println("No se aceptan numeros negativos");
                                    break;
                                }
                                diascarro = diascarro + diasextracarro;
                                rentaauto = (rentaauto + ((diasextracarro * 30) * 25));
                                System.out.println("Por una renta de " + diascarro + " dias se le cobrara Lps." + rentaauto);
                                System.out.println("Por el recorrido se le cobrara: Lps." + recorrido);
                            } else if (aumentarauto != 's' || aumentarauto != 'S') {
                                System.out.println("Por la renta de " + diascarro + " dias se le cobrara Lps." + rentaauto);
                                System.out.println("Por el recorrido se le cobrara: Lps" + recorrido);
                            }
                        } else if (decisionopcional == 'n' || decisionopcional == 'N') {
                            System.out.println("No se le incluira la renta de auto y el recorrido");
                        } else if (decisionopcional != 'n' && decisionopcional != 'N' && decisionopcional != 's' && decisionopcional != 'S') {
                            System.out.println("Esta no es una opcion valida");
                        }

                        System.out.println("Confirme su compra escribiendo 1, de lo contrario escriba cualquier otro numero");
                        int confirmacionPT = lea.nextInt();

                        if (confirmacionPT == 1) {
                            boletospagados = cantidadPT - boletosgratis;
                            double pagarboletos = boletospagados * 11600, descuentotemp = 0, pagoboletos = pagarboletos, numdescuento = 0, subtotal = pagoboletos + hotel + rentaauto + recorrido, subtotalDolares = subtotal / 25;
                            double pagoboletosDolares = pagoboletos / 25, descuentotempDolares = descuentotemp / 25, hotelDolares = hotel / 25, recorridoDolares = recorrido / 25, rentaautoDolares = rentaauto / 25, total = subtotal - descuentotemp, totalDolares = total / 25;

                            System.out.println("------------------------------------Factura------------------------------------");
                            System.out.println("Su destino: Santiago, Chile");
                            System.out.println("Boletos: Gratis-" + boletosgratis + " Pagados-" + boletospagados + ": Lps." + pagoboletos + " o  $." + pagoboletosDolares);
                            System.out.println("Descuento en boletos: " + numdescuento + "% : Lps." + descuentotemp + " o  $." + descuentotempDolares);
                            System.out.println("Hotel: Lps." + hotel + " o  $." + hotelDolares);
                            System.out.println("Renta de Auto: Lps." + rentaauto + " o  $." + rentaautoDolares);
                            System.out.println("Recorrido: Lps." + recorrido + " o  $." + recorridoDolares);
                            System.out.println("Subtotal: Lps." + subtotal + " o  $." + subtotalDolares);
                            System.out.println("Total: Lps." + total + " o  $." + totalDolares);
                            subtotalPTSC += subtotal;
                            totalPTSC += total;
                            subtotalSCTur += pagoboletos;
                            boletosPTSC += pagoboletos;
                            paquetesturisticosSC += paquetesturisticos;
                            paquetesturisticosvendidos += paquetesturisticos;
                            dinerohotelSC += hotel;
                            dinerorentaautoSC += rentaauto;
                            dinerorecorridoSC += recorrido;
                            boletosSCTur += boletosgratis + boletospagados;
                            subtotalgeneral += subtotal;
                            dinerodescuento += descuentotemp;
                            boletosSCTur += boletospagados + boletosgratis;

                            break;
                        } else {
                            System.out.println("Se cancelo su compra existosamente, volvera al Menu");
                        }
                    }

                } while (true);
            }

            if (opcion == 3) {
                contadorAccesoOP3++;
                System.out.println("---------------Menu de Reportes---------------");
                System.out.println("1. Reporte de boletos aereos");
                System.out.println("2. Reporte de Detalles Subtotal, Descuento, Total");
                System.out.println("3. Reporte de paquetes turisticos");
                System.out.println("4. Reporte de Accesos");
                System.out.println("5. Salir");
                int seleccionop3 = lea.nextInt();

                if (seleccionop3 == 5) {
                    System.out.println("Ha salido con exito");
                    break;
                }

                if (seleccionop3 == 1) {
                    System.out.println("----Reporte de Venta de Boletos Aereos----");
                    System.out.println("Los boletos vendidos de Ciudad de Mexico, Mexico en clase de negocios son:" + boletosCDMXNeg);
                    System.out.println("Los boletos vendidos a Ciudad de Mexico, Mexico en clase de turista son: " + boletosCDMXTur);
                    System.out.println("Los boletos vendidos de San Jose, Costa Rica en clase de negocios son:" + boletosSJCRNeg);
                    System.out.println("Los boletos vendidos de San Jose, Costa Rica en clase de turista son:" + boletosSJCRTur);
                    System.out.println("Los boletos vendidos de Medellin, Colombia en clase de negocios son:" + boletosMCNeg);
                    System.out.println("Los boletos vendidos de Medellin, Colombia en clase de turista son: " + boletosMCTur);
                    System.out.println("Los boletos vendidos de Santiago, Chile en clase de negocios: " + boletosSCNeg);
                    System.out.println("Los boletos vendidos de Santiago, Chile en clase de turista son: " + boletosSCTur);
                    System.out.println("");
                    System.out.print("Boletos Ciudad de Mexico, Mexico Negocios: ");
                    for (double i = boletosCDMXNeg; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nBoletos Ciudad de Mexico, Mexico Turista: ");
                    for (double i = boletosCDMXTur; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nBoletos San Jose, Costa Rica Negocios: ");
                    for (double i = boletosSJCRNeg; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nBoletos San Jose, Costa Rica Turista: ");
                    for (double i = boletosSJCRTur; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nBoletos Medellin, Colombia Negocios: ");
                    for (double i = boletosMCNeg; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nBoletos Medellin, Colombia Turista: ");
                    for (double i = boletosMCTur; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nBoletos Santiago, Chile Negocios: ");
                    for (double i = boletosSCNeg; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nBoletos Santiago, Chile Turista: ");
                    for (double i = boletosSCTur; i > 0; i--) {
                        System.out.print("|");
                    }
                }
                if (seleccionop3 == 2) {
                    double subtotalCDMXTurDolares = subtotalCDMXTur / 25, subtotalCDMXNegDolares = subtotalCDMXNeg / 25, subtotalSJCRTurDolares = subtotalSJCRTur / 25, subtotalSJCRNegDolares = subtotalSJCRNeg / 25, subtotalMCTurDolares = subtotalMCTur / 25, subtotalMCNegDolares = subtotalMCNeg / 25, subtotalSCTurDolares = subtotalSCTur / 25, subtotalSCNegDolares = subtotalSCNeg / 25, subtotalPTCDMXDolares = subtotalPTCDMX / 25, subtotalPTSJCRDolares = subtotalPTSJCR / 25, subtotalPTMCDolares = subtotalPTMC / 25, subtotalPTSCDolares = subtotalPTSC / 25, subtotalgeneralDolares = subtotalgeneral / 25, totalgeneral = subtotalgeneral - dinerodescuento, totalgeneralDolares = totalgeneral / 25, dinerodescuentoDolares = dinerodescuento / 25;
                    System.out.println("----Reporte de Subtotales de Boletos----");
                    System.out.println("El subtotal generado por boletos de Ciudad de Mexico, Mexico en clase turista: Lps." + subtotalCDMXTur + " o  $." + subtotalCDMXTurDolares);
                    System.out.println("El subtotal generado por boletos de Ciudad de Mexico, Mexico en clase de negocios: Lps." + subtotalCDMXNeg + " o  $." + subtotalCDMXNegDolares);
                    System.out.println("El subtotal generado por boletos de San Jose, Costa Rica en clase turista: Lps." + subtotalSJCRTur + " o  $." + subtotalSJCRTurDolares);
                    System.out.println("El subtotal generado por boletos de San Jose, Costa Rica en clase de negocios: Lps." + subtotalSJCRNeg + " o  $." + subtotalSJCRNegDolares);
                    System.out.println("El subtotal generado por boletos de Medellin, Colombia en clase turista: Lps." + subtotalMCTur + " o  $." + subtotalMCTurDolares);
                    System.out.println("El subtotal generado por boletos de Medellin, Colombia en clase de negocios: Lps." + subtotalMCNeg + " o  $." + subtotalMCNegDolares);
                    System.out.println("El subtotal generado por boletos de Santiago, Chile en clase de turista: Lps." + subtotalSCTur + " o  $." + subtotalSCTurDolares);
                    System.out.println("El subtotal generado por boletos de Santiago, Chile en clase de negocios: Lps." + subtotalSCNeg + " o  $." + subtotalSCNegDolares);
                    System.out.println("");
                    System.out.print("Subtotal Ciudad de Mexico, Mexico Turista: ");
                    for (int i = subtotalCDMXTur / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nSubtotal Ciudad de Mexico, Mexico Negocios: ");
                    for (int i = subtotalCDMXNeg / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nSubtotal San Jose, Costa Rica Turista: ");
                    for (int i = subtotalSJCRTur / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nSubtotal San Jose, Costa Rica Negocios: ");
                    for (int i = subtotalSJCRNeg / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nSubtotal Medellin, Colombia Turista: ");
                    for (int i = subtotalMCTur / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nSubtotal Medellin, Colombia Negocios: ");
                    for (int i = subtotalMCNeg / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nSubtotal Santiago, Chile Turista: ");
                    for (int i = subtotalSCTur / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nSubtotal Santiago, Chile Negocios: ");
                    for (int i = subtotalSCNeg / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.println("");
                    System.out.println("\n----Reporte de Subtotales de Paquetes Turisticos----");
                    System.out.println("El subtotal generado por paquetes turisticos de Ciudad de Mexico, Mexico: Lps." + subtotalPTCDMX + " o  $." + subtotalPTCDMXDolares);
                    System.out.println("El subtotal generado por paquetes turisticos de San Jose, Costa Rica: Lps." + subtotalPTSJCR + " o  $." + subtotalPTSJCRDolares);
                    System.out.println("El subtotal generado por paquetes turisticos de Medellin, Colombia Lps." + subtotalPTMC + " o  $." + subtotalPTMCDolares);
                    System.out.println("El subtotal generado por paquetes Turisticos de Santiago, Chile Lps." + subtotalPTSC + " o  $." + subtotalPTSCDolares);
                    System.out.println("");
                    System.out.print("Subtotal Ciudad de Mexico, Mexico: ");
                    for (int i = subtotalPTCDMX / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nSubtotal San Jose, Costa Rica: ");
                    for (int i = subtotalPTSJCR / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nSubtotal Medellin, Colombia: ");
                    for (int i = subtotalPTMC / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nSubtotal Santiago Chile: ");
                    for (int i = subtotalPTSC / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.println("");
                    System.out.println("\n----Reportes Generales----");
                    System.out.println("Subtotal general: Lps." + subtotalgeneral + " o  $." + subtotalgeneralDolares);
                    System.out.println("Descuentos aplicados: Lps" + dinerodescuento + " o  $." + dinerodescuentoDolares);
                    System.out.println("Total general: Lps." + totalgeneral + " o  $." + totalgeneralDolares);
                    System.out.println("");
                    System.out.print("Subtotal: ");
                    for (double i = subtotalgeneral / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nDescuentos Aplicados: ");
                    for (double i = dinerodescuento / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nTotal: ");
                    for (double i = totalgeneral / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                }

                if (seleccionop3 == 3) {
                    double boletosPTCDMXDolares = boletosPTCDMX / 25, dinerohotelCDMXDolares = dinerohotelCDMX / 25, dinerorentaautoCDMXDolares = dinerorentaautoCDMX / 25, dinerorecorridoCDMXDolares = dinerorecorridoCDMX / 25, boletosPTSJCRDolares = boletosPTSJCR / 25, dinerohotelSJCRDolares = dinerohotelSJCR / 25, dinerorentaautoSJCRDolares = dinerorentaautoSJCR / 25, dinerorecorridoSJCRDolares = dinerorecorridoSJCR / 25, boletosPTMCDolares = boletosPTMC / 25, dinerohotelMCDolares = dinerohotelMC / 25, dinerorentaautoMCDolares = dinerorentaautoMC / 25, dinerorecorridoMCDolares = dinerorecorridoMC / 25, boletosPTSCDolares = boletosPTSC / 25, dinerohotelSCDolares = dinerohotelSC / 25, dinerorentaautoSCDolares = dinerorentaautoSC / 25, dinerorecorridoSCDolares = dinerorecorridoSC / 25, subtotalPTCDMXDolares = subtotalPTCDMX / 25, subtotalPTSJCRDolares = subtotalPTSJCR / 25, subtotalPTMCDolares = subtotalPTMC / 25, subtotalPTSCDolares = subtotalPTSC / 25;
                    System.out.println("----Reportes de Paquetes Turisticos----");
                    System.out.println("------------------------Paquetes Turisticos Ciudad de Mexico, Mexico------------------------");
                    System.out.println("Paquetes Turisticos vendidos a Ciudad de Mexico, Mexico:" + paquetesturisticosCDMX);
                    System.out.println("Dinero generado por Boletos Aereos de Paquetes Turisticos de Ciudad de Mexico, Mexico: Lps." + boletosPTCDMX + " o  $." + boletosPTCDMXDolares);
                    System.out.println("Dinero generado por Hotel en Ciudad de Mexico, Mexico: Lps." + dinerohotelCDMX + " o  $." + dinerohotelCDMXDolares);
                    System.out.println("Dinero generado por Renta de Autos en Ciudad de Mexico, Mexico: Lps." + dinerorentaautoCDMX + " o  $." + dinerorentaautoCDMXDolares);
                    System.out.println("Dinero generado por Recorridos en Ciudad de Mexico, Mexico: Lps." + dinerorecorridoCDMX + " o  $." + dinerorecorridoCDMXDolares);
                    System.out.println("Subtotal general generado por Paquetes Turisticos a Ciudad de Mexico, Mexico: Lps." + subtotalPTCDMX + " o  $." + subtotalPTCDMXDolares);
                    System.out.println("");
                    System.out.print("Paquetes Turisticos Vendidos CDMX: ");
                    for (double i = paquetesturisticosCDMX; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nDinero generado Boletos Paquete Turistico CDMX: ");
                    for (double i = boletosPTCDMX / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nDinero generado por Hotel en CDMX: ");
                    for (double i = dinerohotelCDMX / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nDinero generado por Renta de Autos en CDMX: ");
                    for (double i = dinerorentaautoCDMX / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nDinero generado por Recorridos en CDMX: ");
                    for (double i = dinerorecorridoCDMX / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.println("\n");
                    System.out.println("------------------------Paquetes Turisticos San Jose, Costa Rica------------------------");
                    System.out.println("Paquetes Turisticos vendidos a San Jose, Costa Rica:" + paquetesturisticosSJCR);
                    System.out.println("Dinero generado por Boletos Aereos de Paquetes Turisticos de San Jose, Costa Rica: Lps." + boletosPTSJCR + " o  $." + boletosPTSJCRDolares);
                    System.out.println("Dinero generado por Hotel en San Jose, Costa Rica: Lps." + dinerohotelSJCR + " o  $." + dinerohotelSJCRDolares);
                    System.out.println("Dinero generado por Renta de Autos en San Jose, Costa Rica: Lps." + dinerorentaautoSJCR + " o  $." + dinerorentaautoSJCRDolares);
                    System.out.println("Dinero generado por Recorridos en San Jose, Costa Rica: Lps." + dinerorecorridoSJCR + " o  $." + dinerorecorridoSJCRDolares);
                    System.out.println("Subtotal general generado por Paquetes Turisticos a San Jose, Costa Rica: Lps." + subtotalPTSJCR + " o  $." + subtotalPTSJCRDolares);
                    System.out.println("");
                    System.out.print("Paquetes Turisticos Vendidos SJ,CR: ");
                    for (double i = paquetesturisticosSJCR; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nDinero generado Boletos Paquete Turistico SJ, CR: ");
                    for (double i = boletosPTSJCR / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nDinero generado por Hotel en SJ, CR: ");
                    for (double i = dinerohotelSJCR / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nDinero generado por Renta de Autos en SJ, CR: ");
                    for (double i = dinerorentaautoSJCR / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nDinero generado por Recorridos en SJ, CR: ");
                    for (double i = dinerorecorridoSJCR / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.println("\n");
                    System.out.println("------------------------Paquetes Turisticos Medellin, Colombia------------------------");
                    System.out.println("Paquetes Turisticos vendidos a Medellin, Colombia:" + paquetesturisticosMC);
                    System.out.println("Dinero generado por Boletos Aereos de Paquetes Turisticos de Medellin, Colombia: Lps." + boletosPTMC + " o  $." + boletosPTMCDolares);
                    System.out.println("Dinero generado por Hotel en Medellin, Colombia: Lps." + dinerohotelMC + " o  $." + dinerohotelMCDolares);
                    System.out.println("Dinero generado por Renta de Autos en Medellin, Colombia: Lps." + dinerorentaautoMC + " o  $." + dinerorentaautoMCDolares);
                    System.out.println("Dinero generado por Recorridos en Medellin, Colombia: Lps." + dinerorecorridoMC + " o  $." + dinerorecorridoMCDolares);
                    System.out.println("Subtotal general generado por Paquetes Turisticos a Medellin, Colombia: Lps." + subtotalPTMC + " o  $." + subtotalPTMCDolares);
                    System.out.println("");
                    System.out.print("Paquetes Turisticos Vendidos Medellin, Colombia: ");
                    for (double i = paquetesturisticosMC; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nDinero generado Boletos Paquete Turistico Medellin, Colombia: ");
                    for (double i = boletosPTMC / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nDinero generado por Hotel en Medellin, Colombia: ");
                    for (double i = dinerohotelMC / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nDinero generado por Renta de Autos en Medellin, Colombia: ");
                    for (double i = dinerorentaautoMC / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nDinero generado por Recorridos en Medellin, Colombia: ");
                    for (double i = dinerorecorridoMC / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.println("\n");
                    System.out.println("------------------------Paquetes Turisticos Santiago Chile----------------------------");
                    System.out.println("Paquetes Turisticos vendidos a Santiago, Chile:" + paquetesturisticosSC);
                    System.out.println("Dinero generado por Boletos Aereos de Paquetes Turisticos de Santiago, Chile: Lps." + boletosPTSC + " o  $." + boletosPTSCDolares);
                    System.out.println("Dinero generado por Hotel en Santiago, Chile: Lps." + dinerohotelSC + " o  $." + dinerohotelSCDolares);
                    System.out.println("Dinero generado por Renta de Autos en Santiago, Chile: Lps." + dinerorentaautoSC + " o  $." + dinerorentaautoSCDolares);
                    System.out.println("Dinero generado por Recorridos en Santiago, chile: Lps." + dinerorecorridoSC + " o  $." + dinerorecorridoSCDolares);
                    System.out.println("Subtotal general generado por Paquetes Turisticos a Santiago, Chile: Lps." + subtotalPTSC + " o  $." + subtotalPTSCDolares);
                    System.out.println("");
                    System.out.print("Paquetes Turisticos Vendidos Santiago, Chile: ");
                    for (double i = paquetesturisticosSC; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nDinero generado Boletos Paquete Turistico Santiago, Chile: ");
                    for (double i = boletosPTSC / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nDinero generado por Hotel en Santiago, Chile: ");
                    for (double i = dinerohotelSC / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nDinero generado por Renta de Autos en Santiago, Chile: ");
                    for (double i = dinerorentaautoSC / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nDinero generado por Recorridos en Santiago, Chile: ");
                    for (double i = dinerorecorridoSC / 1000; i > 0; i--) {
                        System.out.print("|");
                    }
                }

                if (seleccionop3 == 4) {
                    System.out.println("------------------------Reporte de Accesos a Menus------------------------");
                    System.out.println("Se ha ingresado al Menu de Boletos Aereos un total de: " + contadorAccesoOP1 + " veces");
                    System.out.println("Se ha ingresado al Menu de Paquetes Turisticos un total de: " + contadorAccesoOP2 + " veces");
                    System.out.println("Se ha ingresado al menu de Reportes un total de: " + contadorAccesoOP3 + " veces");
                    System.out.print("\nMenu Boletos Aereos: ");
                    for (double i = contadorAccesoOP1; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nMenu Paquetes Turisticos: ");
                    for (double i = contadorAccesoOP2; i > 0; i--) {
                        System.out.print("|");
                    }
                    System.out.print("\nMenu Reportes: ");
                    for (double i = contadorAccesoOP3; i > 0; i--) {
                        System.out.print("|");
                    }
                }

                if (seleccionop3 != 1 && seleccionop3 != 2 && seleccionop3 != 3 && seleccionop3 != 4) {
                    System.out.println("Esta no es una opcion");
                }
            }

            System.out.println("\nDesea volver al menú? (s/n)");
            char respuesta = lea.next().charAt(0);
            if (respuesta == 's' || respuesta == 'S') {
                continue;
            } else {
                System.out.println("Nos vemos!");
                break;
            }
        }
    }
}
