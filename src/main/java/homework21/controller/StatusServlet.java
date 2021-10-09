package homework21.controller;

import homework21.dao.StatusDao;
import homework21.services.StatusService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StatusServlet extends HttpServlet {
    private final StatusDao statusDao = new StatusDao();
    private final StatusService statusService = new StatusService(statusDao);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("statuses", statusService.findAllStatuses());
        req.getRequestDispatcher("views/statuses.jsp").forward(req, resp);
    }
}