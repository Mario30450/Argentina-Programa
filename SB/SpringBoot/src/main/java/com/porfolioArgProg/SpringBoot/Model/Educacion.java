
package com.porfolioArgProg.SpringBoot.Model;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Educacion {
    

    
    private long Id_Educacion;
    private String Fecha; 
    private String Institucion; 
    private String Carrera;
    
    
    
    public Educacion() {
    }
    
    public Educacion (long Id_Educacion, String Fecha, String Institucion, String Carrera){
    this.Id_Educacion = Id_Educacion;
    this.Fecha = Fecha;
    this.Institucion = Institucion;
    this.Carrera = Carrera;
   
    }
    }
        
    
