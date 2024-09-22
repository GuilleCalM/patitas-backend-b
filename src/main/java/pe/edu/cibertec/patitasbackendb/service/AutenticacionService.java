package pe.edu.cibertec.patitasbackendb.service;

import pe.edu.cibertec.patitasbackendb.dto.LoginRequestDTO;

import java.io.IOException;

public interface AutenticacionService {
    String[] validarUsuario(LoginRequestDTO loginRequestDTO) throws IOException;
}
