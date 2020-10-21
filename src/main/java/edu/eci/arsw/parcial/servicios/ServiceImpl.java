package edu.eci.arsw.parcial.servicios;

import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.parcial.http.Http;
import edu.eci.arsw.parcial.modelo.DatosCiudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImpl implements edu.eci.arsw.parcial.servicios.Service {

    @Autowired
    Http http;

    @Override
    public List<DatosCiudad> getDataByCity(String name) throws Exception {
        List<DatosCiudad> res = new ArrayList<>();
        res.add(http.getWeaterByCity(name));
        return res;
    }
}
