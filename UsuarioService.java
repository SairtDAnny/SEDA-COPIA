
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Service;

import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.UsuarioEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    
     //crear los metodos a realizar
    
    //listar
    public List<UsuarioEntity>listarTodos(){
        return usuarioRepository.findAll();
    }
    //insertar  
    public UsuarioEntity insertarUsuario(UsuarioEntity emp){
        return usuarioRepository.save(emp);
    }
    //actualizar
    public UsuarioEntity actualizarUsuario(UsuarioEntity emp){
        return usuarioRepository.save(emp);
    }
    //insertar eliminar
    public void eliminarUsuario(UsuarioEntity emp){
        usuarioRepository.delete(emp);
    }
    //buscar dato
    public Optional<UsuarioEntity> findById(String emp){
        return usuarioRepository.findById(emp);
    }
    //listar por procedimeinto almacenado
   /* @Autowired
    public JdbcTemplate listArea;
    final String Pro="select * from listar_area()";
    public List<Area>listarArea_Pro(){
        return(List<Area>)listArea.query(Pro, new BeanPropertyRowMapper<Area>(Area.class));
    }*/
    
}