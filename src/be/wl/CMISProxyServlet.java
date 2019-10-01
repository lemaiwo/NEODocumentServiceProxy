package be.wl;

import com.sap.ecm.api.AbstractCmisProxyServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CMISProxyServlet
 */
@WebServlet("/CMISProxyServlet")
public class CMISProxyServlet extends AbstractCmisProxyServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected boolean supportAtomPubBinding() {
		return false;
	}

	@Override
	protected boolean supportBrowserBinding() {
		return true;
	}

       
    /**
     * @see AbstractCmisProxyServlet#AbstractCmisProxyServlet()
     */
    public CMISProxyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	@Override
	protected String getRepositoryKey() {
		// TODO Auto-generated method stub
        return "faceimages";
	}

	@Override
	protected String getRepositoryUniqueName() {
		// TODO Auto-generated method stub
        return "FaceImages";
	}

}
