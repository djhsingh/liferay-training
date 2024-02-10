package com.train.liferay.portletProvider.portlet;

import com.train.liferay.portletProvider.constants.CustomPortletProviderPortletKeys;

import com.liferay.portal.kernel.portlet.BasePortletProvider;
import com.liferay.portal.kernel.portlet.PortletProvider;
import com.liferay.portal.kernel.theme.ThemeDisplay;

import javax.portlet.PortletPreferences;

import org.osgi.service.component.annotations.Component;

/**
 * @author DEEPAK SINGH JANGRA
 */
@Component(
	property = "model.class.name=com.liferay.asset.kernel.model.AssetEntry",
	service = PortletProvider.class
)
public class CustomPortletProviderAddPortletProvider
	extends BasePortletProvider {

	@Override
	public String getPortletName() {
		return CustomPortletProviderPortletKeys.CUSTOMPORTLETPROVIDER;
	}

	@Override
	public Action[] getSupportedActions() {
		return _supportedActions;
	}

	private final Action[] _supportedActions = {Action.ADD};

}