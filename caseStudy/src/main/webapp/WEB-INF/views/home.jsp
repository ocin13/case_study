<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="/icons/3022339-hospital/png/hospital.png" type="image/png" sizes="16x16">
    <!--css files refrences-->
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
    <link href="/css/home.css" rel="stylesheet" />
    <link href="/css/navbar.css" rel="stylesheet" />
    <title>NanoCare</title>
</head>
<body>
    <div class="container-fluid mx-0 px-0">
        <!--********navbar_starts***********-->
       	<jsp:include page="navbar.jsp" />
        <!--********navbar_ends*************-->
        <div class="row">
            <div class="col-8 col-md-2 py-3" id="side-menu-box">
                <!--********side_menu*************-->
              
               <%@ include file="side_navbar.jsp" %>
                <!--********end_sidemenu*************-->
            </div>
            <div class="col-12 col-md-10 px-3 py-3 mx-auto" id="dashboard" >
              <!--********summary*************-->
              <div class="row summary">
                <div class="col-12 col-md-3">
                  <div class="info row align-items-center py-3 px-2">
                    <div class="col-6">
                      <h1><i class="fa fa-user-md"></i></h1>
                    </div>
                    <div class="col-6">
                      <h2>185</h2>
                      <div class="label-job-title">
                        <p>doctors  <i class="fa fa-check-circle"></i></p>
                      </div>
                    </div>
                  </div>
                </div>

                <div class="col-12 col-md-3">
                  <div class="info row align-items-center py-3 px-2">
                    <div class="col-6">
                      <h1><i class="fa fa-users"></i></h1>
                    </div>
                    <div class="col-6">
                      <h2>1595</h2>
                      <div class="label-job-title">
                        <p>patients <i class="fa fa-check-circle"></i></p>
                      </div>
                    </div>
                  </div>
                </div>

                <div class="col-12 col-md-3">
                  <div class="info row align-items-center py-3 px-2">
                    <div class="col-6">
                      <h1><i class="fa fa-heartbeat"></i></h1>
                    </div>
                    <div class="col-6">
                      <h2>201</h2>
                      <div class="label-job-title">
                        <p>deaths  <i class="fa fa-check-circle"></i></p>
                      </div>
                    </div>
                  </div>
                </div>

                <div class="col-12 col-md-3">
                  <div class="info row align-items-center py-3 px-2">
                    <div class="col-6">
                      <h1><i class="fa fa-hourglass-half"></i></h1>
                    </div>
                    <div class="col-6">
                      <h2>495</h2>
                      <div class="label-job-title">
                        <p>pending  <i class="fa fa-check-circle"></i></p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <!--********end_summary*************-->
              <div class="row py-3">
                <div class="col-12 col-md-6 p-3" id="chart1">
                  
                </div>
                <div class="col-12 col-md-6 p-3"  id="chart2">
                  
                </div>
              </div>
              <!--********#############################*************-->
              <div class="row py-5">
                <div class="col-12 col-md-7 appointement-list">
                  <table class="table table-hover">
                    <thead>
                      <tr>
                        <th scope="col"><h4>upcoming appointement</h4></th>
                        <th scope="col"></th>
                        <th scope="col"></th>
                        <th scope="col"><button class="btn btn-primary">View All</button></th>
                      </tr>
                    </thead>
                    <tbody class="dashboardAppointementTable">
                      <tr>
                        <th scope="row"><div class="row align-items-center"><div class="col-2"><img src="../../shared/icons/3022339-hospital/png/002-nurse.png" height="25px" width="25px" style="border-radius: 50%;" /></div><div class="col-10"><h6>zindine zidane</h6><p>new york city NY</p></div></div></th>
                        <td><h6>appointement with</h6><p>dr mark zuklee</p></td>
                        <td>07:00am</td>
                        <td><button type="button" class="btn btn-outline-primary">take up</button></td>
                      </tr>
                      <tr>
                        <th scope="row"><div class="row align-items-center"><div class="col-2"><img src="../../shared/icons/3022339-hospital/png/002-nurse.png" height="25px" width="25px" style="border-radius: 50%;" /></div><div class="col-10"><h6>zindine zidane</h6><p>new york city NY</p></div></div></th>
                        <td><h6>appointement with</h6><p>dr mark zuklee</p></td>
                        <td>07:00am</td>
                        <td><button type="button" class="btn btn-outline-primary">take up</button></td>
                      </tr>
                      <tr>
                        <th scope="row"><div class="row align-items-center"><div class="col-2"><img src="../../shared/icons/3022339-hospital/png/002-nurse.png" height="25px" width="25px" style="border-radius: 50%;" /></div><div class="col-10"><h6>zindine zidane</h6><p>new york city NY</p></div></div></th>
                        <td><h6>appointement with</h6><p>dr mark zuklee</p></td>
                        <td>07:00am</td>
                        <td><button type="button" class="btn btn-outline-primary">take up</button></td>
                      </tr>
                      <tr>
                        <th scope="row"><div class="row align-items-center"><div class="col-2"><img src="../../shared/icons/3022339-hospital/png/002-nurse.png" height="25px" width="25px" style="border-radius: 50%;" /></div><div class="col-10"><h6>zindine zidane</h6><p>new york city NY</p></div></div></th>
                        <td><h6>appointement with</h6><p>dr mark zuklee</p></td>
                        <td>07:00am</td>
                        <td><button type="button" class="btn btn-outline-primary">take up</button></td>
                      </tr>
                      <tr>
                        <th scope="row"><div class="row align-items-center"><div class="col-2"><img src="../../shared/icons/3022339-hospital/png/002-nurse.png" height="25px" width="25px" style="border-radius: 50%;" /></div><div class="col-10"><h6>zindine zidane</h6><p>new york city NY</p></div></div></th>
                        <td><h6>appointement with</h6><p>dr mark zuklee</p></td>
                        <td>07:00am</td>
                        <td><button type="button" class="btn btn-outline-primary">take up</button></td>
                      </tr>
                    </tbody>
                  </table>
                </div>
                <div class="col-12 col-md-5">
                  <div class="doctors-list">
                    <h3>doctors</h3>
                  <ul class="list-group list-group-flush">
                    <li class="list-group-item"><div class="row align-items-center"><div class="col-2"><img src="../../shared/icons/3022339-hospital/png/001-doctor.png" height="50px" width="50px" style="border-radius: 50%;" /></div><div class="col-10"><h6>zindine zidane</h6><p>md generalist</p></div></div></li>
                    <li class="list-group-item"><div class="row align-items-center"><div class="col-2"><img src="../../shared/icons/3022339-hospital/png/001-doctor.png" height="50px" width="50px" style="border-radius: 50%;" /></div><div class="col-10"><h6>zindine zidane</h6><p>md generalist</p></div></div></li>
                    <li class="list-group-item"><div class="row align-items-center"><div class="col-2"><img src="../../shared/icons/3022339-hospital/png/001-doctor.png" height="50px" width="50px" style="border-radius: 50%;" /></div><div class="col-10"><h6>zindine zidane</h6><p>md generalist</p></div></div></li>
                    <li class="list-group-item"><div class="row align-items-center"><div class="col-2"><img src="../../shared/icons/3022339-hospital/png/001-doctor.png" height="50px" width="50px" style="border-radius: 50%;" /></div><div class="col-10"><h6>zindine zidane</h6><p>md generalist</p></div></div></li>
                    <li class="list-group-item"><div class="row align-items-center"><div class="col-2"><img src="../../shared/icons/3022339-hospital/png/001-doctor.png" height="50px" width="50px" style="border-radius: 50%;" /></div><div class="col-10"><h6>zindine zidane</h6><p>md generalist</p></div></div></li>
                    <li class="list-group-item"><div class="row align-items-center"><div class="col-2"><img src="../../shared/icons/3022339-hospital/png/001-doctor.png" height="50px" width="50px" style="border-radius: 50%;" /></div><div class="col-10"><h6>zindine zidane</h6><p>md generalist</p></div></div></li>
                  </ul>
                  </div>
                </div>
              </div>
              <!--********#############################*************-->
              <div class="row py-5">
                <div class="col-12 col-md-7 newPatientList">
                  <table class="table table-hover">
                    <thead>
                      <tr>
                        <th scope="col"><h4>new patients</h4></th>
                        <th scope="col"></th>
                        <th scope="col"></th>
                        <th scope="col"><button class="btn btn-primary">View All</button></th>
                      </tr>
                    </thead>
                    <tbody class="dashboardNewPatientTable">
                      <tr>
                        <th scope="row"><div class="row align-items-center"><div class="col-2"><img src="../../shared/icons/3022339-hospital/png/002-nurse.png" height="25px" width="25px" style="border-radius: 50%;" /></div><div class="col-10"><h6>zindine zidane</h6></div></div></th>
                        <td><h6>zidane@gmail.com</h6></td>
                        <td>+1 552 663 0021</td>
                        <td><button type="button" class="btn btn-outline-warning">fever</button></td>
                      </tr>
                      <tr>
                        <th scope="row"><div class="row align-items-center"><div class="col-2"><img src="../../shared/icons/3022339-hospital/png/002-nurse.png" height="25px" width="25px" style="border-radius: 50%;" /></div><div class="col-10"><h6>zindine zidane</h6></div></div></th>
                        <td><h6>zidane@gmail.com</h6></td>
                        <td>+1 552 663 0021</td>
                        <td><button type="button" class="btn btn-outline-warning">fever</button></td>
                      </tr>
                      <tr>
                        <th scope="row"><div class="row align-items-center"><div class="col-2"><img src="../../shared/icons/3022339-hospital/png/002-nurse.png" height="25px" width="25px" style="border-radius: 50%;" /></div><div class="col-10"><h6>zindine zidane</h6></div></div></th>
                        <td><h6>zidane@gmail.com</h6></td>
                        <td>+1 552 663 0021</td>
                        <td><button type="button" class="btn btn-outline-warning">fever</button></td>
                      </tr>
                      <tr>
                        <th scope="row"><div class="row align-items-center"><div class="col-2"><img src="../../shared/icons/3022339-hospital/png/002-nurse.png" height="25px" width="25px" style="border-radius: 50%;" /></div><div class="col-10"><h6>zindine zidane</h6></div></div></th>
                        <td><h6>zidane@gmail.com</h6></td>
                        <td>+1 552 663 0021</td>
                        <td><button type="button" class="btn btn-outline-warning">fever</button></td>
                      </tr>
                      <tr>
                        <th scope="row"><div class="row align-items-center"><div class="col-2"><img src="../../shared/icons/3022339-hospital/png/002-nurse.png" height="25px" width="25px" style="border-radius: 50%;" /></div><div class="col-10"><h6>zindine zidane</h6></div></div></th>
                        <td><h6>zidane@gmail.com</h6></td>
                        <td>+1 552 663 0021</td>
                        <td><button type="button" class="btn btn-outline-warning">fever</button></td>
                      </tr>
                      <tr>
                        <th scope="row"><div class="row align-items-center"><div class="col-2"><img src="../../shared/icons/3022339-hospital/png/002-nurse.png" height="25px" width="25px" style="border-radius: 50%;" /></div><div class="col-10"><h6>zindine zidane</h6></div></div></th>
                        <td><h6>zidane@gmail.com</h6></td>
                        <td>+1 552 663 0021</td>
                        <td><button type="button" class="btn btn-outline-warning">fever</button></td>
                      </tr>
                      <tr>
                        <th scope="row"><div class="row align-items-center"><div class="col-2"><img src="../../shared/icons/3022339-hospital/png/002-nurse.png" height="25px" width="25px" style="border-radius: 50%;" /></div><div class="col-10"><h6>zindine zidane</h6></div></div></th>
                        <td><h6>zidane@gmail.com</h6></td>
                        <td>+1 552 663 0021</td>
                        <td><button type="button" class="btn btn-outline-warning">fever</button></td>
                      </tr>
                    </tbody>
                  </table>
                </div>
                <div class="col-12 col-md-5 text-center">
                  <h3>hospital management</h3>
                  <div class="row"  id="chart3"></div>
                  <div class="row">
                    <div class="col-6"  id="chart4"></div>
                    <div class="col-6"  id="chart5"></div>
                  </div>
                </div>
              </div>
            </div>
        </div>  
        

    </div>
    <!--bootstrap js-->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js" integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js" integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG" crossorigin="anonymous"></script>
    <!--chart maker-->
    <script src="https://cdn.jsdelivr.net/npm/apexcharts"></script>
    <script src="/js/navbar.js"></script>
    <script src="/js/home.js"></script>
  </body>
</html>