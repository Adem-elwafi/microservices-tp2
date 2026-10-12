package com.iset.DAO;

import com.iset.entities.User;
import com.iset.projections.UserProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(path = "users", excerptProjection = UserProjection.class)
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNameContains(@Param("name") String name);
}