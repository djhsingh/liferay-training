package com.train.liferay.panelApp.application.list;

import com.train.liferay.panelApp.constants.CustomPanelAppPanelCategoryKeys;

import com.liferay.application.list.BasePanelCategory;
import com.liferay.application.list.PanelCategory;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.ResourceBundleUtil;

import java.util.Locale;
import java.util.ResourceBundle;

import org.osgi.service.component.annotations.Component;

/**
 * @author DEEPAK SINGH JANGRA
 */
@Component(
	property = {
		"panel.category.key=" + PanelCategoryKeys.COMMERCE,
		"panel.category.order:Integer=100"
	},
	service = PanelCategory.class
)
public class CustomPanelAppPanelCategory extends BasePanelCategory {

	@Override
	public String getKey() {
		return CustomPanelAppPanelCategoryKeys.CONTROL_PANEL_CATEGORY;
	}

	@Override
	public String getLabel(Locale locale) {
		ResourceBundle resourceBundle = ResourceBundleUtil.getBundle(
			"content.Language", locale, getClass());

		return LanguageUtil.get(resourceBundle, "category.custom.label");
	}

}