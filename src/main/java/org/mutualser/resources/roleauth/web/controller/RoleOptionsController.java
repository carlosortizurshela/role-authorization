package org.mutualser.resources.roleauth.web.controller;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

import org.mutualser.resources.roleauth.web.dto.RoleOptions;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RoleOptionsController {

    public RoleOptionsController() {
        super();
    }

    // API - read
    @PreAuthorize("#oauth2.hasScope('read') && hasRole('ADMIN_MUTUAL')")
    @RequestMapping(method = RequestMethod.GET, value = "/roleoptions/{role}")
    @ResponseBody
    public RoleOptions findById(@PathVariable final String role) {
    	 System.out.println("Requested Role is " + role );

        return new RoleOptions(role, randomAlphabetic(4));
    }

   

}
