package com.example.backportfolio.Interface;

import com.example.backportfolio.Entity.DueñoProyecto;
import java.util.List;

public interface IDueñoProyectoService {
    
    public List<DueñoProyecto> getDueños();
    
    public void crearDueño(DueñoProyecto dueñoProyecto);
    
    public void eliminarDueño(Long id);
    
    public DueñoProyecto getDueño(Long id);
    
}