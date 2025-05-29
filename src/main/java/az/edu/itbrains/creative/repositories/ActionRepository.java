package az.edu.itbrains.creative.repositories;

import az.edu.itbrains.creative.models.Action;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionRepository extends JpaRepository<Action,Long> {
}
