class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("Parâmetros inválidos! O segundo parâmetro deve ser maior que o primeiro.");
    }
}