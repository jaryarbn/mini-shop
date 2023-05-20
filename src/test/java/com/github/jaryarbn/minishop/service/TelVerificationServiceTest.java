package com.github.jaryarbn.minishop.service;

import com.github.jaryarbn.minishop.controller.AuthController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelVerificationServiceTest {
    public static AuthController.TelAndCode VALID_PARAMETER = new AuthController.TelAndCode("138123456789", null);
    public static AuthController.TelAndCode EMPTY_TEL = new AuthController.TelAndCode(null, null);
    public static AuthController.TelAndCode VALID_PARAMETER_CODE = new AuthController.TelAndCode("138123456789", "000000");

    @Test
    public void returnTrueIfValid() {
        Assertions.assertTrue(new TelVerificationService().verifyTelParameter(VALID_PARAMETER));
    }

    @Test
    public void returnFalseIfNoTel() {
        Assertions.assertFalse(new TelVerificationService().verifyTelParameter(EMPTY_TEL));
        Assertions.assertFalse(new TelVerificationService().verifyTelParameter(null));


    }
}
