package br.com.tairoroberto.jogosdefutebol.converter;

import java.math.BigDecimal;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("br.com.tairoroberto.ValorArrecadadoConverter")
public class ValorArrecadadoConverter implements Converter{

	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		BigDecimal vaLorConvertido = null;
		if (value != null && !value.equals("")) {
			if (value.equalsIgnoreCase("mil")) {
				vaLorConvertido = BigDecimal.valueOf(1000.00);
			}else{
				try {
					vaLorConvertido = BigDecimal.valueOf(Double.parseDouble(value));
				} catch (Exception e) {
					//instancia um faces message para ser mostrado
					FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Valor incorreto","Informe a valor correto.");
					//Lança uma exceção para mostrar a mensagem
					throw new ConverterException(message);
				}
			}
		}
		return vaLorConvertido;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value.equals(BigDecimal.valueOf(1000.00))) {
			return "Mil Reais";
		}
		return String.valueOf(value);
	}

}
