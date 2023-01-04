
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Repository;

import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.PatrimonioEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.RegEntradaAlmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatrimonioRepository extends JpaRepository<PatrimonioEntity, String> {
    
    //obtener la descripcion segun insert de colaborador
    PatrimonioEntity findOneByDescripcionpatrimonio(String descripcionpatrimonio);
    PatrimonioEntity findOneByTalla(String talla);
}
