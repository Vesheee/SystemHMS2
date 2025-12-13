package br.com.medsystech.hms.repository;

import br.com.medsystech.hms.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
