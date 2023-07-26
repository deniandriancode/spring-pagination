package io.fam.paging;

import org.springframework.data.repository.*;
import org.springframework.stereotype.*;

@Component
public interface DocuRepository extends PagingAndSortingRepository<Docu, Long>, CrudRepository<Docu, Long> {

}
