
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Repository;

import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.ColaboradorEntity;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaboradorRepository extends JpaRepository<ColaboradorEntity, String>{

    ColaboradorEntity findOneByIdarea(String idarea);
   // public List<colaboradorEntity> findAll();
    @Override
    List<ColaboradorEntity> findAll();

    @Query(value = "select * from list_Cola where idcolaborador = :idcolaborador", nativeQuery = true)
        List<?> listColaborador(@Param("idcolaborador") String idcolaborador);
    

    //listar registro de entregas de coaborador.....................................
    @Query(value = "select * from listar_Registro(:idcolaborador)", nativeQuery = true)
        List<?> listRegEntregaColaborador(@Param("idcolaborador") String idcolaborador);
    
    @Autowired
    //JdbcTemplate list;
    @Query(value="select * from listar_Colaborador()", nativeQuery = true)
        List<ColaboradorEntity>findAllListarColaborador();
        
       //ejemoplar 
    @Autowired
    //JdbcTemplate list;
    @Query(value="select colaborador.idcolaborador,\n" +
"	(select descripcion from area where area.idArea=colaborador.idarea),\n" +
"	colaborador.nombrecolaborador,\n" +
"	colaborador.cargo\n" +
"	from colaborador where :idcolaborador=colaborador.idcolaborador;", nativeQuery = true)
        List<ColaboradorEntity>finsdAllListarColaborador(@Param("idcolaborador") String idcolaborador);    
        
            
    @Autowired
    //JdbcTemplate list id;
    @Query(value=   "select * from  list_id_colaborador(:idcolaborador)", nativeQuery = true)
        List<ColaboradorEntity>listColabId(@Param("idcolaborador") String idcolaborador);
    
        
        
    //insertar colaboradorx
    @Autowired
    @Query(value="select * from  insertar_colaborador(:idcolaborador,:idarea,:nombrecolaborador,:cargo)",nativeQuery = true)
        List<?> insertarColaborador(@Param("idcolaborador") String idcolaborador,
                                    @Param("idarea") String idarea,
                                    @Param("nombrecolaborador") String nombrecolaborador,
                                    @Param("cargo") String cargo);
        
    // actualizar colaborador
    @Autowired
    @Query(value="select * from  actualizar_colaborador(:idcolaborador,:idarea,:nombrecolaborador,:cargo)",nativeQuery = true)
        List<?> actualizarColaborador(@Param("idcolaborador") String idcolaborador,
                                    @Param("idarea") String idarea,
                                    @Param("nombrecolaborador") String nombrecolaborador,
                                    @Param("cargo") String cargo);
      
}