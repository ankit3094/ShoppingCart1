<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>shopping cart</title>
</head>
<body>
<center>
<h1>ShoppingCart</h1>

<h3> ${msg} </h3>

<h3> ${successMessage} </h3>

<h3> ${errorMessage} </h3>


${loginMessgae}
<hr>


<jsp:include page="CategoryMenu.jsp"></jsp:include>
<!--wrappper for slide-->
												<div id="myCarousel" class="carousel slide"
													data-ride="carousel">
													<!-- Indicators -->
													<ol class="carousel-indicators">
														<li data-target="#myCarousel" data-slide-to="0"
															class="active"></li>
														<li data-target="#myCarousel" data-slide-to="1"></li>
														<li data-target="#myCarousel" data-slide-to="2"></li>
													</ol>

													<!-- Wrapper for slides -->
													<div class="carousel-inner" role="listbox">
														<div class="item active">
															<img class="slide-image" src="Resources/img/1.jpg"
																alt="img-responsive">
														</div>

														<div class="item">
															<img class="slide-image" src="Resources/img/2.jpg"
																alt="img-responsive">
														</div>

														<div class="item">
															<img class="slide-image" src="Resources/img/design2.jpg"
																alt="img-responsive">
														</div>
														<div class="item">
															<img class="slide-image" src="Resources/img/3.jpg"
																alt="img-responsive">
														</div>
														

													</div>

													<!-- Left and right controls -->
													<a class="left carousel-control" href="#myCarousel"
														role="button" data-slide="prev"> <span
														class="glyphicon glyphicon-chevron-left"
														aria-hidden="true"></span> <span class="sr-only">Previous</span>
													</a> <a class="right carousel-control" href="#myCarousel"
														class="glyphicon glyphicon-chevron-right"
														aria-hidden="true"></span> <span class="sr-only">Next</span>
													</a>
												</div>


												<br>
<br>
<jsp:include page="CategoryMenu2.jsp"></jsp:include>
<br>


<c:if test="${empty loginMessage }">
<a href="login">Login </a><br>
</c:if>

<c:if test="${not empty loginMessage }">
<a href="logout">Logout </a><br>
<a href="mycart"> MyCarts </a>
</c:if>




<a href="register">Register </a><br>





      <c:if test="${isUserClickedLogin==true}">
        <jsp:include page="Login.jsp"></jsp:include><br>
      </c:if>
      
      
       <c:if test="${not empty errorMessage}">
        <jsp:include page="Login.jsp"></jsp:include><br>
      </c:if>
      


<c:if test="${isUserClickedRegister==true}">
         <jsp:include page="Register.jsp"></jsp:include>
</c:if>


<br>
<br>


												</center>
												
</body>
</html>