
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Rest;

import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.UsuarioEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Service.UsuarioService;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {
    @Autowired
    private UsuarioService usuarioService;
    
     //llamar los metodos generados 
    //*********
    //listar
    @GetMapping("/listUsuario")
    @ResponseBody
    public List<UsuarioEntity> listarUsuario(){
        return usuarioService.listarTodos();
    }
    //insertar
    @PostMapping("/insert")
    public ResponseEntity<UsuarioEntity> insertarUsuario(@RequestBody UsuarioEntity usuarioEntity){
        
        UsuarioEntity temp = usuarioService.insertarUsuario(usuarioEntity);
        try {
            return ResponseEntity.created(new URI("/"+temp.getIdusuario())).body(temp);
        } catch (URISyntaxException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    //eliminar
    @DeleteMapping("/delete")
    public void eliminarUsuario(@RequestBody UsuarioEntity emp){
        usuarioService.eliminarUsuario(emp);
    }
    
    //actualizar 
    @PutMapping("/update")
    public UsuarioEntity actualizarUsuario(@RequestBody UsuarioEntity emp){
        return usuarioService.actualizarUsuario(emp);
    }

    //listar por id
    @GetMapping(value="/{emp}")
    public ResponseEntity<Optional<UsuarioEntity>>buscarUsuario(@PathVariable("emp")String usuario){
        return ResponseEntity.ok(usuarioService.findById(usuario));
    }
}
