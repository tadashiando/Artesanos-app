package validation;

import com.vaadin.data.validator.AbstractStringValidator;

@SuppressWarnings("serial")
public class FormulaValidator extends AbstractStringValidator {
	
	public FormulaValidator(String errorMessage){
		super(errorMessage);
	}

	@Override
	protected boolean isValidString(String value) {
		// TODO Auto-generated method stub
		return false;
	}

}