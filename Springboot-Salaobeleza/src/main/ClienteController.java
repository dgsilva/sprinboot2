package main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteController {
	
	@Autowired
	ClienteRepository cDao;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView iniciar() {
		ModelAndView model = new ModelAndView("cadastra");
		model.addObject("msgum","Bem Vindo ao Spring Boot - Diferente e Top");
		
		return model;
	}
	
	
	@RequestMapping(value = "/gravar.html", method = RequestMethod.POST)
	public ModelAndView gravar(Cliente c){
		ModelAndView model = new ModelAndView(); 
		try{
			cDao.save(c);
			model.addObject("msg","Gravado com sucesso");
		}catch(Exception ex){
			model.addObject("error", ex.getMessage());
		}
		return model;
	}

}
