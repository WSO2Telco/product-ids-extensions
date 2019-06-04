package com.wso2telco.password.validator;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.identity.mgt.policy.AbstractPasswordPolicyEnforcer;


public class CustomPasswordPolicy extends AbstractPasswordPolicyEnforcer {
  private static Log log = LogFactory.getLog(CustomPasswordPolicy.class);
  
  public CustomPasswordPolicy() {}
  
  public boolean enforce(Object... args) {
    if (args != null)
    {

      String password = args[0].toString();
      String username = args[1].toString();
      if (password.toLowerCase().contains(username.toLowerCase()))
      {
        errorMessage = "Password cannot contain the User Name";
        log.error(errorMessage);
        return false;
      }
      return true;
    }
    

    return true;
  }
  
  public void init(Map<String, String> params) {}
}