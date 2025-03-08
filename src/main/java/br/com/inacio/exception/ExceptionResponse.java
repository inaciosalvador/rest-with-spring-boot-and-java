package br.com.inacio.exception;

import java.util.Date;

//Utilizado para formatar a exception de uma forma mas amigavel
public record ExceptionResponse(Date timestemp, String messege,String details) {
}
