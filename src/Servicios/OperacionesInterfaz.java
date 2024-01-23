package Servicios;

import java.util.List;

import Dtos.EsclavoDto;
import Dtos.PacientesDtos;

public interface OperacionesInterfaz {
	
	public void darAltaCliente(List<PacientesDtos> listaPaciente,List<EsclavoDto> listaEsclavo);

	public void darAltaEsclavo(List<EsclavoDto> listaEsclavo);

}
