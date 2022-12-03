/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto2;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class ProyectoColas {
    
    public static void main(String[] args) {
        
        int opcion = 0, nodo_informacion = 0;

        Colas colas = new Colas();
        Colas colas2 = new Colas();
        Colas colas3 = new Colas();
        Colas colas4 = new Colas();

        int CantidadC1;
        int CantidadC2;
        int CantidadC3;
        int CantidadC4;

        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de opciones\n\n"
                        + "1. Hacer cola en cajero\n"
                        + "2. Realizar transaccion\n"
                        + "3. Mostrar contenido de las colas\n"
                        + "4. Salir\n\n"));

                switch (opcion) {
                    case 1:
                        CantidadC1 = colas.CantidadLista();
                        CantidadC2 = colas2.CantidadLista();
                        CantidadC3 = colas3.CantidadLista();
                        CantidadC4 = colas4.CantidadLista();

                        int CantidadColas[] = {CantidadC1, CantidadC2, CantidadC3, CantidadC4};

                        int menor = CantidadC1;

                        for (int i = 0; i < CantidadColas.length; i++) {

                            if (menor < CantidadColas[i]) {

                                menor = CantidadColas[i];

                            }
                        }

                        if (menor == CantidadC1 && menor != CantidadC2 && menor != CantidadC3 && menor != CantidadC4) {
                            nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Porfavor ingrese el monto a guardar en el nodo"));
                            colas.Insertar(nodo_informacion);
                        }

                        if (menor == CantidadC2 && menor != CantidadC1 && menor != CantidadC3 && menor != CantidadC4) {
                            nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Porfavor ingrese el monto a guardar en el nodo"));
                            colas2.Insertar(nodo_informacion);
                        }

                        if (menor == CantidadC3 && menor != CantidadC2 && menor != CantidadC1 && menor != CantidadC4) {
                            nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Porfavor ingrese el monto a guardar en el nodo"));
                            colas3.Insertar(nodo_informacion);
                        }

                        if (menor == CantidadC4 && menor != CantidadC2 && menor != CantidadC3 && menor != CantidadC1) {
                            nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Porfavor ingrese el monto a guardar en el nodo"));
                            colas4.Insertar(nodo_informacion);
                        }

                        if (CantidadC1 == CantidadC2 || CantidadC1 == CantidadC3 || CantidadC1 == CantidadC4
                                || CantidadC2 == CantidadC3 || CantidadC2 == CantidadC4 || CantidadC3 == CantidadC4) {

                            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    " Cajeros con similar cola\n\n"
                                    + "Favor seleccione un cajero:\n "
                                    + "\tCajero 1\n"
                                    + "\tCajero 2\n"
                                    + "\tCajero 3\n"
                                    + "\tCajero 4\n\n"));

                            if (opcion == 1) {
                                nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Porfavor ingrese el monto a guardar en el nodo"));
                                colas.Insertar(nodo_informacion);
                            }

                            if (opcion == 2) {
                                nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Porfavor ingrese el monto a guardar en el nodo"));
                                colas2.Insertar(nodo_informacion);
                            }

                            if (opcion == 3) {
                                nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Porfavor ingrese el monto a guardar en el nodo"));
                                colas3.Insertar(nodo_informacion);
                            }

                            if (opcion == 4) {
                                nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Porfavor ingrese el monto a guardar en el nodo"));
                                colas4.Insertar(nodo_informacion);
                            }
                        }

                        break;

                    case 2:

                        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                " Cajeros con similar cola \n\n"
                                + "Favor seleccione un cajero:\n "
                                + "\tCajero 1\n"
                                + "\tCajero 2\n"
                                + "\tCajero 3\n"
                                + "\tCajero 4\n\n"));

                        if (opcion == 1) {

                            if (!colas.ColaVacia()) {
                                JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el monto: "
                                        + colas.Extraer());
                            } else {
                                JOptionPane.showMessageDialog(null, "La lista esta vacia");
                            }
                        }

                        if (opcion == 2) {

                            if (!colas2.ColaVacia()) {
                                JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el monto: "
                                        + colas2.Extraer());
                            } else {
                                JOptionPane.showMessageDialog(null, "La lista esta vacia");
                            }
                        }

                        if (opcion == 3) {

                            if (!colas3.ColaVacia()) {
                                JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el monto: "
                                        + colas3.Extraer());
                            } else {
                                JOptionPane.showMessageDialog(null, "La lista esta vacia");
                            }
                        }

                        if (opcion == 4) {

                            if (!colas4.ColaVacia()) {
                                JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el monto: "
                                        + colas4.Extraer());
                            } else {
                                JOptionPane.showMessageDialog(null, "La lista esta vacia");
                            }
                        }

                        break;

                    case 3:
                        colas.MostrarContenido();
                        colas2.MostrarContenido();
                        colas3.MostrarContenido();
                        colas4.MostrarContenido();
                        break;

                    case 4:
                        opcion = 4;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no disponible");
                        break;

                }

            } catch (NumberFormatException e) {
            }
        } while (opcion != 4);

    }
}
