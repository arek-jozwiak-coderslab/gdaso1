package pl.coderslab.utils;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieWebUtils {


    /**
     * Add cookie to response
     *
     * @param cookieName
     * @param cookieValue
     * @param seconds
     * @param response
     */
    public static void setCookie(String cookieName, String cookieValue, int seconds, HttpServletResponse response) {
        Cookie c = new Cookie(cookieName, StringUtils.deleteWhitespace(cookieValue));
        c.setMaxAge(seconds);
        response.addCookie(c);
    }

    /**
     * Get cookie by name
     *
     * @param coookieName
     * @param request
     * @return
     */
    public static String getCookieValue(String coookieName, HttpServletRequest request) {
        String cookieValue = null;
        for (Cookie c : request.getCookies()) {
            if (coookieName.equals(c.getName())) {
                cookieValue = c.getValue();
            }
        }
        return cookieValue;
    }

    /**
     * Remove cookie
     *
     * @param coookieName
     * @param request
     * @param response
     */
    public static void deleteCookie(String coookieName, HttpServletRequest request, HttpServletResponse response) {
        for (Cookie c : request.getCookies()) {
            if (coookieName.equals(c.getName())) {
                c.setMaxAge(0);
                response.addCookie(c);
            }
        }

    }

}