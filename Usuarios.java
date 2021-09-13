package ModeloBO;

import conexion.UsuarioDao;
import modeloVo.UsuarioVo;

@RestController
public class Usuarios {
	/*Registrar Usuarios*/
	@RequestMapping("/registrarUsuario")
	public void registrarPersona(UsuarioVo Usuario)
	{
		UsuarioDao Dao=new UsuarioDao();
		Dao.registrarPersona(Usuario);	
	}
	@RequestMapping("/ActualizarUsuario")
	public void actualizarPersona(UsuarioVo Usuario)
	{
		UsuarioDao Dao=new UsuarioDao();
		Dao.actualizarPersona(Usuario);	
	}
	@RequestMapping("eliminarUsuario")
	public void eliminarPersona(UsuarioVo Usuario)
	{
		UsuarioDao Dao= new UsuarioDao();
		Dao.eliminarPersona(Usuario);
	}
	@RequestMapping("/consultarUsuario")
	public List<UsuarioVo>consultarPersonas()
	{
		UsuarioDao Dao= new UsuarioDao();
		return Dao.consultarPersonas();
	}
	@RequesMapping("/login")
	public UsuarioVo login() 
	{
		UsuarioDao Dao = new UsuarioDao();
		return Dao.login();
		
	}
}
