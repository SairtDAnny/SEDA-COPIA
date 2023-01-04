
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Service;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.Area;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.AreaEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Repository.AreaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class AreaService {
    @Autowired
    private AreaRepository areaRepository;
    
     //crear los metodos a realizar
    
    //listar
    public List<AreaEntity>listarTodos(){
        return areaRepository.findAll();
    }
    //insertar  
    public AreaEntity insertarArea(AreaEntity emp){
        return areaRepository.save(emp);
    }
    //actualizar
    public AreaEntity actualizarArea(AreaEntity emp){
        return areaRepository.save(emp);
    }
    //insertar eliminar
    public void eliminarArea(AreaEntity area){
        areaRepository.delete(area);
    }
    //buscar dato
    public Optional<AreaEntity> findById(String emp){
        return areaRepository.findById(emp);
    }
    
    //listar oficinas
    public List<?> listOficina(){
        return areaRepository.listOficina();
    }
    //listar por procedimeinto almacenado
   /* @Autowired
    public JdbcTemplate listArea;
    final String Pro="select * from listar_area()";
    public List<Area>listarArea_Pro(){
        return(List<Area>)listArea.query(Pro, new BeanPropertyRowMapper<Area>(Area.class));
    }*/
    
}
