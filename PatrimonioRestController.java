
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Rest;

import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.PatrimonioEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Service.PatrimonioService;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/patrimonio")
@CrossOrigin(origins = "http://localhost:4200")
public class PatrimonioRestController {
    @Autowired
    private PatrimonioService patrimonioService;
    
    //llamagar alos metodos
    
    //listar Colaborador
    @GetMapping("/listPatrimonio")
    @ResponseBody
    
    public List<PatrimonioEntity> listarColaborador(){
        return patrimonioService.listarTodos();
    }
    //insertar REST Colaborador
    @PostMapping("/insert")
    public ResponseEntity<PatrimonioEntity> insertarArea(@RequestBody PatrimonioEntity area){
        PatrimonioEntity temp = patrimonioService.insertarPatrimonio(area);
        try {
            return ResponseEntity.created(new URI("/"+temp.getIdpatrimonio())).body(temp);
        } catch (URISyntaxException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    //actualizar Colaborador
    @PutMapping("/update")
    public PatrimonioEntity actualizarColaborador(@RequestBody PatrimonioEntity emp){
        return patrimonioService.actualizarPatrimonio(emp);
    }
   
    //listar por id Colaborador
    @GetMapping(value="/{emp}")
    public ResponseEntity<Optional<PatrimonioEntity>>buscarPatrimonio(@PathVariable("emp")String idpatrimonio){
        return ResponseEntity.ok(patrimonioService.findByIdpatrimonio(idpatrimonio));
    }
    
     //eliminar
    @DeleteMapping(value = "/delete/{idpatrimonio}")
    public void eliminarPatrimonio(@PathVariable("idpatrimonio")PatrimonioEntity patrimonio){
        patrimonioService.eliminarArea(patrimonio);
    }
    
}
