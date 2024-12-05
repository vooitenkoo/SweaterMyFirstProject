package com.example.sweater_2.service;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(
            HttpServletRequest request,
            HttpServletResponse response,
            AuthenticationException exception
    ) throws IOException, ServletException {
        // Передаем сообщение об ошибке в сессию
        request.getSession().setAttribute("SPRING_SECURITY_LAST_EXCEPTION", exception.getMessage());
        // Перенаправляем обратно на страницу логина
        response.sendRedirect("/login?error=true");
    }
}
