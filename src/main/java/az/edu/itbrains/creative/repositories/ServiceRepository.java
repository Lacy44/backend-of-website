package az.edu.itbrains.creative.repositories;

import az.edu.itbrains.creative.models.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service,Long> {
}
