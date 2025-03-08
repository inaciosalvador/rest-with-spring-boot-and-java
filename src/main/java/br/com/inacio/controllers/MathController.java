package br.com.inacio.controllers;

import br.com.inacio.dto.OperationRequestDTO;
import br.com.inacio.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @Autowired
    private MathService mathService;

    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
        return mathService.sum(new OperationRequestDTO(numberOne, numberTwo));
    }

    @GetMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double sub(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
        return mathService.sub(new OperationRequestDTO(numberOne, numberTwo));
    }

    @GetMapping("/multi/{numberOne}/{numberTwo}")
    public Double mult(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
        return mathService.mult(new OperationRequestDTO(numberOne, numberTwo));
    }

    @GetMapping("/div/{numberOne}/{numberTwo}")
    public Double div(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
        return mathService.div(new OperationRequestDTO(numberOne, numberTwo));
    }

    @GetMapping("/med/{numberOne}/{numberTwo}/{numberThree}")
    public Double med(@PathVariable String numberOne, @PathVariable String numberTwo, @PathVariable String numberThree) throws Exception {
        return mathService.med(new OperationRequestDTO(numberOne, numberTwo, numberThree));
    }

    @GetMapping("/raiz/{numberOne}")
    public Double raiz(@PathVariable String numberOne) throws Exception {
        return mathService.raiz(numberOne);
    }
}
