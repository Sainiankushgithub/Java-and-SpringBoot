<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>User</title>
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous" />
  <!-- Font Awesome -->

  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
    integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
    crossorigin="anonymous" referrerpolicy="no-referrer" />

  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css"
    integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg=="
    crossorigin="anonymous" referrerpolicy="no-referrer" />

  <!-- Custom Styles -->
  <link rel="stylesheet" href="${pageContext.request.contextPath }/ConsultX/css/userStyle.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath }/ConsultX/css/style.css">

  <!-- Google Fonts -->
  <link rel="preconnect" href="https://fonts.googleapis.com" />
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
  <link href="https://fonts.googleapis.com/css2?family=Merriweather:wght@300;400;700&display=swap" rel="stylesheet" />

  <!-- AOS Link  -->
  <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet" />

  <!-- SWEET ALERT CDN LINK  -->
  <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>

  <style>
    body {
      background-color: white;
    }
  </style>
</head>

<body>
  <!-- Navbar -->
  <header>
    <nav class="navbar navbar-expand-lg navbar-dark fixed-top navbar-black">
      <div class="container-fluid">
        <a class="navbar-brand" href="${pageContext.request.contextPath }/home">
          <img class="img-fluid" src="${pageContext.request.contextPath }/ConsultX/images/consultX_logo3.png" alt="logo" />
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
          <ul class="navbar-nav ms-auto mb-2 mb-lg-0 fs-5 p-2">
            <li class="nav-item">
              <a class="nav-link" href="${pageContext.request.contextPath }/home">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="${pageContext.request.contextPath }/what_we_do.html">What we do</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="${pageContext.request.contextPath }/About.html">About us</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="${pageContext.request.contextPath }/contact.html">Contact Us</a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown">
                Our Services
              </a>
              <ul class="dropdown-menu dropdown-menu-dark bg-dark fs-6">
                <li><a class="dropdown-item" href="${pageContext.request.contextPath }/">Career</a></li>
                <li><a class="dropdown-item" href="${pageContext.request.contextPath }/">Education</a></li>
                <li><a class="dropdown-item" href="${pageContext.request.contextPath }/">Health Related</a></li>
              </ul>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle active" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown">
                User <i class="fas fa-user"></i>
              </a>
              <ul class="dropdown-menu dropdown-menu-dark bg-dark fs-6 dropdown-menu-end user-dropdown">
                <li>
                  <div class="d-flex flex-row">
                    <img src="${pageContext.request.contextPath }/ConsultX/images/client.png" alt="" class="ms-3 rounded me-2 border" style="width: 80px; height: 80px;">
                    <div class="ms-2 d-flex flex-column">
                      <span class="fw-bold">Ankush</span>
                      <span class="text-muted">+91 6006523043</span>
                      <span class="text-muted">john@gamil.com</span>
                    </div>
                  </div>
                </li>
                <li><a class="dropdown-item" href="${pageContext.request.contextPath }/">My account</a></li>
                <li><a class="dropdown-item" href="${pageContext.request.contextPath }/">View or update profile</a></li>
                <li><a class="dropdown-item" href="${pageContext.request.contextPath }/">Log out</a></li>
              </ul>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  </header>

  <div class="container-fluid pink">
    <div class="container mt-5">
      <div class="row pt-5">
        <div class="col-sm-12 col-md-6 col-lg-6 pt-4">
          <h2 class="h-color">Skip the hassle!</h2>
          <h2 class="h-color">Get expert guidance online – Career, Education & Health consultations starting at just
            ₹199.</h2>
          <div class="d-flex align-items-center mt-3">
            <!-- Overlapping Images -->
            <div class="d-flex overlap-images">
              <img src="${pageContext.request.contextPath }/ConsultX/images/card-2.jpg" alt="Doctor 1">
              <img src="${pageContext.request.contextPath }/ConsultX/images/card-5.jpg" alt="Doctor 2">
              <img src="${pageContext.request.contextPath }/ConsultX/images/card-3.jpg" alt="Doctor 3">
            </div>

            <!-- Text aligned properly -->
            <span class="ms-3">+10 Experts are online</span>
            <span class="ms-2" style="color: #32cd32; font-size: 10px;"><i
                class="fa-solid fa-circle fa-beat"></i></span>
          </div>
          <a class="btn btn-info btn-lg text-white my-3" href="${pageContext.request.contextPath }/consultNow">Consult Now</a>

          <div class="mt-4">
            <p> <span class="fw-light h-color"><i class=" fa-solid fa-award me-2"></i>Verified Experts</span>
              <span class="ms-3 fw-light h-color"><i class=" fa-solid fa-book-open-reader me-2"></i>Personalized
                Guidance</span>
              <span class="ms-3 fw-light h-color"><i class=" fa-solid fa-message me-2"></i>Free Follow-Up
                Sessions</span>
            </p>
          </div>
          <!-- Column -1 end  -->
        </div>
        <div class="col-lg-6 col-md-6 d-none d-md-block">
          <img class="img-fluid" src="${pageContext.request.contextPath }/ConsultX/images/client.png" alt="">
        </div>
      </div>
    </div>
  </div>
  <!-- End of container - fluid  -->

  <div class="container-fluid container-md mt-4 p-5">
    <h2 class="h-color">Specialities</h2>
    <p style="color: #7e8186;">Consult with top expertise across specialities</p>

    <div class="position-relative border rounded">
      <!-- left  Arrow button  -->
      <button id="scrollLeft" class="btn btn-light position-absolute top-50 start-0 translate-middle-y"><i
          class="fas fa-chevron-left"></i></button>

      <!-- Card Container  -->
      <div id="cardContainer" class="d-flex flex-row p-3">
        <!-- card -1  -->
        <div class="text-center card-setting me-4">
          <img src="${pageContext.request.contextPath }/ConsultX/images/card-1.jpg" class="card-img-top card-image-setting" alt="...">
          <div class="card-body">
            <h5 class="card-title h-color">Career</h5>
            <p class="card-text h-color">Get expert career advice and guidance to shape your future.</p>
            <a href="${pageContext.request.contextPath }/consultNow" class="text-white btn btn-info">Consult Now</a>
          </div>
        </div>

        <!-- card -2  -->
        <div class="text-center card-setting me-4">
          <img src="${pageContext.request.contextPath }/ConsultX/images/card-2.jpg" class="card-img-top card-image-setting" alt="...">
          <div class="card-body">
            <h5 class="card-title h-color">Education</h5>
            <p class="card-text h-color">Expert guidance for your educational journey.</p>
            <a href="${pageContext.request.contextPath }/consultNow" class="text-white btn btn-info">Consult Now</a>
          </div>
        </div>

        <!-- Card 3: Health -->
        <div class="text-center card-setting me-4">
          <img src="${pageContext.request.contextPath }/ConsultX/images/card-3.jpg" class="card-img-top card-image-setting" alt="Health">
          <div class="card-body">
            <h5 class="card-title h-color">Health</h5>
            <p class="card-text h-color">Connect with certified health professionals for medical advice & wellness tips.
            </p>
            <a href="${pageContext.request.contextPath }/consultNow" class="text-white btn btn-info">Consult Now</a>
          </div>
        </div>
        <!-- Card 4: Strategy -->
        <div class="text-center card-setting me-4">
          <img src="${pageContext.request.contextPath }/ConsultX/images/card-5.jpg" class="card-img-top card-image-setting" alt="Strategy">
          <div class="card-body">
            <h5 class="card-title h-color">Strategy</h5>
            <p class="card-text h-color">Get expert advice on business strategy and growth.</p>
            <a href="${pageContext.request.contextPath }/consultNow" class="text-white btn btn-info">Consult Now</a>
          </div>
        </div>

        <!-- Card 5: Technology -->
        <div class="text-center card-setting me-4">
          <img src="${pageContext.request.contextPath }/ConsultX/images/card-5.jpg" class="card-img-top card-image-setting" alt="Technology">
          <div class="card-body">
            <h5 class="card-title h-color">Technology</h5>
            <p class="card-text h-color">Stay ahead with expert tech insights and solutions.</p>
            <a href="${pageContext.request.contextPath }/consultNow" class="text-white btn btn-info">Consult Now</a>
          </div>
        </div>

        <!-- Card 6: Finance  -->
        <div class="text-center card-setting me-4">
          <img src="${pageContext.request.contextPath }/ConsultX/images/card-2.jpg" class="card-img-top card-image-setting" alt="Finance">
          <div class="card-body">
            <h5 class="card-title h-color">Finance</h5>
            <p class="card-text h-color">Expert financial advice for your personal and business needs.</p>
            <a href="${pageContext.request.contextPath }/consultNow" class="text-white btn btn-info">Consult Now</a>
          </div>
        </div>

        <!-- End of card container  -->
      </div>
      <!-- Right Arrow button  -->
      <button id="scrollRight" class="btn btn-light position-absolute top-50 end-0 translate-middle-y"><i
          class="fas fa-chevron-right"></i></button>
    </div>

    <!-- End of card container  -->

    <h2 class="h-color my-4">Offers</h2>
    <!-- row  -->
    <div class="row g-4 p-4">
      <!-- col -1  -->
      <div class="col-sm-12 col-md-6 col-lg-6">
        <div class="container-fluid container-md rounded offer-col1 pt-4">
          <p class="offer-title1 d-inline-block rounded p-2">OFFER</p>
          <div class="row">
            <div class="col-8">
              <h5 class="h-color">Refer your friend to get one free consultation</h5>
              <a href="${pageContext.request.contextPath }/" class="text-black nav-link fw-bold">Refer Now <i
                  class=" ms-1 fa-solid fa-share-nodes fa-fade"></i></a>
            </div>
            <div class="col-4">
              <img src="${pageContext.request.contextPath }/ConsultX/images/friend.png" alt="">
            </div>
          </div>
        </div>
      </div>
      <!-- col - 2 -->
      <div class="col-sm-12 col-md-6 col-lg-6">
        <div class="container-fluid container-md rounded offer-col2 pt-4">
          <p class="offer-title2 d-inline-block rounded p-2">OFFER</p>
          <div class="row">
            <div class="col-8">
              <h5 class="h-color">Consult with Specialists at just ₹199 </h5>
              <a href="${pageContext.request.contextPath }/consultNow" class="text-black nav-link fw-bold">Consult Now <i
                  class=" ms-1 fa-solid fa-circle-chevron-right fa-fade"></i></a>
            </div>
            <div class="col-4">
              <img src="${pageContext.request.contextPath }/ConsultX/images/client.png" alt="">
            </div>
          </div>
        </div>
      </div>
      <!-- End of row -->
    </div>
    <h2 class="h-color my-4">Our Consultors</h2>

    <div class="position-relative">
      <!-- Consultor left button  -->
      <button id="scrollConsultorLeft" class="btn btn-light position-absolute top-50 start-0 translate-middle-y"><i
          class="fas fa-chevron-left"></i></button>
      <!-- Horizontal scroll container -->
      <div id="consultorContainer" class="d-flex flex-row overflow-hidden p-3" style="scroll-behavior: smooth;">
        <!-- Consultor card -1 -->
        <div class="d-flex align-items-center ms-2 p-2 consultor-width rounded border">
          <img class="consultor-card-image" src="${pageContext.request.contextPath }/ConsultX/images/client.png" alt="">
          <div class="d-flex flex-column">
            <h6 class="ms-3">Mr.Sahil Saini</h6>
            <h6 class="text-muted ms-3">Java Developer</h6>
            <h6 class="text-muted ms-3">5 years of experience</h6>
          </div>
        </div>
        <!-- Consultor card -2 -->
        <div class="d-flex align-items-center ms-4 p-2 rounded border">
          <img class="consultor-card-image" src="${pageContext.request.contextPath }/ConsultX/images/client.png" alt="">
          <div class="d-flex flex-column">
            <h6 class="ms-3">Mr.Sahil Saini</h6>
            <h6 class="text-muted ms-3">Java Developer</h6>
            <h6 class="text-muted ms-3">5 years of experience</h6>
          </div>
        </div>
        <!-- Consultor card -3 -->
        <div class="d-flex align-items-center ms-4 p-2 rounded border">
          <img class="consultor-card-image" src="${pageContext.request.contextPath }/ConsultX/images/client.png" alt="">
          <div class="d-flex flex-column">
            <h6 class="ms-3">Mr.Sahil Saini</h6>
            <h6 class="text-muted ms-3">Java Developer</h6>
            <h6 class="text-muted ms-3">5 years of experience</h6>
          </div>
        </div>

        <!-- Consultor card -4 -->
        <div class="d-flex align-items-center ms-4 p-2 rounded border">
          <img class="consultor-card-image" src="${pageContext.request.contextPath }/ConsultX/images/client.png" alt="">
          <div class="d-flex flex-column">
            <h6 class="ms-3">Mr.Sahil Saini</h6>
            <h6 class="text-muted ms-3">Java Developer</h6>
            <h6 class="text-muted ms-3">5 years of experience</h6>
          </div>
        </div>
        <!-- Consultor card -5 -->
        <div class="d-flex align-items-center ms-4 p-2 rounded border">
          <img class="consultor-card-image" src="${pageContext.request.contextPath }/ConsultX/images/client.png" alt="">
          <div class="d-flex flex-column">
            <h6 class="ms-3">Mr.Sahil Saini</h6>
            <h6 class="text-muted ms-3">Java Developer</h6>
            <h6 class="text-muted ms-3">5 years of experience</h6>
          </div>
        </div>

        <!-- Consultor card -1 -->
        <div class="d-flex align-items-center ms-4 p-2 rounded consultor-width border">
          <img class="consultor-card-image" src="${pageContext.request.contextPath }/ConsultX/images/client.png" alt="">
          <div class="d-flex flex-column">
            <h6 class="ms-3">Mr.Sahil Saini</h6>
            <h6 class="text-muted ms-3">Java Developer</h6>
            <h6 class="text-muted ms-3">5 years of experience</h6>
          </div>
        </div>
      </div>
      <!-- Consultor right button  -->
      <button id="scrollConsultorRight" class="btn btn-light position-absolute top-50 end-0 translate-middle-y"><i
          class="fas fa-chevron-right"></i></button>
      <!-- End of Position Relative -->
    </div>

    <!-- How it's works -->
    <h2 class="h-color text-center my-4">How it Works</h2>

    <div class="how-it-works container-fluid my-5">
      <div class="d-flex justify-content-between align-items-center position-relative">
        <!-- Step 1 -->
        <div class="how-step text-center">
          <div class="circle">
            <i class="fas fa-chalkboard-user"></i>
          </div>
          <p class="h-color">Select your consultation type</p>
        </div>

        <!-- Step 2 -->
        <div class="how-step text-center">
          <div class="circle">
            <i class="fas fa-comments"></i>
          </div>
          <p class="h-color">Audio/ video call with a verified consultor</p>
        </div>

        <!-- Step 3 -->
        <div class="how-step text-center">
          <div class="circle">
            <i class="fas fa-prescription"></i>
          </div>
          <p class="h-color">Get a digital prescription & a free follow-up</p>
        </div>
      </div>
    </div>
    <!-- End of container  -->
  </div>

  <!-- Still Delaying for the consultations -->
   <div class="container-fluid mb-5" style="background-color: rgb(47, 45, 45);">
      <div class="container p-4">
          <div class="row">
            <div class="col-sm-12 col-md-6 col-lg-6">
              <h4>Still delaying your health concerns ?</h4>
              <p class="mt-4">Connect with India's top Consultors online</p>
            </div>
            <div class="col-sm-12 col-md-6 col-lg-6 text-md-center mt-sm-2 mt-md-3">
              <a class="btn btn-info btn-lg text-white" href="${pageContext.request.contextPath }/consultNow">Consult Now</a>
            </div>
          </div>
      </div>
   </div>

   <!-- Benefits of Online Consultatioins  -->

   <div class="container p-3">
    <h2 class="h-color">Benefits of Online Consultation</h2>
    <div class="row g-4 border rounded m-5 p-3">
      <div class="col-sm-12 col-md-4 col-lg-4">
        <h6 class="fw-bold"> <i class="fa-solid fa-check"></i> Consult Top Consultors 24x7</h6>
        <p class="text-muted">Connect instantly with a 24x7 specialist or choose to video visit a particular consultor.</p>
      </div>
      <div class="col-sm-12 col-md-4 col-lg-4">
        <h6 class="fw-bold"> <i class="fa-solid fa-check"></i> Consult Top Consultors 24x7</h6>
        <p class="text-muted">Connect instantly with a 24x7 specialist or choose to video visit a particular consultor.</p>
      </div>
      <div class="col-sm-12 col-md-4 col-lg-4">
        <h6 class="fw-bold"> <i class="fa-solid fa-check"></i> Consult Top Consultors 24x7</h6>
        <p class="text-muted">Connect instantly with a 24x7 specialist or choose to video visit a particular consultor.</p>
      </div>
      <div class="col-sm-12 col-md-4 col-lg-4">
        <h6 class="fw-bold"> <i class="fa-solid fa-check"></i> Consult Top Consultors 24x7</h6>
        <p class="text-muted">Connect instantly with a 24x7 specialist or choose to video visit a particular consultor.</p>
      </div>
      <div class="col-sm-12 col-md-4 col-lg-4">
        <h6 class="fw-bold"> <i class="fa-solid fa-check"></i> Consult Top Consultors 24x7</h6>
        <p class="text-muted">Connect instantly with a 24x7 specialist or choose to video visit a particular consultor.</p>
      </div>
    </div>
   </div>


   <!-- Description -->
    <div class="container">
      <p class="text-muted m-5">
        ConsultX offers trusted and secure online consultations across Career, Education, and Health, connecting you with verified experts to guide you at every step. Whether you’re seeking career advice, educational counseling, or health and wellness support, our professionals provide personalized solutions to help you move forward with confidence. Simply book your session through our website, receive an online meeting link via email, and consult directly with your expert. Accessible from anywhere in India, ConsultX ensures expert guidance at your fingertips—making it easier than ever to shape your future, achieve your goals, and stay healthy.
      </p>
    </div>

  <!-- Footer  -->
  <footer class="navbar-black text-white py-4">
    <div class="container">
      <div class="row align-items-center">
        <div class="col-md-4 d-flex justify-content-center justify-content-md-start">
          <!-- Image vertically centered -->
          <a href="${pageContext.request.contextPath}/home"><img src="${pageContext.request.contextPath }/ConsultX/images/consultX_logo3.png" alt="Logo" class="img-fluid" style="width: 200px" /></a>
        </div>
        <div class="col-md-4 text-center text-md-start mt-3 mt-md-0">
          <p class="mb-0">© 2025 ConsultX. All rights reserved.</p>
        </div>

        <div class="col-sm-12 col-md-4 text-center mt-3 mt-lg-0 mt-md-0 text-md-end fs-4">
          <a class="pe-2" href=""><i class="fab fa-facebook-f pe-3" style="color: #f3f4f7"></i></a>
          <a class="pe-2" href="">
            <i class="fab fa-twitter pe-3" style="color: #fcfcfc"></i></a>
          <a class="pe-2" href=""><i class="fab fa-instagram pe-3" style="color: #ffffff"></i></a>
          <a class="pe-2" href=""><i class="fab fa-linkedin pe-3" style="color: #ffffff"></i></a>
        </div>
      </div>
    </div>
  </footer>
  <!-- Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
  <!-- AOS Link  -->
  <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
  <!-- Another AOS Link  -->
  <script>
    AOS.init();

    const container = document.getElementById('cardContainer');
    const cardWidth = document.querySelector('.card-setting').offsetWidth + 16;

    document.getElementById('scrollRight').addEventListener('click', () => {
      container.scrollBy({ left: cardWidth, behavior: 'smooth' });
    });

    document.getElementById('scrollLeft').addEventListener('click', () => {
      container.scrollBy({ left: -cardWidth, behavior: 'smooth' });
    });


    const consultorContainer = document.getElementById('consultorContainer');
    const consultorCardWidth = consultorContainer.querySelector('div').offsetWidth + 16;

    document.getElementById('scrollConsultorRight').addEventListener('click', () => {
      consultorContainer.scrollBy({ left: consultorCardWidth, behavior: 'smooth' });
    });

    document.getElementById('scrollConsultorLeft').addEventListener('click', () => {
      consultorContainer.scrollBy({ left: -consultorCardWidth, behavior: 'smooth' });
    });
  </script>
</body>
</html>