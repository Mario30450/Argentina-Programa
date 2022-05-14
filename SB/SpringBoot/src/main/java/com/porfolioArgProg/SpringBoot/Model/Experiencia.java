

package com.porfolioArgProg.SpringBoot.Model;



import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
@id
@TableColumn
public class Experiencia {
    
    
    
     private long Id_Experiencia;
    private String Fechas; 
    private String Descripcion ; 
    private String Puesto;
    
    
    
    public Experiencia () {
    }
    
    public Experiencia (long Id_Experiencia, String Fechas, String Descripcion, String Puesto){
    this.Id_Experiencia = Id_Experiencia;
    this.Fechas = Fechas;
    this.Descripcion = Descripcion;
    this.Puesto = Puesto;
   
    }
    
}
