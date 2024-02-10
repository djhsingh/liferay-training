package com.train.liferay.service.wrapper;


import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.UserLocalServiceWrapper;
import org.osgi.service.component.annotations.Component;

import java.util.Map;

/**
 * @author DEEPAK SINGH JANGRA
 */
@Component(
	property = {
	},
	service = ServiceWrapper.class
)
public class CustomServiceWrapper extends UserLocalServiceWrapper {

	@Override
	public int authenticateByEmailAddress(long companyId, String emailAddress, String password, Map<String, String[]> headerMap, Map<String, String[]> parameterMap, Map<String, Object> resultsMap) throws PortalException {
		System.out.println("Authenticating..........");
		return super.authenticateByEmailAddress(companyId, emailAddress, password, headerMap, parameterMap, resultsMap);
	}
}