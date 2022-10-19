public class IllegalInputException extends CalculatorException {
    
    private String illegalType;
    
    public IllegalInputException(String errorMessage) {

        super(errorMessage);
        this.illegalType = illegalType;

    }

    public String getIllegalType() {

        return illegalType;

    }


}