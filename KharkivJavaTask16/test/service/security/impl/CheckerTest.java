package service.security.impl;

import entity.user.User;
import org.mockito.Mock;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Arsalan
 */
public abstract class CheckerTest {
    @Mock
    protected HttpServletRequest request;
    @Mock
    protected HttpServletResponse response;
    @Mock
    protected FilterChain filterChain;
    @Mock
    HttpSession session;
    @Mock
    RequestDispatcher dispatcher;
    @Mock
    User user;
    @Mock
    protected AbstractChecker nextChecker;
    protected AbstractChecker checker;
    protected static final String PATH = "security.xml";
    protected static final String SECURE_PAGE = "confirm_order";
    protected static final String NOT_SECURE_PAGE = "confirm.jsp";
}
