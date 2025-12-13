package br.com.medsystech.hms.service;

import br.com.medsystech.hms.model.Paciente;
import br.com.medsystech.hms.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public List<Paciente> listarTodos() {
        return repository.findAll();
    }

    public void salvar(Paciente paciente) {
        repository.save(paciente);
    }
}
