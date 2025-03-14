package br.ueg.igor.HelloWorld.calculatorcontroller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculatorController {
    @GetMapping()
    public String calculator(
            @RequestParam(value = "numero1",required = true) int numero1,
            @RequestParam(value = "numero2",required = true) int numero2
    ){
        int resultado = numero1 + numero2;
        return " Numero 1: " + numero1 + " Numero 2: " + numero2 + " Resultado: " + resultado;
    }
}
