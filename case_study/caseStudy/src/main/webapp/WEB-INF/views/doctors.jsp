<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="/icons/3022339-hospital/png/hospital.png" type="image/png" sizes="16x16">
    <!--css files refrences-->
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
    <link href="/css/doctors.css" rel="stylesheet" />
    <link href="/css/navbar.css" rel="stylesheet" />
    <title>NanoCare</title>
</head>
<body>
    <div class="container-fluid mx-0 px-0">
        <!--********navbar_starts***********-->
       <jsp:include page="navbar.jsp"></jsp:include>
        <!--********navbar_ends*************-->
        <div class="row">
            <div class="col-8 col-md-2 py-3" id="side-menu-box">
                <!--********side_menu*************-->
               <jsp:include page="side_navbar.jsp"></jsp:include>
                <!--********end_sidemenu*************-->
            </div>
            <div class="col-12 col-md-10 py-5 dashboard">
              <div class="row mb-5">
                <div class="col-6 col-md-10">
                  <h3>doctors list</h3>
                </div>
                <div class="col-6 col-md-2 ">
                  <button class="btn btn-success py-2 px-3" id="addDocBtn" onclick="window.location='./newDoctor'"><i class="fa fa-plus"></i> Add Doctor</button>
                </div>
              </div>
              <div class="row doctorsList">
              
              
				
					<c:forEach items="${doctorsList}" var="doctor">
						<div class="col-12 col-md-3">
							<div class="doctor-cart  m-2">
								<div class="dropdown">
								  <button class="btn btn-default dropdown-toggle" type="button" id="dropDownOptionsForDoctors" data-bs-toggle="dropdown" aria-expanded="false">
								    <i class="fa fa-ellipsis-h" aria-hidden="true"></i>
								  </button>
								  <ul class="dropdown-menu px-3" aria-labelledby="dropDownOptionsForDoctors">
								    <li><a style="color:black;text-decoration:none;" href="${request.getContextPath()}editDoctor${doctor.getDocId()}"><i class="fa fa-pencil"></i> Edit</a></li>
								    <li><a style="color:black;text-decoration:none;" href="${request.getContextPath()}deleteDoctor${doctor.getDocId()}"><i class="fa fa-trash"></i> Delete</a></li>
								  </ul>
								</div>
								<div class="doc-info text-center py-3">
									<img   src="/uploads/${doctor.getFileName()}" alt="doctor's picture"  style="border-radius:50%;width:200px;height:200px;" class="img-fluid"/>
									<h6 class="mt-4" style="letter-spacing:3px;">Dr.${doctor.getLastName()}</h6>
									<p class=" pb-4"><strong>${doctor.speciality }</strong></p>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
            </div>
        </div>  
        

    </div>
    <!--bootstrap js-->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js" integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js" integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG" crossorigin="anonymous"></script>
    <!--chart maker-->
    <script src="https://cdn.jsdelivr.net/npm/apexcharts"></script>

    <script src="/js/scripts.js"></script>
    <script src="/js/navbar.js"></script>
  </body>
</html>