package pl.coderslab.utils;

import javax.servlet.http.HttpSession;

public class RequestUtils {


    public static int getIntFromSession(String paramName, int defaultValue, HttpSession session) {
        if (session.getAttribute(paramName) != null) {
            Integer element = (int) session.getAttribute(paramName);
            return element.intValue();
        } else {
            return defaultValue;
        }
    }
}
