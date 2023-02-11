package com.example.backportfolio.Service;

import com.example.backportfolio.Entity.DueñoProyecto;
import com.example.backportfolio.Interface.IDueñoProyectoService;
import com.example.backportfolio.Repository.IDueñoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpDueñoProyecto implements IDueñoProyectoService {

    @Autowired
    IDueñoRepository dueñoRepository;
    
    @Override
    public List<DueñoProyecto> getDueños() {
        List<DueñoProyecto> dueños = dueñoRepository.findAll();
        return dueños;
    }

    @Override
    public void crearDueño(DueñoProyecto dueñoProyecto) {
        dueñoRepository.save(dueñoProyecto);
    }

    @Override
    public void eliminarDueño(Long id) {
        dueñoRepository.deleteById(id);
    }

    @Override
    public DueñoProyecto getDueño(Long id) {
        DueñoProyecto dueño = dueñoRepository.findById(id).orElse(null);
        return dueño;
    }
    
}
