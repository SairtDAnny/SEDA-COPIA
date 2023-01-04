
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Service;

import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.PatrimonioEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Repository.PatrimonioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatrimonioService {
    @Autowired
     private PatrimonioRepository patrimonioRepository; 
    
    //llamar a los metodos 
    //listar
    public List<PatrimonioEntity>listarTodos(){
        return patrimonioRepository.findAll();
    }
    //insertar
    public PatrimonioEntity insertarPatrimonio(PatrimonioEntity emp){
        return patrimonioRepository.save(emp);
    }
    //actualizar
    public PatrimonioEntity actualizarPatrimonio(PatrimonioEntity emp){
        return patrimonioRepository.save(emp);
    }
    //insertar eliminar
    public void eliminarPatrimonio(PatrimonioEntity emp){
        patrimonioRepository.delete(emp);
    }
    //buscar dato
    public Optional<PatrimonioEntity> findByIdpatrimonio(String emp){
        return patrimonioRepository.findById(emp);
    }
     //insertar eliminar
    public void eliminarArea(PatrimonioEntity patrimonio){
        patrimonioRepository.delete(patrimonio);
    }
    
    
    
}
