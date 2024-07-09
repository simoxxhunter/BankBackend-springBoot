package com.bank.config;

import com.bank.Services.JwtService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JWTauthentification extends OncePerRequestFilter {

    final JwtService jwtService;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        final String authHeader = request.getHeader("Authorization");
        final String jwt ;

        if (authHeader != null || authHeader.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;

        }
        jwt = authHeader.substring(7);
        final String userName = jwtService.extractUsername(jwt);

    }
}
