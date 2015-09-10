package fieldFactory;

import com.vaadin.data.Item;
import com.vaadin.ui.Component;
import com.vaadin.ui.Field;
import com.vaadin.ui.TextField;

import com.vaadin.ui.DefaultFieldFactory;

public class MaterialesFieldFactory extends DefaultFieldFactory {
	private static final long serialVersionUID = 2227686727728458085L;

	public Field createCustomField(Object bean, Item item, String pid, Component uiContext, Class<?> propertyType) {
		Field field = null;
		
		if("materiales".equals(pid)) {
			TextField textField = new TextField();
			textField.setDescription("This is a customized TextField");
			field = textField;
		}
		
		return field;
	}
}
