package com.train.liferayFormField.form.field;

import com.liferay.dynamic.data.mapping.form.field.type.BaseDDMFormFieldType;
import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldType;
import com.liferay.frontend.js.loader.modules.extender.npm.NPMResolver;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author DEEPAK SINGH JANGRA
 */
@Component(
	property = {
		"ddm.form.field.type.description=form-field-module-description",
		"ddm.form.field.type.display.order:Integer=13",
		"ddm.form.field.type.group=customized",
		"ddm.form.field.type.icon=text",
		"ddm.form.field.type.label=form-field-module-label",
		"ddm.form.field.type.name=formFieldModule"
	},
	service = DDMFormFieldType.class
)
public class CustomFormFieldDDMFormFieldType extends BaseDDMFormFieldType {

	@Override
	public String getModuleName() {
		return _npmResolver.resolveModuleName(
			"dynamic-data-form-field-module-form-field/form-field-module.es");
	}

	@Override
	public String getName() {
		return "formFieldModule";
	}

	@Override
	public boolean isCustomDDMFormFieldType() {
		return true;
	}

	@Reference
	private NPMResolver _npmResolver;

}