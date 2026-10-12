package com.iset.projections;

import com.iset.entities.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullUser", types = User.class)
public interface UserProjection {
    Long getId();
    String getName();
    String getEmail();
    RoleInfo getRole();

    interface RoleInfo {
        String getName();
    }
}