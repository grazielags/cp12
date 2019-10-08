package br.com.voffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
import br.com.voffice.model.UsuarioModel;
import br.com.voffice.model.ResponseModel;
import br.com.voffice.repository.UsuarioRepository;
 
@RestController
@RequestMapping("/service")
public class UsuarioService {
 
	@Autowired
	private UsuarioRepository usuarioRepository; 
 
	/**
	 * SALVAR UM NOVO REGISTRO
	 * @param usuario
	 * @return
	 */
	@RequestMapping(value="/usuario", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel salvar(@RequestBody UsuarioModel pessoa){
 
 
		try {
 
			this.usuarioRepository.save(pessoa);
 
			return new ResponseModel(1,"Registro salvo com sucesso!");
 
		}catch(Exception e) {
 
			return new ResponseModel(0,e.getMessage());			
		}
	}
 
	/**
	 * ATUALIZAR O REGISTRO DE UMA PESSOA
	 * @param pessoa
	 * @return
	 */
	@RequestMapping(value="/usuario", method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel atualizar(@RequestBody UsuarioModel usuario){
 
		try {
 
			this.usuarioRepository.save(usuario);		
 
			return new ResponseModel(1,"Registro atualizado com sucesso!");
 
		}catch(Exception e) {
 
			return new ResponseModel(0,e.getMessage());
		}
	}
 
	/**
	 * CONSULTAR TODAS AS PESSOAS
	 * @return
	 */
	@RequestMapping(value="/pessoa", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<UsuarioModel> consultar(){
 
		return this.usuarioRepository.findAll();
	}
 
	/**
	 * BUSCAR UMA USUARIO PELO CÓDIGO
	 * @param codigo
	 * @return
	 */
	@RequestMapping(value="/usuario/{id}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody UsuarioModel buscar(@PathVariable("id") Integer id){
 
		return this.usuarioRepository.findById(id);
	}
 
	/***
	 * EXCLUIR UM REGISTRO PELO CÓDIGO
	 * @param codigo
	 * @return
	 */
	@RequestMapping(value="/usuario/{id}", method = RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel excluir(@PathVariable("id") Integer id){
 
		UsuarioModel usuarioModel = usuarioRepository.findById(id);
 
		try {
 
			usuarioRepository.delete(usuarioModel);
 
			return new ResponseModel(1, "Registro excluido com sucesso!");
 
		}catch(Exception e) {
			return new ResponseModel(0, e.getMessage());
		}
	}
 
}