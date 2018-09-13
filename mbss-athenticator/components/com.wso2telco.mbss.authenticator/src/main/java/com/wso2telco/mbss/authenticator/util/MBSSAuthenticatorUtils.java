package com.wso2telco.mbss.authenticator.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MBSSAuthenticatorUtils {
    public static boolean isPasswordValid(String regex, String password) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
