package com.example.rest.domain;

import java.time.LocalDate;

/* Em primeiro lugar, precisamos criar uma camada de acesso a um banco de dados e uma classe que representará os motoristas.
Assim sendo, vou criar um pacote domain e, dentro dele, uma classe chamada */

public class Driver {

    Long id;
    String name;
    LocalDate birthDate;
}
