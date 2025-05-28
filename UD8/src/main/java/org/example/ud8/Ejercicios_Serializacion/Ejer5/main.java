package org.example.ud8.Ejercicios_Serializacion.Ejer5;

import java.io.*;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados_Jefes = new ArrayList<>();
        listaEmpleados_Jefes.add(new Empleado("Ernesto",1500.00));
        listaEmpleados_Jefes.add(new Empleado("Iris",1800.00));
        listaEmpleados_Jefes.add(new Empleado("Willy",3500.00));
        listaEmpleados_Jefes.add(new Jefe("Ernesto",5000.00,"Ventas"));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("empleados.ser"))) {
            out.writeObject(listaEmpleados_Jefes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Empleado> listaEmpleados_Jefes2 = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("empleados.ser"))) {
            listaEmpleados_Jefes2 = (ArrayList<Empleado>) in.readObject();

            for (Empleado emp : listaEmpleados_Jefes2) {
                System.out.println(emp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}