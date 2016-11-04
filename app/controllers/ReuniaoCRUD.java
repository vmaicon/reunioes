package controllers;

import java.util.List;

import com.google.inject.Inject;

import models.Reuniao;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;


public class ReuniaoCRUD extends Controller{
	
	private Form<Reuniao> reuniaoForm;
	
	@Inject
	public ReuniaoCRUD(FormFactory formFactory) {
		reuniaoForm = formFactory.form(Reuniao.class);
	}
	
	public Result novaReuniao(){
		return ok(views.html.novaReuniao.render(reuniaoForm));
	}
	
	public Result gravar(){
		Form<Reuniao> form = reuniaoForm.bindFromRequest();
		
		if(form.hasErrors()){
			flash("erro", "Foram identificados problemas no cadastro");
			return ok(views.html.novaReuniao.render(reuniaoForm));
		}
		
		Reuniao reuniao = form.get();
		reuniao.save();
		
		flash("sucesso", "Registro gravado com sucesso");
		
		return redirect(routes.ReuniaoCRUD.lista());
	}
    
    public Result lista(){
    	List<Reuniao> reunioes = Reuniao.find.findList();
    	return ok(views.html.reuniao.render(reunioes));
        //return TODO montar a lista;
    }
}