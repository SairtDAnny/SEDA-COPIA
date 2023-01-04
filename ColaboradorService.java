
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Service;

import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.AreaEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.ColaboradorEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Repository.AreaRepository;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Repository.ColaboradorRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColaboradorService {
     @Autowired
    private ColaboradorRepository colaboradorRepository;
     @Autowired
    private AreaRepository areaRepository;
    //llamar a los metodos 
    
    //listar Colaborador findAll es por el repo
    public List<ColaboradorEntity> listColaborador(){
        return colaboradorRepository.findAllListarColaborador();
    }
    
     //buscar dato
    public Optional<ColaboradorEntity> findByIdcolaborador(String emp){
        
        
        return colaboradorRepository.findById(emp);
        
        //return colaboradorRepository.listColaborador(emp);
    }
    

    //insertar or metodo
    
    public void insertColaborador (ColaboradorEntity colaboradorEntity){
    colaboradorRepository.insertarColaborador(  colaboradorEntity.getIdcolaborador(),
                                                colaboradorEntity.getIdarea(),
                                                colaboradorEntity.getNombrecolaborador(),
                                                colaboradorEntity.getCargo());
        //return (RegEntradaAlm) regEntradaAlmRepository.findAll();
    }
    
    public void actualizarColaborador (ColaboradorEntity colaboradorEntity){
    colaboradorRepository.actualizarColaborador(colaboradorEntity.getIdcolaborador(),
                                               colaboradorEntity.getIdarea(),
                                               colaboradorEntity.getNombrecolaborador(),
                                               colaboradorEntity.getCargo());
        //return (RegEntradaAlm) regEntradaAlmRepository.findAll();
    }
    
    //listar registro de entregas de coaborador
    
    public List<ColaboradorEntity> listRegEntregaColaborador(String emp){
        return (List<ColaboradorEntity>) colaboradorRepository.listRegEntregaColaborador(emp);
    }
    
    
    //insertar RequestParam
    @Transactional
    public ColaboradorEntity insertarColaborador( ColaboradorEntity colaboradorEntity){
        AreaEntity area = areaRepository.findOneByDescripcion(colaboradorEntity.getIdarea());
        
        ColaboradorEntity colaborador = new ColaboradorEntity();
        colaborador.setIdarea(area.getIdArea());
        colaborador.setCargo(colaboradorEntity.getCargo());
        colaborador.setIdcolaborador(colaboradorEntity.getIdcolaborador());
        colaborador.setNombrecolaborador(colaboradorEntity.getNombrecolaborador());
        
        colaboradorRepository.saveAndFlush(colaborador);
        
        return colaborador;
    }
    
    //actualizar
    //insertar RequestParam
   /* @Transactional
    public ColaboradorEntity actualizarColaborador( ColaboradorEntity colaboradorEntity){
        AreaEntity area = areaRepository.findOneByDescripcion(colaboradorEntity.getIdarea());
        
        ColaboradorEntity colaborador = new ColaboradorEntity();
        colaborador.setIdarea(area.getIdArea());
        colaborador.setCargo(colaboradorEntity.getCargo());
        colaborador.setIdcolaborador(colaboradorEntity.getIdcolaborador());
        colaborador.setNombrecolaborador(colaboradorEntity.getNombrecolaborador());
        
        colaboradorRepository.saveAndFlush(colaborador);
        //colaboradorRepository.save()
    
        return colaborador;
    }*/
    
   
    
}
