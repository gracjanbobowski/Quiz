package pl.sdacademy.projektplus.quiz.database.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sdacademy.projektplus.quiz.database.entities.PlayerEntity;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
}
