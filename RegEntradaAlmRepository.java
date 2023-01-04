
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Repository;

import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.RegEntradaAlm;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.RegEntradaAlmEntity;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public interface RegEntradaAlmRepository extends JpaRepository<RegEntradaAlmEntity, String>{
    
    // public List<colaboradorEntity> findAll();
    @Override
    List<RegEntradaAlmEntity> findAll();
    
    //actualizar
    
    @Query(value = "select * from actualizar_entrada(:identradaoficina, :usuario, :patrimonio, :talla, :cantidad, :estado)" ,nativeQuery = true)
        void actulizarentrada(      @Param("identradaoficina") String identradaoficina,
                                    @Param("usuario") String usuario,           
                                    @Param("patrimonio")String patrimonio,
                                    @Param("talla") String talla, 
                                    @Param("cantidad") int cantidad, 
                                    @Param("estado") String estado);
    
    //listar entrada
    @Query(value = "select * from listar_Entrada()", nativeQuery = true)
        List<RegEntradaAlmEntity> findAllListarEntrada();
    
     //insertar por procedimiento alamcenado
    @Query(value = "select * from registrar_entrada(:identradaoficina, :usuario, :patrimonio, :talla, :cantidad,:estadoentrada)" ,nativeQuery = true)
        void insert(    @Param("identradaoficina") String identradaoficina,
                        @Param("usuario") String usuario,           
                        @Param("patrimonio")String patrimonio,
                        @Param("talla") String talla, 
                        @Param("cantidad") int cantidad, 
                        @Param("estado") String estado);
    
    //obtener la descripcion segun insert de colaborador
    //RegEntradaAlm findOneByIdentradaoficina(String identradaoficina);
        
}
