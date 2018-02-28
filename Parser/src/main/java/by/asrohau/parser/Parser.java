package by.asrohau.parser;

public class Parser {

    private String result;

    public Parser (String request) {
        this.result = parseString(request);
    }

    public String getResult(){
        return this.result;
    }

    private String parseString(String request) {

        String phoneRegex = "^((8|\\+375)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";
        String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
        String name = "^[a-zA-Zа-яА-Я]+$";
        String socialSecurityNumber = "[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]";

        if(request.matches(socialSecurityNumber)){
            return "security number";
        }else if(request.matches(emailRegex)){
            return "email";
        }else if(request.matches(name)){
            return "name";
        }else if(request.matches(phoneRegex)){
            return "phone";
        }

        return "undefind";
    }

}
