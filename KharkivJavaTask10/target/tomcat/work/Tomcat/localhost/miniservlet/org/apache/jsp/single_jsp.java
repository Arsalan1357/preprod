/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-12-20 09:25:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <title>Eshop a Flat E-Commerce Bootstrap Responsive Website Template | Single :: w3layouts</title>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />    \r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("    \r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"js/simpleCart.min.js\"></script>\r\n");
      out.write("    <script type=\"application/x-javascript\" src=\"js/addHandlerLoad.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- content-section-starts -->\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"products-page\">\r\n");
      out.write("            <div class=\"products\">\r\n");
      out.write("                <div class=\"product-listy\">\r\n");
      out.write("                    <h2>our Products</h2>\r\n");
      out.write("                    <ul class=\"product-list\">\r\n");
      out.write("                        <li><a href=\"\">New Products</a></li>\r\n");
      out.write("                        <li><a href=\"\">Old Products</a></li>\r\n");
      out.write("                        <li><a href=\"\">T-shirts</a></li>\r\n");
      out.write("                        <li><a href=\"\">pants</a></li>\r\n");
      out.write("                        <li><a href=\"\">Dress</a></li>\r\n");
      out.write("                        <li><a href=\"\">Shorts</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Shirts</a></li>\r\n");
      out.write("                        <li><a href=\"register.html\">Register</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"latest-bis\">\r\n");
      out.write("                    <img src=\"images/l4.jpg\" class=\"img-responsive\" alt=\"\" />\r\n");
      out.write("                    <div class=\"offer\">\r\n");
      out.write("                        <p>40%</p>\r\n");
      out.write("                        <small>Top Offer</small>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"tags\">\r\n");
      out.write("                    <h4 class=\"tag_head\">Tags Widget</h4>\r\n");
      out.write("                    <ul class=\"tags_links\">\r\n");
      out.write("                        <li><a href=\"#\">Kitesurf</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Super</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Duper</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Theme</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Men</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Women</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Equipment</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Best</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Accessories</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Men</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Apparel</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Super</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Duper</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Theme</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Responsive</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Women</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Equipment</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"new-product\">\r\n");
      out.write("                <div class=\"col-md-5 zoom-grid\">\r\n");
      out.write("                    <div class=\"flexslider\">\r\n");
      out.write("                        <ul class=\"slides\">\r\n");
      out.write("                            <li data-thumb=\"images/si.jpg\">\r\n");
      out.write("                                <div class=\"thumb-image\"><img src=\"images/si.jpg\" data-imagezoom=\"true\" class=\"img-responsive\" alt=\"\" /></div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li data-thumb=\"images/si1.jpg\">\r\n");
      out.write("                                <div class=\"thumb-image\"><img src=\"images/si1.jpg\" data-imagezoom=\"true\" class=\"img-responsive\" alt=\"\" /></div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li data-thumb=\"images/si2.jpg\">\r\n");
      out.write("                                <div class=\"thumb-image\"><img src=\"images/si2.jpg\" data-imagezoom=\"true\" class=\"img-responsive\" alt=\"\" /></div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-7 dress-info\">\r\n");
      out.write("                    <div class=\"dress-name\">\r\n");
      out.write("                        <h3>LOREM IPSUM DRESS</h3>\r\n");
      out.write("                        <span>$459.00</span>\r\n");
      out.write("                        <div class=\"clearfix\"></div>\r\n");
      out.write("                        <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo</p>\r\n");
      out.write("                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"span span1\">\r\n");
      out.write("                        <p class=\"left\">FABRIC ORIGIN</p>\r\n");
      out.write("                        <p class=\"right\">Japan</p>\r\n");
      out.write("                        <div class=\"clearfix\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"span span2\">\r\n");
      out.write("                        <p class=\"left\">MADE IN</p>\r\n");
      out.write("                        <p class=\"right\">China</p>\r\n");
      out.write("                        <div class=\"clearfix\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"span span3\">\r\n");
      out.write("                        <p class=\"left\">COLOR</p>\r\n");
      out.write("                        <p class=\"right\">White</p>\r\n");
      out.write("                        <div class=\"clearfix\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"span span4\">\r\n");
      out.write("                        <p class=\"left\">SIZE</p>\r\n");
      out.write("                        <p class=\"right\"><span class=\"selection-box\"><select class=\"domains valid\" name=\"domains\">\r\n");
      out.write("                         <option>M</option>\r\n");
      out.write("                         <option>L</option>\r\n");
      out.write("                         <option>XL</option>\r\n");
      out.write("                         <option>FS</option>\r\n");
      out.write("                         <option>S</option>\r\n");
      out.write("                     </select></span></p>\r\n");
      out.write("                     <div class=\"clearfix\"></div>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <div class=\"purchase\">\r\n");
      out.write("                    <a href=\"#\">Purchase Now</a>\r\n");
      out.write("                    <div class=\"social-icons\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a class=\"facebook1\" href=\"#\"></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a class=\"twitter1\" href=\"#\"></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a class=\"googleplus1\" href=\"#\"></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clearfix\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <script src=\"js/imagezoom.js\"></script>\r\n");
      out.write("                <!-- FlexSlider -->\r\n");
      out.write("                <script defer src=\"js/jquery.flexslider.js\"></script>\r\n");
      out.write("                <script>\r\n");
      out.write("                        // Can also be used with $(document).ready()\r\n");
      out.write("                        $(window).load(function() {\r\n");
      out.write("                            $('.flexslider').flexslider({\r\n");
      out.write("                                animation: \"slide\",\r\n");
      out.write("                                controlNav: \"thumbnails\"\r\n");
      out.write("                            });\r\n");
      out.write("                        });\r\n");
      out.write("                    </script>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clearfix\"></div>\r\n");
      out.write("                <div class=\"reviews-tabs\">\r\n");
      out.write("                    <!-- Main component for a primary marketing message or call to action -->\r\n");
      out.write("                    <ul class=\"nav nav-tabs responsive hidden-xs hidden-sm\" id=\"myTab\">\r\n");
      out.write("                        <li class=\"test-class active\"><a class=\"deco-none misc-class\" href=\"#how-to\"> More Information</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"test-class\"><a href=\"#features\">Specifications</a></li>\r\n");
      out.write("                        <li class=\"test-class\"><a class=\"deco-none\" href=\"#source\">Reviews (7)</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"tab-content responsive hidden-xs hidden-sm\">\r\n");
      out.write("                        <div class=\"tab-pane active\" id=\"how-to\">\r\n");
      out.write("                            <p class=\"tab-text\">Maecenas mauris velit, consequat sit amet feugiat rit, elit vitaeert scelerisque elementum, turpis nisl accumsan ipsum Lorem Ipsum is simply dummy text of the printing and typesetting industry. and scrambled it to make a type\r\n");
      out.write("                                specimen book. It has survived Auction your website on Flippa and you'll get the best price from serious buyers, dedicated support and a much better deal than you'll find with any website broker. Sell your site today I\r\n");
      out.write("                                need a twitter bootstrap 3.0 theme for the full-calendar plugin. it would be great if the theme includes the add event; remove event, show event details. this must be RESPONSIVE and works on mobile devices. Also, I've seen\r\n");
      out.write("                                so many bootstrap themes that comes up with the fullcalendar plugin. However these . </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"tab-pane\" id=\"features\">\r\n");
      out.write("                                <p class=\"tab-text\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum nibh urna, euismod ut ornare non, volutpat vel tortor. Integer laoreet placerat suscipit. Sed sodales scelerisque commodo. Nam porta cursus lectus. Proin nunc\r\n");
      out.write("                                    erat, gravida a facilisis quis, ornare id lectus. Proin consectetur nibh quis urna gravida mollis.This tab has icon in consectetur adipiscing eliconse consectetur adipiscing elit. Vestibulum nibh urna, ctetur adipiscing\r\n");
      out.write("                                    elit. Vestibulum nibh urna, t.consectetur adipiscing elit. Vestibulum nibh urna, Vestibulum nibh urna,it.</p>\r\n");
      out.write("                                    <p class=\"tab-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit,There are many variations of passages of Lorem Ipsum available, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"tab-pane\" id=\"source\">\r\n");
      out.write("                                    <div class=\"response\">\r\n");
      out.write("                                        <div class=\"media response-info\">\r\n");
      out.write("                                            <div class=\"media-left response-text-left\">\r\n");
      out.write("                                                <a href=\"#\">\r\n");
      out.write("                                                    <img class=\"media-object\" src=\"images/icon1.png\" alt=\"\" />\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                                <h5><a href=\"#\">Username</a></h5>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"media-body response-text-right\">\r\n");
      out.write("                                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,There are many variations of passages of Lorem Ipsum available, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("                                                <ul>\r\n");
      out.write("                                                    <li>MARCH 21, 2015</li>\r\n");
      out.write("                                                    <li><a href=\"single.html\">Reply</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"clearfix\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"media response-info\">\r\n");
      out.write("                                            <div class=\"media-left response-text-left\">\r\n");
      out.write("                                                <a href=\"#\">\r\n");
      out.write("                                                    <img class=\"media-object\" src=\"images/icon1.png\" alt=\"\" />\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                                <h5><a href=\"#\">Username</a></h5>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"media-body response-text-right\">\r\n");
      out.write("                                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,There are many variations of passages of Lorem Ipsum available, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("                                                <ul>\r\n");
      out.write("                                                    <li>MARCH 26, 2054</li>\r\n");
      out.write("                                                    <li><a href=\"single.html\">Reply</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"clearfix\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"media response-info\">\r\n");
      out.write("                                            <div class=\"media-left response-text-left\">\r\n");
      out.write("                                                <a href=\"#\">\r\n");
      out.write("                                                    <img class=\"media-object\" src=\"images/icon1.png\" alt=\"\" />\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                                <h5><a href=\"#\">Username</a></h5>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"media-body response-text-right\">\r\n");
      out.write("                                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,There are many variations of passages of Lorem Ipsum available, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("                                                <ul>\r\n");
      out.write("                                                    <li>MAY 25, 2015</li>\r\n");
      out.write("                                                    <li><a href=\"single.html\">Reply</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"clearfix\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"media response-info\">\r\n");
      out.write("                                            <div class=\"media-left response-text-left\">\r\n");
      out.write("                                                <a href=\"#\">\r\n");
      out.write("                                                    <img class=\"media-object\" src=\"images/icon1.png\" alt=\"\" />\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                                <h5><a href=\"#\">Username</a></h5>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"media-body response-text-right\">\r\n");
      out.write("                                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,There are many variations of passages of Lorem Ipsum available, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("                                                <ul>\r\n");
      out.write("                                                    <li>FEB 13, 2015</li>\r\n");
      out.write("                                                    <li><a href=\"single.html\">Reply</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"clearfix\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"media response-info\">\r\n");
      out.write("                                            <div class=\"media-left response-text-left\">\r\n");
      out.write("                                                <a href=\"#\">\r\n");
      out.write("                                                    <img class=\"media-object\" src=\"images/icon1.png\" alt=\"\" />\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                                <h5><a href=\"#\">Username</a></h5>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"media-body response-text-right\">\r\n");
      out.write("                                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,There are many variations of passages of Lorem Ipsum available, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("                                                <ul>\r\n");
      out.write("                                                    <li>JAN 28, 2015</li>\r\n");
      out.write("                                                    <li><a href=\"single.html\">Reply</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"clearfix\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"media response-info\">\r\n");
      out.write("                                            <div class=\"media-left response-text-left\">\r\n");
      out.write("                                                <a href=\"#\">\r\n");
      out.write("                                                    <img class=\"media-object\" src=\"images/icon1.png\" alt=\"\" />\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                                <h5><a href=\"#\">Username</a></h5>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"media-body response-text-right\">\r\n");
      out.write("                                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,There are many variations of passages of Lorem Ipsum available, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("                                                <ul>\r\n");
      out.write("                                                    <li>APR 18, 2015</li>\r\n");
      out.write("                                                    <li><a href=\"single.html\">Reply</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"clearfix\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"media response-info\">\r\n");
      out.write("                                            <div class=\"media-left response-text-left\">\r\n");
      out.write("                                                <a href=\"#\">\r\n");
      out.write("                                                    <img class=\"media-object\" src=\"images/icon1.png\" alt=\"\" />\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                                <h5><a href=\"#\">Username</a></h5>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"media-body response-text-right\">\r\n");
      out.write("                                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,There are many variations of passages of Lorem Ipsum available, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("                                                <ul>\r\n");
      out.write("                                                    <li>DEC 25, 2014</li>\r\n");
      out.write("                                                    <li><a href=\"single.html\">Reply</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"clearfix\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clearfix\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"other-products products-grid\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <header>\r\n");
      out.write("                        <h3 class=\"like text-center\">Related Products</h3>\r\n");
      out.write("                    </header>\r\n");
      out.write("                    <div class=\"col-md-4 product simpleCart_shelfItem text-center\">\r\n");
      out.write("                        <a href=\"single.html\"><img src=\"images/p1.jpg\" alt=\"\" /></a>\r\n");
      out.write("                        <div class=\"mask\">\r\n");
      out.write("                            <a href=\"single.html\">Quick View</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a class=\"product_name\" href=\"single.html\">Sed ut perspiciatis</a>\r\n");
      out.write("                        <p><a class=\"item_add\" href=\"#\"><i></i> <span class=\"item_price\">$329</span></a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 product simpleCart_shelfItem text-center\">\r\n");
      out.write("                        <a href=\"single.html\"><img src=\"images/p2.jpg\" alt=\"\" /></a>\r\n");
      out.write("                        <div class=\"mask\">\r\n");
      out.write("                            <a href=\"single.html\">Quick View</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a class=\"product_name\" href=\"single.html\">great explorer</a>\r\n");
      out.write("                        <p><a class=\"item_add\" href=\"#\"><i></i> <span class=\"item_price\">$599.8</span></a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 product simpleCart_shelfItem text-center\">\r\n");
      out.write("                        <a href=\"single.html\"><img src=\"images/p3.jpg\" alt=\"\" /></a>\r\n");
      out.write("                        <div class=\"mask\">\r\n");
      out.write("                            <a href=\"single.html\">Quick View</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a class=\"product_name\" href=\"single.html\">similique sunt</a>\r\n");
      out.write("                        <p><a class=\"item_add\" href=\"#\"><i></i> <span class=\"item_price\">$359.6</span></a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clearfix\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- content-section-ends -->\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <script src=\"js/responsive-tabs.js\"></script>\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("                $('#myTab a').click(function(e) {\r\n");
      out.write("                    e.preventDefault();\r\n");
      out.write("                    $(this).tab('show');\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                $('#moreTabs a').click(function(e) {\r\n");
      out.write("                    e.preventDefault();\r\n");
      out.write("                    $(this).tab('show');\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                (function($) {\r\n");
      out.write("            // Test for making sure event are maintained\r\n");
      out.write("            $('.js-alert-test').click(function() {\r\n");
      out.write("                alert('Button Clicked: Event was maintained');\r\n");
      out.write("            });\r\n");
      out.write("            fakewaffle.responsiveTabs(['xs', 'sm']);\r\n");
      out.write("        })(jQuery);\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
}
