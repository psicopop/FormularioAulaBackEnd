package com.br.Formulario.FormularioAula.Formulario;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormularioService {

    @Autowired
    private FormularioRepository formularioRepository;



    public List<FormularioModel> findAll(){
        return this.formularioRepository.findAll();
    }


    public Optional<FormularioModel> findById(Long id){
        return this.formularioRepository.findById(id);
    }

    public FormularioModel save(FormularioModel formularioModel){
        return this.formularioRepository.save(formularioModel);
    }

    public void DeleteById(Long id){
        this.formularioRepository.deleteById(id);
    }

}
