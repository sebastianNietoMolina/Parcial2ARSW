package edu.eci.arsw.parcial.controladores;

import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.parcial.servicios.ExecptionService;
import edu.eci.arsw.parcial.servicios.Service;
import edu.eci.arsw.parcial.servicios.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clima")
public class ParcialController {

    @Autowired
    Service cs;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ResponseEntity<?> getDataByCity(@PathVariable String name) {
        try {
            return new ResponseEntity<>(cs.getDataByCity(name), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            return new ResponseEntity<>("Error 404", HttpStatus.NOT_FOUND);
        }
    }

}
