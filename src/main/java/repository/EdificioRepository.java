package repository;


import entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EdificioRepository extends JpaRepository<Edificio, Long> {
}