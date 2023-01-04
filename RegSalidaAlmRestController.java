
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Rest;

import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.RegEntradaAlm;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.RegEntradaAlmEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.RegSalidaAlm;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.RegSalidaAlmEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Service.RegSalidaAlmService;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salida")
@CrossOrigin(origins = "http://localhost:4200")
public class RegSalidaAlmRestController {
    @Autowired
    private RegSalidaAlmService regSalidaAlmService;
    
    //listar 
    @GetMapping("/listSalida")
    @ResponseBody
    public List<RegSalidaAlmEntity> listRegEntrada(){
        return regSalidaAlmService.listRegEntrada();
    }
    
    //listar por id 
    @GetMapping(value="/{emp}")
    public ResponseEntity<Optional<RegSalidaAlmEntity>>buscarRegSalida(@PathVariable("emp")String salida){
        return ResponseEntity.ok(regSalidaAlmService.findByIdSalidaoficina(salida));
    }
    
    //actualizar 
    @PutMapping("/update")
    public ResponseEntity<?> actualizarSalida(@RequestBody RegSalidaAlm regSalidaAlm){
        regSalidaAlmService.actualizar(regSalidaAlm);
        try {
            return ResponseEntity.created(new URI("/"+ regSalidaAlm.getIdsalidaoficina())).body(regSalidaAlm);
        } catch (URISyntaxException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    //insertar funcion  
    @PostMapping("/insert")
    public ResponseEntity<?> insertarSalida(@RequestBody RegSalidaAlm regSalidaAlm){
        regSalidaAlmService.insert(regSalidaAlm);       
        try {
            return ResponseEntity.created(new URI("/"+ regSalidaAlm.getIdsalidaoficina())).body(regSalidaAlm);
        } catch (URISyntaxException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }//return new ResponseEntity("s",HttpStatus.OK);
    
    //insertar por procedimiento alamcenado 
    @PutMapping("/updateRenovacion")
   public ResponseEntity<?> actualizarRenovacion(@RequestBody RegSalidaAlm regSalidaAlm){
        regSalidaAlmService.actualizarRenovacion(regSalidaAlm);
        try {
            return ResponseEntity.created(new URI("/"+ regSalidaAlm.getIdsalidaoficina())).body(regSalidaAlm);
        } catch (URISyntaxException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
}
