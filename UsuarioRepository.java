
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Repository;

import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, String>{
    //obtener la descripcion segun insert de colaborador
     UsuarioEntity findOneByNombreusuario(String nombreusuario);
}
