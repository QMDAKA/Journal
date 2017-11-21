package bk.repository;

import bk.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by quangminh on 16/11/2017.
 */
@RepositoryRestResource
public interface AuthorRepository extends JpaRepository<Author,String>{
    Author findById(String id);
}
