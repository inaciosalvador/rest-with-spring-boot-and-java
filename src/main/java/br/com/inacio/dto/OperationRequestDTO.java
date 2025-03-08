package br.com.inacio.dto;

public class OperationRequestDTO {

    private String numberOne;
    private String numberTwo;
    private String numberThree;

    public OperationRequestDTO(String numberOne, String numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public OperationRequestDTO(String numberOne, String numberTwo, String numberThree) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
    }

    public String getNumberOne() {
        return numberOne;
    }

    public String getNumberTwo() {
        return numberTwo;
    }

    public String getNumberThree() {
        return numberThree;
    }
}
