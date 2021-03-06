/*
 * Copyright 2016 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.sdk.servlet.filter;

import com.stormpath.sdk.servlet.filter.mvc.ControllerFilter;

import javax.servlet.ServletException;

/**
 * @since 1.0.0
 */
public class SamlFilter extends ControllerFilter {

    @Override
    protected void onInit() throws ServletException {
        /* TODO SAML is currently broken. Potentially to be solved on https://github.com/stormpath/stormpath-sdk-java/issues/438
        SubdomainResolver subdomainResolver = new SubdomainResolver();
        subdomainResolver.setBaseDomainName(getConfig().get("stormpath.web.application.domain"));

        DefaultOrganizationNameKeyResolver organizationNameKeyResolver = new DefaultOrganizationNameKeyResolver();
        organizationNameKeyResolver.setSubdomainResolver(subdomainResolver);

        DefaultSamlOrganizationResolver samlOrganizationResolver = new DefaultSamlOrganizationResolver();
        samlOrganizationResolver.setOrganizationNameKeyResolver(organizationNameKeyResolver);

        SamlController controller = new SamlController();
        controller.setServerUriResolver(new DefaultServerUriResolver());
        controller.setSamlUri("/");
        controller.setCallbackUri(getConfig().get("stormpath.web.saml.result.uri"));
        controller.setAlreadyLoggedInUri(getConfig().getLoginControllerConfig().getNextUri());
        controller.setSamlOrganizationResolver(samlOrganizationResolver);
        controller.init();

        setController(controller);
        */
        super.onInit();
    }
}
