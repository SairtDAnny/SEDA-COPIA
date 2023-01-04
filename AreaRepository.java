package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Repository;

import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.AreaEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends JpaRepository<AreaEntity, String>{
    
    //obtener la descripcion segun insert de colaborador
     AreaEntity findOneByDescripcion(String desripcion);
     
    /*List<AreaEntity> findAll();
    AreaEntity findOneByIdArea(String idArea);*/

    // JPL
    @Query(value = "select descripcion from area", nativeQuery = true)
        List<?> listOficina();
    
}
