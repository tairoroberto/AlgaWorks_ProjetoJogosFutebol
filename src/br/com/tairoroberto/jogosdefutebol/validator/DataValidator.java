package br.com.tairoroberto.jogosdefutebol.validator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("br.com.tairoroberto.DataValidator")
public class DataValidator implements Validator{
	
	private static final DateFormat FORMATER = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date getDataHoje(){
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}
	
	@Override
	public void validate(FacesContext context, UIComponent component, Object value)
			throws ValidatorException {
		
		Calendar data = Calendar.getInstance();
		data.setTime((Date) value);
		
		int diaDaSemana = data.get(Calendar.DAY_OF_WEEK);
		
		if (getDataHoje().before(data.getTime())) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"Data não permitida","informe uma data que igual ou menor que hoje.");
			throw new ValidatorException(message);
		}
	}

}
