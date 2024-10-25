package com.ehpatho.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * A classe ResponseDTO é responsável por disponibilizar o json com uma mensagem de retorno
 *
 * @author Willian Scaquett willian.scaquett@gmail.com
 */
@Data
@AllArgsConstructor
public class ResponseDTO {
    String mensagem;
}
