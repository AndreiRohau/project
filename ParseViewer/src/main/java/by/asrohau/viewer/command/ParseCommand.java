package by.asrohau.viewer.command;

import by.asrohau.parser.Parser;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ParseCommand {
    public void execute (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String goToPage = "/jsp/result.jsp";

        String attribute = request.getParameter("inputstring");
        Parser parser = new Parser(attribute);
        String result = parser.getResult();

        request.setAttribute("result", result);

        RequestDispatcher dispatcher = request.getRequestDispatcher(goToPage);
        dispatcher.forward(request, response);
    }
}
