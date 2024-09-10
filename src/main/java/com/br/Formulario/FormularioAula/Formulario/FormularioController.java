package com.br.Formulario.FormularioAula.Formulario;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/formulario")
public class FormularioController {

    @Autowired
    FormularioService formularioService;

    @GetMapping
    public List<FormularioModel> getAllFormularios(){
        return this.formularioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FormularioModel> getFormularioById(@PathVariable Long id){
        Optional<FormularioModel> formularioModel = formularioService.findById(id);
        return formularioModel.map(ResponseEntity:: ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public FormularioModel createFormularioModel(@RequestBody FormularioModel formularioModel){
        return formularioService.save(formularioModel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FormularioModel> updateFormularioModel(@PathVariable Long id, @RequestBody FormularioModel formularioModel){
        if(!formularioService.findById(id).isPresent()){
            return ResponseEntity.notFound().build();
        }
        formularioModel.setId(id);
        return ResponseEntity.ok(formularioService.save(formularioModel));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFormularioModel(@PathVariable Long id){
        if(!formularioService.findById(id).isPresent()){
            return ResponseEntity.notFound().build();
        }
        formularioService.DeleteById(id);
        return ResponseEntity.noContent().build();
    }


















}
