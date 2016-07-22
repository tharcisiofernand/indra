<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleServerInterfaceProxyid" scope="session" class="com.carmanager.server.ServerInterfaceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleServerInterfaceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleServerInterfaceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleServerInterfaceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.carmanager.server.ServerInterface getServerInterface10mtemp = sampleServerInterfaceProxyid.getServerInterface();
if(getServerInterface10mtemp == null){
%>
<%=getServerInterface10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        com.carmanager.server.Car[] getAllCars15mtemp = sampleServerInterfaceProxyid.getAllCars();
if(getAllCars15mtemp == null){
%>
<%=getAllCars15mtemp %>
<%
}else{
        String tempreturnp16 = null;
        if(getAllCars15mtemp != null){
        java.util.List listreturnp16= java.util.Arrays.asList(getAllCars15mtemp);
        tempreturnp16 = listreturnp16.toString();
        }
        %>
        <%=tempreturnp16%>
        <%
}
break;
case 18:
        gotMethod = true;
        String arg0_1id=  request.getParameter("arg035");
            java.lang.String arg0_1idTemp = null;
        if(!arg0_1id.equals("")){
         arg0_1idTemp  = arg0_1id;
        }
        com.carmanager.server.Car getOneCar18mtemp = sampleServerInterfaceProxyid.getOneCar(arg0_1idTemp);
if(getOneCar18mtemp == null){
%>
<%=getOneCar18mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">anoMod:</TD>
<TD>
<%
if(getOneCar18mtemp != null){
%>
<%=getOneCar18mtemp.getAnoMod()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">modelo:</TD>
<TD>
<%
if(getOneCar18mtemp != null){
java.lang.String typemodelo23 = getOneCar18mtemp.getModelo();
        String tempResultmodelo23 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemodelo23));
        %>
        <%= tempResultmodelo23 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">placa:</TD>
<TD>
<%
if(getOneCar18mtemp != null){
java.lang.String typeplaca25 = getOneCar18mtemp.getPlaca();
        String tempResultplaca25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeplaca25));
        %>
        <%= tempResultplaca25 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">oleokm:</TD>
<TD>
<%
if(getOneCar18mtemp != null){
%>
<%=getOneCar18mtemp.getOleokm()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">ano:</TD>
<TD>
<%
if(getOneCar18mtemp != null){
%>
<%=getOneCar18mtemp.getAno()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">cor:</TD>
<TD>
<%
if(getOneCar18mtemp != null){
java.lang.String typecor31 = getOneCar18mtemp.getCor();
        String tempResultcor31 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecor31));
        %>
        <%= tempResultcor31 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">chassi:</TD>
<TD>
<%
if(getOneCar18mtemp != null){
java.lang.String typechassi33 = getOneCar18mtemp.getChassi();
        String tempResultchassi33 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typechassi33));
        %>
        <%= tempResultchassi33 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>