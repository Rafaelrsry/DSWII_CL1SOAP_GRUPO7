package pe.edu.cibertec.DSWII_CL1SOAP_GRUPO7.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWII_CL1SOAP_GRUPO7.convert.PacienteConvert;
import pe.edu.cibertec.DSWII_CL1SOAP_GRUPO7.repository.PacienteRepository;
import pe.edu.cibertec.ws.objects.*;

import java.util.List;

@Endpoint
public class PacienteEndPoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private PacienteConvert pacienteConvert;



    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPacientesRequest")
    @ResponsePayload
    public GetPacientesResponse getPacientes(@RequestPayload GetPacientesRequest request){
        GetPacientesResponse response = new GetPacientesResponse();

        List<Pacientews> pacientewsList = pacienteConvert
                .convertPacienteToPacienteWs(pacienteRepository.findAll());

        response.getPacientes().addAll(pacientewsList);

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPacienteRequest")
    @ResponsePayload
    public GetPacienteResponse getPacientesXId(@RequestPayload GetPacienteRequest request){
        GetPacienteResponse response = new GetPacienteResponse();

        Pacientews pacientews = pacienteConvert
                .convertPacienteToPacienteWs(pacienteRepository.findById(request.getId()).get());

        response.setPaciente(pacientews);

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postPacienteRequest")
    @ResponsePayload
    public PostPacienteResponse postPaciente(@RequestPayload PostPacienteRequest request){
        PostPacienteResponse response = new PostPacienteResponse();

        Pacientews pacientews = pacienteConvert
                .convertPacienteToPacienteWs(pacienteRepository.save(pacienteConvert.convertPacienteWsToPaciente(request.getPaciente())));

        response.setPaciente(pacientews);

        return response;
    }
}