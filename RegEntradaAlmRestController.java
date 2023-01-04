
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Rest;

import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.ColaboradorEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.RegEntradaAlm;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.RegEntradaAlmEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Service.RegEntradaAlmService;
import com.fasterxml.jackson.databind.util.JSONPObject;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entrada")
@CrossOrigin(origins = "http://localhost:4200")
public class RegEntradaAlmRestController {
     @Autowired
    private RegEntradaAlmService regEntradaAlmService;
    
    //llamagar alos metodos
    
    //listar 
    @GetMapping("/listEntrada")
    @ResponseBody
    public List<RegEntradaAlmEntity> listRegEntrada(){
        return regEntradaAlmService.listRegEntrada();
    }
    /*public ResponseEntity<List<ColaboradorEntity>> listarColaborador(){
        List<ColaboradorEntity> list= regEntradaAlmService.listRegEntrada();
        return new ResponseEntity(list, HttpStatus.OK);
    }*/
    
    //listar por id 
    @GetMapping(value="/{emp}")
    public ResponseEntity<Optional<RegEntradaAlmEntity>>buscarRegEntrada(@PathVariable("emp")String entrada){
        return ResponseEntity.ok(regEntradaAlmService.findByIdentradaoficina(entrada));
    }
    
    //actualizar 
    @PutMapping("/update")
    public ResponseEntity<?> actualizarRegEntrada(@RequestBody RegEntradaAlm regEntradaAlm){
        regEntradaAlmService.actualizarEntrada(regEntradaAlm);
        try {
            return ResponseEntity.created(new URI("/"+ regEntradaAlm.getIdentradaoficina())).body(regEntradaAlm);
        } catch (URISyntaxException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    //insertar funcion  
    @PostMapping("/insert")
    public ResponseEntity<?> insertarEntrada(@RequestBody RegEntradaAlm regEntradaAlm){
        regEntradaAlmService.insert(regEntradaAlm);       
        try {
            return ResponseEntity.created(new URI("/"+ regEntradaAlm.getIdentradaoficina())).body(regEntradaAlm);
        } catch (URISyntaxException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }//return new ResponseEntity("s",HttpStatus.OK);
    
    
    
    
    
    
    //actualizar Colaborador
    /*@PutMapping("/update")
    public PatrimonioEntity actualizarColaborador(@RequestBody PatrimonioEntity emp){
        return patrimonioService.actualizarPatrimonio(emp);
    }*/ 
   
    //listar por id Colaborador
    /*@GetMapping(value="/{emp}")
    public ResponseEntity<Optional<PatrimonioEntity>>buscarPatrimonio(@PathVariable("emp")String idpatrimonio){
        return ResponseEntity.ok(patrimonioService.findByIdpatrimonio(idpatrimonio));
    }*/
}
