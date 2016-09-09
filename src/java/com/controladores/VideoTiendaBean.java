/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controladores;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import util.ResourcesUtil;

/**
 *
 * @author GSG
 */
@Named(value = "videoTiendaBean")
@Dependent
public class VideoTiendaBean {

        private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSaludo(){
     return ResourcesUtil.getString("#{msg['app.saludo']}")+nombre;
}
    
    /**
     * Creates a new instance of VideoTiendaBean
     */
    public VideoTiendaBean() {
    }
    
}
