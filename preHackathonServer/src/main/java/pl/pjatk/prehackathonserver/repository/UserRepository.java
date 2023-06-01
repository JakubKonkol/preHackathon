package pl.pjatk.prehackathonserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.prehackathonserver.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
