package ModeloBO;

import conexion.ClienteDao;
import modeloVo.ClienteVo;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Clientes {
	/*Registrar personas*/
	@RequestMapping("/registrarPersona")
	public void registrarPersona(ClienteVo persona)
	{
		ClienteDao Dao= new ClienteDao();
		Dao.registrarPersona(persona);
		
	}
	@RequestMapping("/actualizarPersona")
	public void actualizarPersona(ClienteVo persona)
	{
		ClienteDao Dao=new ClienteDao();
		Dao.actualizarPersona(null, persona);
		
	}
	@RequestMapping("/eliminarPersona")
	public void eliminarPersona(ClienteVo persona)
	{
		ClienteDao Dao=new ClienteDao();
		Dao.eliminarPersona(null, persona);
		
	}
	@RequestMapping("/consultarPersonas")
	public List<ClienteVo> consultarPersonas(){
		ClienteDao Dao= new ClienteDao();
		return Dao.consultarPersonas();
		
	}
}
