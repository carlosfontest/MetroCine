package controller;

import javax.swing.JOptionPane;
import view.Inicio;

public class Controlador {
    
    public void iniciarSesion(Inicio inicio){
        if(inicio.jTextFieldUsuario.getText().equals("admin") && inicio.jPasswordField.getText().equals("admin")){
            JOptionPane.showMessageDialog(inicio, "   ¡Inicio de sesión exitoso!");
            
            
            // ABRIR OTRO JFRAME
            
            
            
        }else{
            JOptionPane.showMessageDialog(inicio, "Usuario o contraseña inválidos");
            inicio.jTextFieldUsuario.setText("Ingrese su usuario");
            inicio.jPasswordField.setText("jPasswordField1");
        }
    }


    
    
}
