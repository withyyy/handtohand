package cn.withyyy.handtohand.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        if (null != session.getAttribute("token")){
            System.out.println("收到token了");
            return true;
        }else {
            response.sendRedirect("/login");
            return false;
        }
    }
}
