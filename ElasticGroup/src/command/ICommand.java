package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * interface of commands used by the front controler (MVC1 achetype)
 * 
 * @author florianpuzenat
 */
public interface ICommand {

	String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
