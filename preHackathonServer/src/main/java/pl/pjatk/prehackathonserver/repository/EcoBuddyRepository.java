package pl.pjatk.prehackathonserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.prehackathonserver.model.EcoBuddy;
//@Repository
public interface EcoBuddyRepository extends JpaRepository<EcoBuddy, Long> {
}
