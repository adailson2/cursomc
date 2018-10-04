package com.adailsonsantos.cursomc.services;

import com.adailsonsantos.cursomc.domain.Pedido;
import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

    void sendOrderConfirmationEmail(Pedido obj);

    void sendEmail(SimpleMailMessage msg);
}