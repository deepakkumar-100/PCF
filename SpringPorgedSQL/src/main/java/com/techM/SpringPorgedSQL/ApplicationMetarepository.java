package com.techM.SpringPorgedSQL;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ApplicationMetarepository extends JpaRepository<ApplicationMeta, String>{

	ApplicationMeta findByName(String name);

}
