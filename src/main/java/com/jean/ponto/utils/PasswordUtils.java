package com.jean.ponto.utils;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
	
	private static final Logger log = (Logger) LoggerFactory.getLogger(PasswordUtils.class);
	
	public PasswordUtils() {
		
	}
	
	
	public static String gerarBCrypt(String senha) {
		
		if(senha == null) {
			return senha;
		}
		
		log.info("Gerando Hash com o BCrypt.");
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.encode(senha);
	}

}
