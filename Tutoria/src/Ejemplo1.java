import javax.swing.*;
import java.util.Scanner;
public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        Double parcial;
        Double trabajo;
        Double certificacion;
        Double autocoe;
        String mensaje = "Error, ingrese dato entre 0.0 y 5.0";
        Double notadefinitiva;
        String nombre;

        nombre = JOptionPane.showInputDialog(null, "Digite su nombre: ");
        parcial = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la nota del parcial: "));

        if(parcial >= 0 && parcial <= 5){
            trabajo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar nota de trabajo"));
            if(trabajo >= 0 && trabajo <= 5){
                certificacion = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar nota de la certificación"));
                if(certificacion >= 0 && certificacion <= 5){
                    autocoe = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar nota de la Autoevaluación y Coevaluación"));
                    if(autocoe >= 0 && autocoe <= 5){
                        //Si todo se ingresó correctamente, llega hasta aqui
                        notadefinitiva = (parcial*0.7)+(trabajo*0.15)+(certificacion*0.1)+(autocoe*0.05);
                        JOptionPane.showMessageDialog(null, nombre + ", su nota es " + notadefinitiva);
                    }else{
                        JOptionPane.showMessageDialog(null, mensaje);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, mensaje);
                }
            }else{
                JOptionPane.showMessageDialog(null, mensaje);
            }
        }else{
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
}
