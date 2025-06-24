package vn.scrip.buoi34.repository;
import vn.scrip.buoi34.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface RoleRepository extends JpaRepository<Role, Integer>
{
    Optional<Role> findByName(String name);
}
