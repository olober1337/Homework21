package homework21.controller;

import homework21.dao.AccountDao;
import homework21.services.AccountService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/accounts")
public class AccountServlet extends HttpServlet {
    private final AccountDao accountDao = new AccountDao();
    private final AccountService accountService = new AccountService(accountDao);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("accounts", accountService.findAllAccounts());
        req.getRequestDispatcher("views/accounts.jsp").forward(req, resp);
    }
}
