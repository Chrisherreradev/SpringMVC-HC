package com.mx.accenture.springmvc.example.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TokenUtils {

    private static final String ACCESS_TOKEN_SECRET = "secretosecretosecretosecretosecreto";
    private static final Long ACCESS_TOKEN_LIFETIME_SECONDS =  3600L;

    public static String createToken(String username){
        // Set expiration
        long expirationTime = ACCESS_TOKEN_LIFETIME_SECONDS * 1000;
        Date expirationDate = new Date(System.currentTimeMillis() + expirationTime);

        // Extra data in token
        Map<String, Object> extra = new HashMap<>();
        extra.put("username",username);

        // Generate and return token
        return Jwts.builder()
                .setSubject(username)
                .setExpiration(expirationDate)
                .addClaims(extra)
                .signWith(Keys.hmacShaKeyFor(ACCESS_TOKEN_SECRET.getBytes()))
                .compact();
    }

    // This method is the reverse of createToken, here we validate the token sent by the user
    public static UsernamePasswordAuthenticationToken getAuthentication(String token){
        try{
            Claims claims = Jwts.parserBuilder()
                    .setSigningKey(ACCESS_TOKEN_SECRET.getBytes())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();

            String username = claims.getSubject();

            return new UsernamePasswordAuthenticationToken(username, null, Collections.emptyList());
        } catch (JwtException e){
            // When invalid token is sent
            return null;
        }
    }
}
