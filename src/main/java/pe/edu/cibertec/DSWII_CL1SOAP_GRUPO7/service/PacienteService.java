package pe.edu.cibertec.DSWII_CL1SOAP_GRUPO7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL1SOAP_GRUPO7.model.Paciente;
import pe.edu.cibertec.DSWII_CL1SOAP_GRUPO7.repository.PacienteRepository;

import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> obtenerPacientes(){
        return pacienteRepository.findAll();
    }

    public Paciente obtenerPacientePorId(Integer id){
        return pacienteRepository.findById(id).orElse(null);
    }

    public Paciente guardarPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }
}
