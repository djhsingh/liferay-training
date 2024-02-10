package com.train.liferay.service;


import com.train.liferayAPI.api.LiferayCustomAPI;
import org.osgi.service.component.annotations.Component;

/**
 * @author DEEPAK SINGH JANGRA
 */
@Component(
	property = {
		// TODO enter required service properties
	},
	service = LiferayCustomAPI.class
)
public class CustomService implements LiferayCustomAPI {
	@Override
	public void hello() {
		System.out.println("Hello....");
	}

	// TODO enter required service methods

}