package enums;

public enum Exceptions {

    NOT_FOND_SORT_ALGORITHM_EXCEPTION("Not found sort algorithm "),
    NOT_FOND_SEARCH_ALGORITHM_EXCEPTION("Not found search algorithm ");

    String message;

    Exceptions(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}
