package es.albarregas.controllers;

import es.albarregas.beans.Ciclo;
import es.albarregas.beans.Modulo;
import es.albarregas.daofactory.DAOFactory;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;
import es.albarregas.dao.IGenericoDAO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Jesus
 */
@WebServlet(name = "Controlador", urlPatterns = {"/control"})
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DAOFactory daof = DAOFactory.getDAOFactory();
        IGenericoDAO pdao = daof.getGenericoDAO();

        Object objeto = new Object();
        Ciclo ciclo = new Ciclo();
        Modulo modulo=null;
        List<Modulo> modulos = new ArrayList<>();
        String aux[] = null;
        String url = null;
        switch (request.getParameter("op")) {

            case "add":

                try {
                BeanUtils.populate(ciclo, request.getParameterMap());
                
                aux=request.getParameterValues("denominacion");
                    for (String c : aux) {
                        if(c!=""){
                        modulo=new Modulo();
                        modulo.setDenominacion(c);
                        modulos.add(modulo);
                        }
                        
                    }
                
               
            } catch (IllegalAccessException | InvocationTargetException ex) {
                ex.printStackTrace();
            }

            ciclo.setModulos(modulos);
            objeto = (Object) ciclo;
            pdao.add(objeto);
            url = "index.jsp";
            break;

            case "delete":

                ciclo = (Ciclo) pdao.getOne(ciclo.getClass(), Integer.parseInt(request.getParameter("registro")));
                pdao.delete(ciclo);
                url = "index.jsp";
                break;

            case "update":
                ciclo = (Ciclo) pdao.getOne(ciclo.getClass(), Integer.parseInt(request.getParameter("registro")));
                request.setAttribute("ciclo", ciclo);
                url = "JSP/formularioActualizar.jsp";
                break;
                
            case "deleteModulo":
                String[] idModulo=request.getParameter("idModulos").split("-");
                ciclo = (Ciclo) pdao.getOne(ciclo.getClass(), Integer.parseInt(idModulo[0]));
                Iterator<Modulo> itModulo=ciclo.getModulos().iterator();
                boolean encontrado=false;
                Modulo moduloEliminar=new Modulo();
                Modulo moduloUno;
                int buscado=Integer.parseInt(idModulo[1]);
                while (itModulo.hasNext() && !encontrado) {
                    moduloUno=itModulo.next();
                    if(moduloUno.getIdModulo()==buscado){
                        moduloEliminar=moduloUno;
                        encontrado=true;
                    }
                }
                ciclo.getModulos().remove(moduloEliminar);
                pdao.update(ciclo);
                url="index.jsp";
                break;

        }
        request.getRequestDispatcher(url).forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
