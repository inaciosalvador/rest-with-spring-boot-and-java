package br.com.inacio.service;

import br.com.inacio.dto.OperationRequestDTO;
import br.com.inacio.exception.UnsupportedMathOperationException;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    public Double sum(OperationRequestDTO request) throws Exception {
        if (!isNumeric(request.getNumberOne()) || !isNumeric(request.getNumberTwo())) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return convertToDouble(request.getNumberOne()) + convertToDouble(request.getNumberTwo());
    }

    public Double sub(OperationRequestDTO request) throws Exception {
        if (!isNumeric(request.getNumberOne()) || !isNumeric(request.getNumberTwo())) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return convertToDouble(request.getNumberOne()) - convertToDouble(request.getNumberTwo());
    }

    public Double mult(OperationRequestDTO request) throws Exception {
        if (!isNumeric(request.getNumberOne()) || !isNumeric(request.getNumberTwo())) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return convertToDouble(request.getNumberOne()) * convertToDouble(request.getNumberTwo());
    }

    public Double div(OperationRequestDTO request) throws Exception {
        if (!isNumeric(request.getNumberOne()) || !isNumeric(request.getNumberTwo())) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return convertToDouble(request.getNumberOne()) / convertToDouble(request.getNumberTwo());
    }

    public Double med(OperationRequestDTO request) throws Exception {
        if (!isNumeric(request.getNumberOne()) || !isNumeric(request.getNumberTwo()) || !isNumeric(request.getNumberThree())) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return (convertToDouble(request.getNumberOne())
                + convertToDouble(request.getNumberTwo())
                + convertToDouble(request.getNumberThree())) / 3;
    }

    public Double raiz(String number) throws Exception {
        if (!isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return Math.sqrt(convertToDouble(number));
    }

    private Double convertToDouble(String strNumber) throws UnsupportedMathOperationException {
        if (strNumber == null || strNumber.isEmpty()) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }

    private boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", ".");
        return number.matches("[+-]?[0-9]*\\.?[0-9]+");
    }
}
