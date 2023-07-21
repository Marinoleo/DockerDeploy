package portfolio.docker_deploy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.docker_deploy.entities.Card;

@Repository
public interface CardRepository extends JpaRepository<Card,Long> {
}
