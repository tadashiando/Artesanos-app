package validation;

import beans.MaterialProducto;
import beans.Productos;

import com.vaadin.data.validator.AbstractValidator;

import enterpriseapp.Utils;
import enterpriseapp.hibernate.exception.CrudException;

@SuppressWarnings("serial")
public class FormulaValidator extends AbstractValidator {
	
	public FormulaValidator(String errorMessage){
		super(errorMessage);
	}

	@Override
	public boolean isValid(Object value) {
			Productos productos = (Productos) value;
			Integer sumGr = 0;
			for (MaterialProducto materialp : productos.getMaterialProducto())
				sumGr = sumGr + materialp.getCantidadGr();
			
			if(sumGr.intValue() < (productos.getCantidadGr().intValue())) {
				throw new CrudException(Utils.getProperty("ui.formulaViolationErrorOnMath"));
			}
		return true;
	}

}