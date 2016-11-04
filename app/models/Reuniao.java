package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.validation.*;

@Entity
public class Reuniao extends Model {
    
    private static final long serialVersionUID = 1L;
    @Id
    public Long id;
    
    @Constraints.Required
    public String tema; 
    public String local, dataReuniao, encaminhamentos, solicitante, participantes;
   
    
    
    
    public static Model.Finder<Long, Reuniao> find = new Model.Finder<Long, Reuniao>(Long.class, Reuniao.class){};

}
