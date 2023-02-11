package com.example.backportfolio.Service;

import com.example.backportfolio.Entity.Skills;
import com.example.backportfolio.Interface.ISkillsService;
import com.example.backportfolio.Repository.ISkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpSkills implements ISkillsService{
    
    @Autowired
    ISkillsRepository skillsRepository;

    @Override
    public List<Skills> getSkills() {
        List<Skills> skills = skillsRepository.findAll();
        return skills;
    }

    @Override
    public void crearSkill(Skills skill) {
        skillsRepository.save(skill);
    }

    @Override
    public void eliminarSkill(Long id) {
        skillsRepository.deleteById(id);
    }

    @Override
    public Skills getSkill(Long id) {
        Skills skill = skillsRepository.findById(id).orElse(null);
        return skill;
    }
    
}