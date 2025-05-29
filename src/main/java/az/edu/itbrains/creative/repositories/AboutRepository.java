package az.edu.itbrains.creative.repositories;

import az.edu.itbrains.creative.models.About;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutRepository extends JpaRepository<About,Long> {
}
