package com.babel.Repository;

import com.babel.Poliza.Poliza;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolizaRepository {
    @Select("SELECT * FROM POLIZAS")
    List<Poliza> selectPoliza();
}
