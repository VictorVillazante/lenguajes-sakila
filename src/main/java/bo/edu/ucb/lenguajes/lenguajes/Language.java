package bo.edu.ucb.lenguajes.lenguajes;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

@Entity(name = "language")  
//Problema al definir el constructor si esta con el RestController
public class Language implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer language_id;
    private String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date last_update;
    //sin el constructor por defecto da error
    public Language(){
    }
    //autocompletar ctrl+i
    public Language(Integer language_id,String name,Date last_update){
        this.language_id=language_id;
        this.name=name;
        this.last_update=last_update;

    }
    public Integer getLanguage_id() {
        return language_id;
    }
    public Date getLast_update() {
        return last_update;
    }
    public String getName() {
        return name;
    }
    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }
    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
    public void setName(String name) {
        this.name = name;
    }
}
