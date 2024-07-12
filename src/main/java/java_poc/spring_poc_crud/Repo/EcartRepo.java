package java_poc.spring_poc_crud.Repo;

import java_poc.spring_poc_crud.entity.UserEcart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcartRepo extends JpaRepository<UserEcart,Long >
{
}
