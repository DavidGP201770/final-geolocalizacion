/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.hdp;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author david
 */
@CrossOrigin
@RestController
@RequestMapping("/api")
public class ControladorUsuario {
    
    //Aqui viene las 5 operaciones basicas
    @Autowired RepositorioUsuario repo;
    
    //Metodo para guardar
    @RequestMapping(value="/usuario", method = RequestMethod.POST , headers = {"Accept=application/json"})
    public Estatus guardar(@RequestBody String json)throws Exception{
    
        ObjectMapper maper= new ObjectMapper();
        Usuario u= maper.readValue(json, Usuario.class);
        
        Estatus e=new Estatus();
        
        repo.save(u);
        e.setSuccess(true);
        return e;
    }
    
    //Metodo para borrar
    @RequestMapping(value="/usuario", method = RequestMethod.DELETE , headers = {"Accept=application/json"})
    public Estatus borrar(@RequestBody String json)throws Exception{
    
        ObjectMapper maper= new ObjectMapper();
        Usuario u= maper.readValue(json, Usuario.class);
        
        Estatus e=new Estatus();
        
        repo.delete(u);
        e.setSuccess(true);
        return e;
    }
    
    //Metodo para actualizar
    @RequestMapping(value="/usuario", method = RequestMethod.PUT , headers = {"Accept=application/json"})
    public Estatus actualizar(@RequestBody String json)throws Exception{
    
        ObjectMapper maper= new ObjectMapper();
        Usuario u= maper.readValue(json, Usuario.class);
        
        Estatus e=new Estatus();
        
        repo.save(u);
        e.setSuccess(true);
        return e;
    }
    
    //Metodo para buscar
    @RequestMapping(value="/usuario", method = RequestMethod.GET , headers = {"Accept=application/json"})
    public Estatus buscar(@RequestBody String json)throws Exception{
    
        ObjectMapper maper= new ObjectMapper();
        Usuario u= maper.readValue(json, Usuario.class);
        
        Estatus e=new Estatus();
        
        repo.findAll();
        e.setSuccess(true);
        return e;
    }
    /*
    //Metodo para buscar
    @RequestMapping(value="/usuario", method = RequestMethod.GET , headers = {"Accept=application/json"})
    public Estatus buscaruno(@RequestBody String json)throws Exception{
    
        ObjectMapper maper= new ObjectMapper();
        Usuario u= maper.readValue(json, Usuario.class);
        
        Estatus e=new Estatus();
        
        //repo.findOne(u);
        e.setSuccess(true);
        return e;
    }*/
}

