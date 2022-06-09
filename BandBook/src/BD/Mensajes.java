/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

/**
 *
 * @author Antonio
 */
public class Mensajes {
    
  private int idmensajes;
    private String email;
    private String name; 
    private String asunto;
    private String texto;
    private String envemail;

    public int getIdmensajes() {
        return idmensajes;
    }

    public void setIdmensajes(int idmensajes) {
        this.idmensajes = idmensajes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getEnvemail() {
        return envemail;
    }

    public void setEnvemail(String envemail) {
        this.envemail = envemail;
    }
   
    
}
