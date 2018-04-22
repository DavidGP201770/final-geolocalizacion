/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.hdp;

import java.util.ArrayList;
import org.springframework.data.annotation.Id;

/**
 *
 * @author david
 */
public class Usuario {
    @Id
    private String id;
    private String nickname;
    private String mail;
    private String password;
    private ArrayList<Mensaje> mensajes;
    private Posicion posicion;

    public Usuario(String nickname, String mail, String password, ArrayList<Mensaje> mensajes, Posicion posicion) {
        this.nickname = nickname;
        this.mail = mail;
        this.password = password;
        this.mensajes = mensajes;
        this.posicion = posicion;
    }

    public Usuario() {
    }

    public Usuario(String id, String nickname, String mail, String password, ArrayList<Mensaje> mensajes, Posicion posicion) {
        this.id = id;
        this.nickname = nickname;
        this.mail = mail;
        this.password = password;
        this.mensajes = mensajes;
        this.posicion = posicion;
    }
    
    public Usuario(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

}
