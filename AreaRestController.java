
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Rest;

import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.Area;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.AreaEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Service.AreaService;
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
@RequestMapping("/area")
@CrossOrigin(origins = "http://localhost:4200")
public class AreaRestController {
     @Autowired
    private AreaService areaService;
    
    //llamar los metodos generados 
    //*********
    //listar
    @GetMapping("/listArea")
    @ResponseBody
    public List<AreaEntity> listarArea(){
        return areaService.listarTodos();
    }
    
    @PostMapping("/insert")
    public ResponseEntity<AreaEntity> insertarArea(@RequestBody AreaEntity area){
        
        AreaEntity temp = areaService.insertarArea(area);
        try {
            return ResponseEntity.created(new URI("/"+temp.getIdArea())).body(temp);
        } catch (URISyntaxException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    //eliminar
    @DeleteMapping(value = "/delete/{idArea}")
    public void eliminarArea(@PathVariable("idArea")AreaEntity area){
        areaService.eliminarArea(area);
    }
    //actualizar 
    @PutMapping("/update")
    public AreaEntity actualizarArea(@RequestBody AreaEntity emp){
        return areaService.actualizarArea(emp);
    }

    //listar por id
    @GetMapping(value="/{emp}")
    public ResponseEntity<Optional<AreaEntity>>buscarArea(@PathVariable("emp")String area){
        return ResponseEntity.ok(areaService.findById(area));
    }
    //listar oficinas
    @GetMapping(value = "/oficinas")
    
    public List<?> listOficina(){
        return areaService.listOficina();
    }
}
