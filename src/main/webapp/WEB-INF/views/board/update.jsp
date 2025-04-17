<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/templates/header.jsp"></c:import>
</head>
<body id="page-top">

<!-- Page Wrapper -->
<div id="wrapper">
<c:import url="/WEB-INF/views/templates/sidebar.jsp"></c:import>
	<!-- Content Wrapper -->
   	<div id="content-wrapper" class="d-flex flex-column">	
		<!-- Main Content -->
    	<div id="content">
     	<c:import url="/WEB-INF/views/templates/topbar.jsp"></c:import>
     	
			<!-- content  /.container-fluid  -->
	    	<div class="container-fluid">
	    	
	    		<div class="col-lg-8">
				<!-- Post content-->
				<form action="./update" method="post">
                    <article>
                    <div class="card bg-light mb-5">
                    <div class="card-body">
                    <input type="hidden" name="boardNum" value="${vo.boardNum }">
                        <!-- Post header-->
                        <header class="mb-4">
                            <!-- Post title-->
                            <h1 class="fw-bolder mb-1">
                            	<input type="text" name="boardTitle" placeholder="${vo.boardTitle }" value="${vo.boardTitle }">
                            </h1>
                            <!-- Post meta content-->
                        </header>
                        <!-- Post content-->
                        <section class="mb-5">
                            <p class="fs-5 mb-4">
                            	<textarea rows="20" cols="115" name="boardContents" placeholder="${vo.boardContents }">${vo.boardContents }</textarea>
                            </p>
                        </section>
                    </div>
                    </div>
                    </article>
                    <div class="row">
                    	<div class="col-10"></div>
                    	<div class="col-2">
                    		<button class="btn btn-primary" type="submit">작성하기</button>
                    	</div>
                    </div>
				</form>
	    		</div>
	    	</div>
	    	
		</div>
    	<!-- End of Main Content -->
	<c:import url="/WEB-INF/views/templates/contentFooter.jsp"></c:import>
	</div>
    <!-- End of Content Wrapper -->
</div>
<!-- End of Page Wrapper -->
    
	
<c:import url="/WEB-INF/views/templates/footer.jsp"></c:import>
</body>
</html>