package com.train.liferay.panelApp.application.list;

import com.train.liferay.panelApp.constants.CustomPanelAppPanelCategoryKeys;
import com.train.liferay.panelApp.constants.CustomPanelAppPortletKeys;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author DEEPAK SINGH JANGRA
 */
@Component(
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key=" + CustomPanelAppPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class CustomPanelAppPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return CustomPanelAppPortletKeys.CUSTOMPANELAPP;
	}

	@Override
	public Portlet getPortlet() {
		return _portlet;
	}

	@Reference(target = "(javax.portlet.name=" + CustomPanelAppPortletKeys.CUSTOMPANELAPP + ")")
	private Portlet _portlet;

}