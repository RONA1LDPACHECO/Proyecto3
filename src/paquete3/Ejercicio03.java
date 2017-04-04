package paquete3;

import javax.swing.JOptionPane;

public class Ejercicio03 
{
    public static void main(String[] args) 
    {
        int estado;
        do
          {  
        estado=Integer.parseInt(JOptionPane.showInputDialog("Menu\n1. Encender\n2. Apagar"));
        switch(estado)
        {
            case 1:
                    JOptionPane.showMessageDialog(null,"Encendiendo..Confirmar");
                    break;
             case 2:
                    JOptionPane.showMessageDialog(null,"Apagando..Confirmar");
                    break;       
        }
        }
        while(estado!=2);
    }
}
