/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.faces.context.FacesContext;

/**
 *
 * @author GSG
 */
public class ResourcesUtil {

    public static String getString(String key) {
        FacesContext context = FacesContext.getCurrentInstance();
        String value = context.getApplication().evaluateExpressionGet(context, key, String.class);

        return value;
    }
}