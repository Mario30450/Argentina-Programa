
package com.porfolioArgProg.SpringBoot.Model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter @Setter
@Entity

public class HardySoft_skills {
    @id
@TableColumn
     private long Id_HardySoft_skills;
    private String Fechas; 
    private String Descripcion ; 
    private String Curso;
    
    
    
    public HardySoft_skills (){
    }
    
    public HardySoft_skills (long Id_HardySoft_skills, String Fechas, String Descripcion, String Curso){
    this.Id_HardySoft_skills = Id_HardySoft_skills;
    this.Fechas = Fechas;
    this.Descripcion = Descripcion;
    this.Curso = Curso;
   
    }
    
}
