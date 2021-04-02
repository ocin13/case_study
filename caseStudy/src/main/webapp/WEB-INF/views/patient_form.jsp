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
    <link href="/css/patient.css" rel="stylesheet" />
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
            <div class="col-10 col-md-10 mx-auto p-md-5 dashboard">
              <div class="row">
               <c:if test="${patient == null }">
	               	 <h2>add Patient</h2>
	               	 <div style="color:#09d6a7;"><p>${message}</p></div>
	            </div>
	            <div class="row py-5">
                <form enctype="multipart/form-data" action="addPatient" method="POST" class="row">
               </c:if>
               <c:if test="${patient != null }">
               		<h2>edit Patient information</h2>
	               	 <div><p>${message}</p></div>
	            </div>
	            <div class="row py-5">
                <form enctype="multipart/form-data" action="editPatient" method="POST" class="row">
				<input type="hidden" name="pId" value="<c:out value='${patient.getpId()}' />" />
               </c:if>
                    <div class="col-12 col-md-6 py-2">
                        <label for="PatientFirstName" class="form-label">first name</label>
                        <input type="text" name="firstName" value="${patient.firstName }" class="form-control" id="PatientFirstName"  required/>
                    </div>
                    <div class="col-12 col-md-6 py-2">
                        <label for="PatientLastName" class="form-label">Last name</label>
                        <input type="text" name="lastName" value="${patient.lastName }" class="form-control" id="PatientLastName"  required/>
                    </div>

                    <div class="col-12 col-md-6 py-2">
                        <label for="PatientUserName" class="form-label">user name</label>
                        <input type="text" name="userName" value="${patient.userName }" class="form-control" id="PatientUsername"  required/>
                    </div>
                    <div class="col-12 col-md-6 py-2">
                        <label for="PatientEmail" class="form-label">email</label>
                        <input type="email" name="email" value="${patient.email }" class="form-control" id="PatientEmail"  required/>
                    </div>

                    <div class="col-12 col-md-6 py-2">
                        <label for="PatientPassword" class="form-label">password</label>
                        <input type="text" name="password" value="${patient.password }" class="form-control" id="PatientPassword"  required/>
                    </div>
                    <div class="col-12 col-md-6 py-2">
                        <label for="PatientConfirmPassword" class="form-label">confirm password</label>
                        <input type="text" class="form-control" id="PatientConfirmPassword"  required/>
                    </div>

                    <div class="col-12 col-md-6 py-2">
                        <label for="PatientBirthDate" class="form-label">birth date</label>
                        <input type="date" name="dateOfBirth" value="${ patient.dateOfBirth}" class="form-control" id="PatientBirthDate"  required/>
                    </div>
                    <div class="col-12 col-md-6 py-2">
                        <label for="PatientGender" class="form-label">gender</label>
                        <select class="form-select" name="gender" value="${patient.gender }" aria-label="Select Gender" id="PatientGender">
                            <option selected>Select Gender</option>
                            <option value="male">male</option>
                            <option value="femele">femele</option>
                            <option value="unknown">unknown</option>
                          </select>
                    </div>

                    <div class="col-12 col-md-6 py-2">
                        <label for="PatientAdress" class="form-label">Address</label>
                        <input type="text" name="street" value="${patient.street }" class="form-control" id="PatientAdress" placeholder="1234 Main St" required>
                    </div>
                      <div class="col-12 col-md-6 py-2">
                        <label for="inputAddress2" class="form-label">Address 2</label>
                        <input type="text" name="apt" value="${patient.apt }" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor" required>
                      </div>
                      <div class="col-12 col-md-6 py-2">
                        <label for="PatientCity" class="form-label">City</label>
                        <input type="text" name="city" value="${patient.city }" class="form-control" id="PatientCity" required>
                      </div>
                      <div class="col-6 col-md-4 py-2">
                        <label for="PatientState" class="form-label">State</label>
                        <input type="text" name="state" value="${patient.state }" id="PatientState" class="form-control"  required/>
                      </div>
                      <div class="col-6 col-md-2 py-2">
                        <label for="PatientZip" class="form-label">Zip</label>
                        <input type="number" name="zip" value="${patient.zip }" class="form-control" id="PatientZip" required>
                      </div>
                      <div class="col-12 col-md-6 py-2">
                        <label for="PatientPhone" class="form-label">phone</label>
                        <input type="tel" name="phone" value="${patient.phone }" class="form-control" id="PatientPhone"  required/>
                    </div>
                    <div class="col-12 col-md-6 py-2">
                        <label for="Patientpicture" class="form-label">profile picture</label>
                        <input type="file" name="file" class="form-control" id="Patientpicture" accept="*" />
                    </div>
                      <div class="col-12 py-2">
                        <button type="submit" class="btn btn-primary" id="registerPatBtn">Register</button>
                      </div>
                </form>
            </div>
        </div>  
        

    </div>
    <!--bootstrap js-->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js" integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js" integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG" crossorigin="anonymous"></script>
    <!--chart maker-->
    <script src="https://cdn.jsdelivr.net/npm/apexcharts"></script>

    <script src="/js/navbar.js"></script>
    <script src="/js/scripts.js"></script>
    
  </body>
</html>