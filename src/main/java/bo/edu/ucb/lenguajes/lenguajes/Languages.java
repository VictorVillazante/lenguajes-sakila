package bo.edu.ucb.lenguajes.lenguajes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Languages {
    List<Language> languageList = new ArrayList<>();
    @GetMapping(path="/language_2",produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Language>listarTodo(){
        return languageList;
    }
    @PostMapping(path="/language_2",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
    public Language listarTodo(@RequestBody Language l){
        languageList.add(l);
        return l;
    }
}
