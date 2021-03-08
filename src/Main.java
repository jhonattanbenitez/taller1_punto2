import javax.swing.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Escritorio desk = crearEscritorio();
        System.out.println(desk.toString());
        double anchoE, largoE;
        anchoE = Double.parseDouble(JOptionPane.showInputDialog("Digite el ancho del espacio rectangular disponible" +
                "para el escritorio en cms: "));
        largoE = Double.parseDouble(JOptionPane.showInputDialog("Digite el largo del espacio rectangular disponible" +
                "para el escritorio en cms: "));
        System.out.println("Ancho del espacio disponible = " + anchoE + " cms.");
        System.out.println("Largo del espacio disponible = " + largoE + " cms.");
        if(desk.cabeEnEspacio(anchoE, largoE)){
            System.out.println("El escritorio cabe en el espacio asignado");
        }else{
            System.out.println("el escritorio no cabe en el espacio asignado");
        }

    }
    private static BaseRectangular crearBaseRectangular(){
        double ancho, largo;
        String material;
        ancho = Double.parseDouble(JOptionPane.showInputDialog("Digite el ancho (cm) de la base: "));
        largo = Double.parseDouble(JOptionPane.showInputDialog("Digite el largo (cm) de la base: "));
        material = JOptionPane.showInputDialog("Digite el el material de la base rectangular: ");

        return  new BaseRectangular(ancho, largo, material);
    } // static BaseRectangular crearBaseRectangular()

    private static Escritorio crearEscritorio(){
        BaseRectangular base;
        int numeroDeCajones;
        base = crearBaseRectangular();
        numeroDeCajones = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos cajones tiene el escritorio?"));
        return new Escritorio(base, numeroDeCajones);

    }
}
