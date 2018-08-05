package org.psmax.cmsbackend.Repository;

import org.psmax.cmsbackend.Entity.UserMaster;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<UserMaster,Long>
{
}
