/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-12-15 18:28:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/tags/logIn.tag", Long.valueOf(1481753940255L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- header-section-starts -->\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("    <div class=\"header-top-strip\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"header-top-left\">\r\n");
      out.write("                ");
      if (_jspx_meth_tg_005flogIn_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"header-right\">\r\n");
      out.write("                <div class=\"cart box_1\">\r\n");
      out.write("                    <a href=\"checkout.jsp\">\r\n");
      out.write("                        <h3><span class=\"simpleCart_total\"> $0.00 </span> (<span id=\"simpleCart_quantity\"\r\n");
      out.write("                                                                                 class=\"simpleCart_quantity\"> 0 </span>)<img\r\n");
      out.write("                                src=\"images/bag.png\" alt=\"\"></h3>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <p><a href=\"javascript:;\" class=\"simpleCart_empty\">Empty cart</a></p>\r\n");
      out.write("                    <div class=\"clearfix\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clearfix\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- header-section-ends -->\r\n");
      out.write("<div class=\"inner-banner\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"banner-top inner-head\">\r\n");
      out.write("            <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("                            data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <div class=\"logo\">\r\n");
      out.write("                        <h1><a href=\"index.jsp\"><span>E</span> -Shop</a></h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--/.navbar-header-->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Men <b class=\"caret\"></b></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu multi-column columns-3\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-sm-4\">\r\n");
      out.write("                                        <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                            <h6>NEW IN</h6>\r\n");
      out.write("                                            <li><a href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">Laptops</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">New In Bags</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">New In Shoes</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">New In Watches</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">New In Grooming</a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-4\">\r\n");
      out.write("                                        <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                            <h6>CLOTHING</h6>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Polos & Tees</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Casual Shirts</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Casual Trousers</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Jeans</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Shorts & 3/4th</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Formal Shirts</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Formal Trousers</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Suits & Blazers</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Track Wear</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Inner Wear</a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-4\">\r\n");
      out.write("                                        <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                            <h6>WATCHES</h6>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Analog</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Chronograph</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Digital</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Watch Cases</a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"clearfix\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">women <b class=\"caret\"></b></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu multi-column columns-3\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-sm-4\">\r\n");
      out.write("                                        <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                            <h6>NEW IN</h6>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">New In Clothing</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">New In Bags</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">New In Shoes</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">New In Watches</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">New In Beauty</a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-4\">\r\n");
      out.write("                                        <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                            <h6>CLOTHING</h6>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Polos & Tees</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Casual Shirts</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Casual Trousers</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Jeans</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Shorts & 3/4th</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Formal Shirts</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Formal Trousers</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Suits & Blazers</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Track Wear</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Inner Wear</a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-4\">\r\n");
      out.write("                                        <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                            <h6>WATCHES</h6>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Analog</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Chronograph</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Digital</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Watch Cases</a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"clearfix\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">kids <b class=\"caret\"></b></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu multi-column columns-2\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                            <h6>NEW IN</h6>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">New In Boys Clothing</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">New In Girls Clothing</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">New In Boys Shoes</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">New In Girls Shoes</a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                            <h6>ACCESSORIES</h6>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Bags</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Watches</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Sun Glasses</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Jewellery</a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"clearfix\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"typography.jsp\">TYPO</a></li>\r\n");
      out.write("                        <li><a href=\"contact.jsp\">CONTACT</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--/.navbar-collapse-->\r\n");
      out.write("            </nav>\r\n");
      out.write("            <!--/.navbar-->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tg_005flogIn_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tg:logIn
    org.apache.jsp.tag.weblogIn_tag _jspx_th_tg_005flogIn_005f0 = (new org.apache.jsp.tag.weblogIn_tag());
    _jsp_instancemanager.newInstance(_jspx_th_tg_005flogIn_005f0);
    _jspx_th_tg_005flogIn_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tg_005flogIn_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tg_005flogIn_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /header.jsp(59,57) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("catalog_servlet");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
