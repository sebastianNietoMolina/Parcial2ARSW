package edu.eci.arsw.parcial.modelo;


import java.util.ArrayList;
import java.util.List;

public class DatosCiudad {
    private Coor coord;
    private List<Clima> climas;
    private long visibility;
    private long dt;
    private long id;
    private String name;
    private long timezone;


    public DatosCiudad(){

    }

    public List<Clima> getClimas() {
        return climas;
    }

    public void setClimas(List<Clima> climas) {
        this.climas = climas;
    }

    public Coor getCoord() {
        return coord;
    }

    public void setCoord(Coor coord) {
        this.coord = coord;
    }

    public long getTimezone() {
        return timezone;
    }

    public void setTimezone(long timezone) {
        this.timezone = timezone;
    }

    public long getVisibility() {
        return visibility;
    }

    public void setVisibility(long visibility) {
        this.visibility = visibility;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
