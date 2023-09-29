package pl.sdacademy.projektplus.Quiz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class HealthcheckDto {
    private boolean status;
    private String message;
}
