package com.example.backportfolio.Interface;

import com.example.backportfolio.Entity.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> getProyectos();
    
    public void crearProyecto(Proyecto proyecto);
    
    public void eliminarProyecto(Long id);
    
    public Proyecto getProyecto(Long id);
    
}
