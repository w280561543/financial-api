package com.financial.controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Csrf Controller Class
 * @author Maing<280561543@qq.com>
 */

@RestController
public class CsrfController {
    @RequestMapping(value = "/csrf", method=RequestMethod.GET)
    public CsrfToken csrf(CsrfToken token) {
        return token;
    }
}
