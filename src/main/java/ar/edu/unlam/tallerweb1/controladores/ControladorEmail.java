package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.Mail;
import ar.edu.unlam.tallerweb1.modelo.Subscripciones;
import ar.edu.unlam.tallerweb1.servicios.ServicioEmail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.inject.Inject;

 @Controller
public class ControladorEmail {

     @Inject
    private ServicioEmail servicioEmail;
     
     @Inject
 	private SessionFactory sessionFactory;

     @RequestMapping(value = "/enviar-mensaje")
    public ModelAndView sendMail (	@RequestParam ("asunto") String asunto,
    								@RequestParam ("nombre") String nombre,
    								@RequestParam ("correo") String correo,
    								@RequestParam ("mensaje") String mensaje) {

        Mail mail = new Mail();
        mail.setTo("nicolasemanuelmorales@hotmail.com");
        mail.setContent(nombre+"\n\n"+correo+"\n\n"+mensaje);
        mail.setSubject(asunto);
        servicioEmail.sendSimpleMessage(mail);
        return new ModelAndView("contact");
    }
     
     @Transactional
     @RequestMapping(value = "/subscribirte")
    public ModelAndView subscribirte (@RequestParam ("correo") String correo){

        Mail mail = new Mail();
        mail.setTo(correo);
        mail.setContent("Ya estas subscripto!!"+"\n\n"+"Pronto recibiras nuestras promociones");
        mail.setSubject("Subscripción");
        servicioEmail.sendSimpleMessage(mail);
        
        Subscripciones sub = new Subscripciones();      
        sub.setCorreo(correo);
        Session session = sessionFactory.getCurrentSession();
        session.save(sub);
                
        return new ModelAndView("redirect:/index");
    }

 }