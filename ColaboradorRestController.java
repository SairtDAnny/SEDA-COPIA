
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Rest;

import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.ColaboradorEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Repository.ColaboradorRepository;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Service.ColaboradorService;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
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
@RequestMapping("/colaborador")
@CrossOrigin(origins = "http://localhost:4200")
public class ColaboradorRestController {
    
    @Autowired
    private ColaboradorService colaboradorService;
    
    //llamagar alos metodos
    
    //listar Colaborador
    @GetMapping("/listColaborador")
    @ResponseBody
    
    public List<ColaboradorEntity> listarColaborador(){
        return colaboradorService.listColaborador();
    }
    
    
    
    
    
    
    //listar registro de entregas de coaborador
     
   /* @GetMapping("/listEntregaColaborador")
    public ResponseEntity<List<ColaboradorEntity>> lista(@PathVariable("idcolaborador")String idcolaborador){
        colaboradorService.listRegEntregaColaborador(idcolaborador);
        try {
            return ResponseEntity.created(new URI("/"+ regEntradaAlm.getIdentradaoficina())).body(regEntradaAlm);
        } catch (URISyntaxException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }*/
    @GetMapping(value="listarColaborador/{emp}")
    
     public ResponseEntity<List<ColaboradorEntity>>buscarRegEntrada(@PathVariable("emp")String dni){
       return ResponseEntity.ok(colaboradorService.listRegEntregaColaborador(dni));
    }
     
    
    
    //insertar REST Colaborador
    @PostMapping("/insert")
    public ResponseEntity<?> insertarColaborador(@RequestBody ColaboradorEntity colaboradorEntity ){
        colaboradorService.insertColaborador(colaboradorEntity);
        try {
            return ResponseEntity.created(new URI("/"+colaboradorEntity.getIdcolaborador())).body(colaboradorEntity);
        } catch (URISyntaxException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    //insertar funcion  
    @PutMapping("/update")
    public ResponseEntity<?> actualizarColaborador(@RequestBody ColaboradorEntity colaboradorEntity ){
        colaboradorService.actualizarColaborador(colaboradorEntity);
        try {
            return ResponseEntity.created(new URI("/"+colaboradorEntity.getIdcolaborador())).body(colaboradorEntity);
        } catch (URISyntaxException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
   
    
    @GetMapping(value="/{emp}")
    public ResponseEntity<Optional<ColaboradorEntity>>buscar(@PathVariable("emp")String area){//RETORNA UNA TABALA COMO REOTRNAR UN JSON
        return ResponseEntity.ok(colaboradorService.findByIdcolaborador(area));
    } 
    
    
    /*@Autowired
    private ColaboradorRepository colaboradorRepository;
    @GetMapping(value="/{emp}")
    public String listCola(Model model){
        model.addAttribute("area", colaboradorRepository.findAll());
        return "listCola";
    }*/
    
    
    
    
    
    
//return new ResponseEntity("s",HttpStatus.OK);
    //actualizar Colaborador
    /*@PutMapping("/update")
    public ColaboradorEntity actualizarColaborador(@RequestBody ColaboradorEntity emp){
        return colaboradorService.actualizarColaborador(emp);
    }

    //listar por id Colaborador
    @GetMapping(value="/    {emp}")
    public ResponseEntity<Optional<ColaboradorEntity>>buscarColaborador(@PathVariable("emp")String colaborador){
        return ResponseEntity.ok(colaboradorService.findByIdcolaborador(colaborador));
    }*/
}
