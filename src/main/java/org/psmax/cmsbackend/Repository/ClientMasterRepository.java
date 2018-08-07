package org.psmax.cmsbackend.Repository;

import org.psmax.cmsbackend.Entity.ClientMaster;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientMasterRepository extends CrudRepository<ClientMaster,Long>
{
}
