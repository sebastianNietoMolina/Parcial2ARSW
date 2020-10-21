package edu.eci.arsw.parcial.servicios;


import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.parcial.modelo.DatosCiudad;

import java.util.List;

@org.springframework.stereotype.Service("Service")
public interface Service {

    DatosCiudad getDataByCity(String name) throws Exception;

}
