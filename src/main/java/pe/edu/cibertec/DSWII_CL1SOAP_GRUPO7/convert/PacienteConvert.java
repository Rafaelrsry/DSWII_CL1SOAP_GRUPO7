package pe.edu.cibertec.DSWII_CL1SOAP_GRUPO7.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWII_CL1SOAP_GRUPO7.model.Paciente;
import pe.edu.cibertec.ws.objects.Pacientews;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Component
public class PacienteConvert {

    public Paciente convertPacienteWsToPaciente(Pacientews pacientews) {
        Paciente paciente = new Paciente();
        paciente.setIdpaciente(pacientews.getIdpaciente());
        paciente.setNompaciente(pacientews.getNompaciente());
        paciente.setApepaciente(pacientews.getApepaciente());
        paciente.setDocpaciente(pacientews.getDocpaciente());

        // Convierte XMLGregorianCalendar a java.util.Date
        Date fechaNacimiento = convertXMLGregorianCalendarToDate(pacientews.getFechanacpaciente());
        paciente.setFechanacpaciente(fechaNacimiento);

        paciente.setEmailpaciente(pacientews.getEmailpaciente());
        return paciente;
    }

    public Pacientews convertPacienteToPacienteWs(Paciente paciente) {
        Pacientews pacientews = new Pacientews();
        pacientews.setIdpaciente(paciente.getIdpaciente());
        pacientews.setNompaciente(paciente.getNompaciente());
        pacientews.setApepaciente(paciente.getApepaciente());
        pacientews.setDocpaciente(paciente.getDocpaciente());

        // Convierte java.util.Date a XMLGregorianCalendar
        XMLGregorianCalendar fechaNacimiento = convertDateToXMLGregorianCalendar(paciente.getFechanacpaciente());
        pacientews.setFechanacpaciente(fechaNacimiento);

        pacientews.setEmailpaciente(paciente.getEmailpaciente());
        return pacientews;
    }

    private Date convertXMLGregorianCalendarToDate(XMLGregorianCalendar xmlGregorianCalendar) {
        if (xmlGregorianCalendar == null) {
            return null;
        }
        return xmlGregorianCalendar.toGregorianCalendar().getTime();
    }

    private XMLGregorianCalendar convertDateToXMLGregorianCalendar(Date date) {
        if (date == null) {
            return null;
        }

        try {
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(date);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
            return null;
        }
    }


    public List<Paciente> convertPacienteWsToPaciente(List<Pacientews> pacientewsList) {
        List<Paciente> pacienteList = new ArrayList<>();
        for (Pacientews pacientews : pacientewsList) {
            pacienteList.add(convertPacienteWsToPaciente(pacientews));
        }
        return pacienteList;
    }

    public List<Pacientews> convertPacienteToPacienteWs(List<Paciente> pacienteList) {
        List<Pacientews> pacientewsList = new ArrayList<>();
        for (Paciente paciente : pacienteList) {
            pacientewsList.add(convertPacienteToPacienteWs(paciente));
        }
        return pacientewsList;
    }

}