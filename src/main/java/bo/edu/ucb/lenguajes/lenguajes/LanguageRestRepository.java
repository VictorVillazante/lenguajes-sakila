package bo.edu.ucb.lenguajes.lenguajes;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
//Problemas si tiene el mismo nombre que el entity
@RepositoryRestResource(collectionResourceRel = "sakila",path = "lang")
public interface LanguageRestRepository extends PagingAndSortingRepository<Language,Integer>{
   List<Language>findByName(@Param("name") String name);
}

