/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-09-14 05:53:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/views/board/../layouts/menu.jsp", Long.valueOf(1694484920661L));
    _jspx_dependants.put("jar:file:/C:/Users/HAYE/Desktop/haye/backend_workspace/04_spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ex02/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1693544777586L));
    _jspx_dependants.put("/WEB-INF/views/board/../layouts/footer.jsp", Long.valueOf(1694403294472L));
    _jspx_dependants.put("jar:file:/C:/Users/HAYE/Desktop/haye/backend_workspace/04_spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ex02/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/board/../layouts/header.jsp", Long.valueOf(1694485983402L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

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
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<title>Document</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/main.css\" />\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<header class=\"jumbotron mb-0 rounded-0\">\r\n");
      out.write("			<h1>Backend Study</h1>\r\n");
      out.write("			<p>자바 기반의 백엔드 기술을 배웁니다.</p>\r\n");
      out.write("		</header>\r\n");
      out.write("\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("<nav\r\n");
      out.write("	class=\"navbar navbar-expand-md bg-primary navbar-dark sticky-top mb-5\">\r\n");
      out.write("	<a class=\"navbar-brand\" href=\"#\"> <i class=\"fa-solid fa-house\"></i>\r\n");
      out.write("		Backend\r\n");
      out.write("	</a>\r\n");
      out.write("	<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("		data-target=\"#collapsibleNavbar\">\r\n");
      out.write("		<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("	</button>\r\n");
      out.write("	<div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\r\n");
      out.write("		<!-- 좌측 메뉴 구성 -->\r\n");
      out.write("		<ul class=\"navbar-nav\">\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">메뉴1</a></li>\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">메뉴2</a></li>\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">메뉴3</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("\r\n");
      out.write("		<!-- 우측 메뉴 -->\r\n");
      out.write("		<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"> <img\r\n");
      out.write("					src=\"https://randomuser.me/api/portraits/women/12.jpg\"\r\n");
      out.write("					class=\"avatar-sm\" /> diode\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"> <i\r\n");
      out.write("					class=\"fa-solid fa-right-from-bracket\"></i> 로그아웃\r\n");
      out.write("			</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"/resources/css/summernote/summernote-lite.min.css\">\r\n");
      out.write("<script src=\"/resources/js/summernote/summernote-lite.min.js\"></script>\r\n");
      out.write("<script src=\"/resources/js/summernote/lang/summernote-ko-KR.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	$(document).ready(function() {\r\n");
      out.write("		$('#content').summernote({ //jQuery Plugin < 해당 기능 확장\r\n");
      out.write("			height : 300, // 에디터 높이\r\n");
      out.write("			focus : true, // 에디터 로딩후 포커스를 맞출지 여부\r\n");
      out.write("			lang : \"ko-KR\", // 한글 설정\r\n");
      out.write("		});\r\n");
      out.write("		$('.get').click(function() {\r\n");
      out.write("			document.forms.getForm.submit();\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("	// 기본 글꼴 설정\r\n");
      out.write("	$('#summernote').summernote('fontName', 'Arial');\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1 class=\"page-header\">\r\n");
      out.write("	<i class=\"far fa-edit\"></i>Board Modification\r\n");
      out.write("</h1>\r\n");
      out.write("<div class=\"panel panel-default\">\r\n");
      out.write("	<div class=\"panel-body\">\r\n");
      out.write("		<form role=\"form\" method=\"post\"> \r\n");
      out.write("			\r\n");
      out.write("			 <input type=\"hidden\" name=\"bno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("			 \r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("				<label>Title</label> <input name=\"title\" class=\"form-control\"\r\n");
      out.write("					value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("				<label>Writer</label> <input name=\"writer\" class=\"form-control\"\r\n");
      out.write("					value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.writer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("				<label>Content</label>\r\n");
      out.write("				<textarea name=\"content\" class=\"form-control\" id=\"content\" rows=\"10\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<button type=\"submit\" class=\"btn btn-primary\">\r\n");
      out.write("				<i class=\"fas fa-check\"></i>확인\r\n");
      out.write("			</button>\r\n");
      out.write("			<button type=\"reset\" class=\"btn btn-primary\">\r\n");
      out.write("				<i class=\"fas fa-undo\"></i>취소\r\n");
      out.write("			</button>\r\n");
      out.write("			<a href=\"#\" class=\"btn btn-primary get\"> <i\r\n");
      out.write("				class=\"fas fa-list\"></i>돌아가기\r\n");
      out.write("			</a>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<form id=\"getForm\" action=\"/board/get\" method=\"get\">\r\n");
      out.write("	<input type=\"hidden\" id=\"bno\" name=\"bno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /> \r\n");
      out.write("	\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <footer class=\"text-center p-3 footer mt-5\">\r\n");
      out.write("        <i class=\"fa-regular fa-copyright\"></i>\r\n");
      out.write("        2023.7 created by java-backend\r\n");
      out.write("      </footer>\r\n");
      out.write("    </div>  <!-- end of .container -->\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
