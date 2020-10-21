package edu.eci.arsw.parcial.http;

import edu.eci.arsw.parcial.modelo.DatosCiudad;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("http")
public interface Http {

    DatosCiudad getWeaterByCity(String city) throws Exception;
}
