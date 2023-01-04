package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Service;

import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.RegEntradaAlm;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.RegEntradaAlmEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.RegSalidaAlm;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.RegSalidaAlmEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Repository.RegSalidaAlmRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegSalidaAlmService {
    @Autowired
    private RegSalidaAlmRepository regSalidaAlmRepository;
    
    //llamar a los metodos 
    
    //listar funcion 
    public List<RegSalidaAlmEntity> listRegEntrada(){
        return regSalidaAlmRepository.findAllListarSalida();
    }
    //buscar dato
    public Optional<RegSalidaAlmEntity> findByIdSalidaoficina(String emp){
        return regSalidaAlmRepository.findById(emp);
    }
    
    
    //actualizar  
    public void actualizar (RegSalidaAlm regSalidaAlm){
        regSalidaAlmRepository.actulizar(   regSalidaAlm.getIdsalidaoficina(),
                                            regSalidaAlm.getUsuario(),
                                            regSalidaAlm.getColaborador(),
                                            regSalidaAlm.getPatrimonio(),
                                            regSalidaAlm.getTalla(),
                                            regSalidaAlm.getCantidad(),
                                            regSalidaAlm.getEstadosalida());
    
    }
    
    // insertar
    public void insert (RegSalidaAlm regSalidaAlm){
        regSalidaAlmRepository.insert(  regSalidaAlm.getIdsalidaoficina(),
                                        regSalidaAlm.getUsuario(),
                                        regSalidaAlm.getColaborador(),
                                        regSalidaAlm.getPatrimonio(),
                                        regSalidaAlm.getTalla(),
                                        regSalidaAlm.getCantidad(),
                                        regSalidaAlm.getEstadosalida());
    // return (RegEntradaAlm) regEntradaAlmRepository.findAll();
    }
    
    //insertar por procedimiento alamcenado    public void insert (RegSalidaAlm regSalidaAlm){
    /*public void actualizarRenovacion (RegSalidaAlm regSalidaAlm){
        regSalidaAlmRepository.actualizarRenovacion(regSalidaAlm.getIdsalidaoficina(),
                                                    regSalidaAlm.getUsuario(),
                                                    regSalidaAlm.getColaborador(),
                                                    regSalidaAlm.getPatrimonio(),
                                                    regSalidaAlm.getTalla(),
                                                    regSalidaAlm.getCantidad(),
                                                    regSalidaAlm.getEstadosalida());
    }*/
    
    public void actualizarRenovacion (RegSalidaAlm regSalidaAlm){
        regSalidaAlmRepository.actualizarRenovacion(    regSalidaAlm.getIdsalidaoficina(),
                                                        regSalidaAlm.getUsuario(),
                                                        regSalidaAlm.getColaborador(),
                                                        regSalidaAlm.getPatrimonio(),
                                                        regSalidaAlm.getTalla(),
                                                        regSalidaAlm.getCantidad(),
                                                        regSalidaAlm.getEstadosalida());
    }
}
