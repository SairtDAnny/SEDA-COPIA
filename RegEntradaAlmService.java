
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Service;

import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.PatrimonioEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.RegEntradaAlm;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.RegEntradaAlmEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.UsuarioEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.EppSedacuscoApplication;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Repository.PatrimonioRepository;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Repository.RegEntradaAlmRepository;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegEntradaAlmService {
    @Autowired
    private RegEntradaAlmRepository regEntradaAlmRepository; 
    @Autowired
    private PatrimonioRepository patrimonioRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    //llamar a los metodos 
    //listar
    /*public List<RegEntradaAlmEntity>listarTodos(){
        return regEntradaAlmRepository.findAll();
    }*/
    //insertar
    /*public RegEntradaAlmEntity insertarPatrimonio(RegEntradaAlmEntity emp){
        return regEntradaAlmRepository.save(emp);
    }*/
    //actualizar
   /* public RegEntradaAlmEntity actualizarPatrimonio(RegEntradaAlmEntity emp){
        return regEntradaAlmRepository.save(emp);
    }*/
    //insertar eliminar
   /* public void eliminarPatrimonio(RegEntradaAlmEntity emp){
        regEntradaAlmRepository.delete(emp);
    }*/
    //buscar dato
    /*public Optional<RegEntradaAlmEntity> findByIdentradaoficina(Integer emp){
        return regEntradaAlmRepository.findById(emp);
    }*/
    
    
    //listar funcion 
    public List<RegEntradaAlmEntity> listRegEntrada(){
        return regEntradaAlmRepository.findAllListarEntrada();
    }
    public List<RegEntradaAlmEntity> lis(){
        return regEntradaAlmRepository.findAll();
    }
    //buscar dato
    public Optional<RegEntradaAlmEntity> findByIdentradaoficina(String emp){
        return regEntradaAlmRepository.findById(emp);
    }
    //actualizar  
    
    public void actualizarEntrada (RegEntradaAlm regEntradaAlm){
    regEntradaAlmRepository.actulizarentrada(   regEntradaAlm.getIdentradaoficina(),
                                                regEntradaAlm.getUsuario(), 
                                                regEntradaAlm.getPatrimonio(), 
                                                regEntradaAlm.getTalla(), 
                                                regEntradaAlm.getCantidad(), 
                                                regEntradaAlm.getEstado());
        
        //return (RegEntradaAlm) regEntradaAlmRepository.findAll();
    }
    
    //insertar parametros
    public void insert (RegEntradaAlm regEntradaAlm){
    regEntradaAlmRepository.insert( regEntradaAlm.getIdentradaoficina(),
                                    regEntradaAlm.getUsuario(), 
                                    regEntradaAlm.getPatrimonio(), 
                                    regEntradaAlm.getTalla(), 
                                    regEntradaAlm.getCantidad(), 
                                    regEntradaAlm.getEstado());
        
       // return (RegEntradaAlm) regEntradaAlmRepository.findAll();
    }
    
    //insertar RequestParam
    /*@Transactional
    public RegEntradaAlmEntity insertarEntrada( RegEntradaAlmEntity regEntradaAlmEntity){
        //nombre patrimonio y talla 
        PatrimonioEntity patrimonio = patrimonioRepository.findOneByDescripcionpatrimonio(regEntradaAlmEntity.getIdpatrimonio());
        PatrimonioEntity patrimoniotalla = patrimonioRepository.findOneByTalla(regEntradaAlmEntity.getIdpatrimonio());
                
        UsuarioEntity usuario = usuarioRepository.findOneByNombreusuario(regEntradaAlmEntity.getIdusuario());
        RegEntradaAlmEntity ent = new RegEntradaAlmEntity();
        
        RegEntradaAlmEntity entrada = new RegEntradaAlmEntity();
        entrada.setIdentradaoficina(regEntradaAlmEntity.getIdentradaoficina());
        entrada.setIdusuario(usuario.getIdusuario());
            entrada.setIdpatrimonio(patrimonio.getIdpatrimonio(), patrimoniotalla.getIdpatrimonio());
        entrada.setCantidad(regEntradaAlmEntity.getCantidad());
        entrada.setFechaentrada(ent.getFechaentrada());
        entrada.setEstadoentrada(regEntradaAlmEntity.getEstadoentrada());
                       
        regEntradaAlmRepository.saveAndFlush(entrada);
        
        return entrada;
    }*/
}
