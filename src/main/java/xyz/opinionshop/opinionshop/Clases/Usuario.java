package Clases;

import java.util.Date;

public class Usuario {
    private int Id;
    private String Username;
    private String Password;
    private String Email;
    private String Domicilio;
    private String NombreCompleto;
    private Date Nacimiento;
    private int Edad;
    private MetodoDePago MP;
    
    public Usuario(String Username_,String Password_,String Email_, String Domicilio_, String Nombre_Completo, Date Nacimiento_) {
        Username = Username_;
        Password = Password_;
        Email = Email_;
        Domicilio = Domicilio_;
        NombreCompleto = Nombre_Completo;
        Nacimiento = Nacimiento_;
    }
    
    
  
}
