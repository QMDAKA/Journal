package bk.repository;

import bk.model.Paper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by quangminh on 16/11/2017.
 */
@RepositoryRestResource
public interface PaperRepository  extends JpaRepository<Paper,Long>{
}
