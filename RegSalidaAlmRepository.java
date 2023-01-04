
package com.EPP_SEDACUSCO.EPP_SEDACUSCO.Repository;

import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.RegEntradaAlm;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.RegEntradaAlmEntity;
import com.EPP_SEDACUSCO.EPP_SEDACUSCO.Entity.RegSalidaAlmEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RegSalidaAlmRepository extends JpaRepository<RegSalidaAlmEntity, String>{
// public List<colaboradorEntity> findAll();
    @Override
    List<RegSalidaAlmEntity> findAll();    

//actualizar
    
    @Query(value = "select * from actualizar_salida(:idsalidaoficina, :usuario, :colaborador,:patrimonio, :talla, :cantidad, :estadosalida)" ,nativeQuery = true)
    void actulizar(     @Param("idsalidaoficina") String idsalidaoficina,
                        @Param("usuario") String usuario,
                        @Param("colaborador") String colaborador,
                        @Param("patrimonio")String patrimonio,
                        @Param("talla") String talla, 
                        @Param("cantidad") int cantidad, 
                        @Param("estadosalida") String estado);
    
    //listar entrada
    @Query(value = "select * from listar_Salida()", nativeQuery = true)
        List<RegSalidaAlmEntity> findAllListarSalida();
    
     //insertar por procedimiento alamcenado
    @Query(value = "select * from registrar_salida(:idsalidaoficina, :usuario, :colaborador,:patrimonio, :talla, :cantidad, :estadosalida)" ,nativeQuery = true)
        void insert(    @Param("idsalidaoficina") String idsalidaoficina,
                        @Param("usuario") String usuario,
                        @Param("colaborador") String colaborador,
                        @Param("patrimonio")String patrimonio,
                        @Param("talla") String talla,
                        @Param("cantidad") int cantidad,
                        @Param("estadosalida") String estado);
    
        
   //insertar por procedimiento alamcenado
   /* @Query(value = "select * from actualizar_Renovacion(:idsalidaoficina, :usuario, :colaborador,:patrimonio, :talla, :cantidad, :estadosalida)" ,nativeQuery = true)
        void actualizarRenovacioSn(   @Param("idsalidaoficina") String idsalidaoficina,
                                    @Param("usuario") String usuario,
                                    @Param("colaborador") String colaborador,
                                    @Param("patrimonio")String patrimonio,
                                    @Param("talla") String talla,
                                    @Param("cantidad") int cantidad,
                                    @Param("estadosalida") String estado); */  
        
    @Query(value = "select * from actualizar_Renovacion(:idsalidaoficina, :usuario, :colaborador,:patrimonio, :talla, :cantidad, :estadosalida)" ,nativeQuery = true)
        void actualizarRenovacion(  @Param("idsalidaoficina") String idsalidaoficina,
                                    @Param("usuario") String usuario,
                                    @Param("colaborador") String colaborador,
                                    @Param("patrimonio")String patrimonio,
                                    @Param("talla") String talla, 
                                    @Param("cantidad") int cantidad, 
                                    @Param("estadosalida") String estado);    
    
}
