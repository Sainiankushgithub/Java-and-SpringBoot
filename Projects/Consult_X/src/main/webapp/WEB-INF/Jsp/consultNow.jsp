<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Consulting</title>
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
      background-color: #f0f0f5;
    }

    input[type="text"]:focus {
      outline: none;
      box-shadow: 0 0 0 1px rgb(77, 151, 225);
    }

    select:focus {
      outline: none;
      box-shadow: 0 0 0 1px rgb(77, 151, 225);
    }
  </style>
</head>

<body>
  <header id="home">
    <nav class="navbar navbar-expand-lg navbar-dark fixed-top navbar-black">
      <div class="container-fluid">
        <a class="navbar-brand" href="${pageContext.request.contextPath }/home">
          <img class="img-fluid" src="${pageContext.request.contextPath }/ConsultX/images/consultX_logo3.png" alt="logo" />
        </a>
      </div>
    </nav>
  </header>

  <div class="container-fluid-small d-flex justify-content-center  mt-5 pt-5">
    <div class="row bg-white shadow large-width mx-2 mt-3 rounded">
      <!-- Left Section -->
      <div class="col-sm-12 col-md-6 col-lg-6 p-3">
        <h3 class="h-color">Consult with an Expert</h3>
        <p class="text-secondary">Tell us your concern to get matched with a specialist.</p>
        <form class="m-0 p-0" action="">
          <input class="rounded" type="text" style="width: 90%; border: 1px solid #ccc;height: 70px; padding: 10px;"
            placeholder="Enter your concern here" required />
          <p class="text-muted m-1" style="font-size: 10px;" name="min-char">Min 5 characters</p>
          <h6 class="mt-4">Choose a relevant speciality</h6>
          <select class="bg-white text-black w-75 border p-2 rounded" multiple aria-label="Multiple select example"
            required>
            <option class="bg-white text-black" value="Career">Career</option>
            <option class="bg-white text-black" value="Education">Education</option>
            <option class="bg-white text-black" value="Health & Wellness">Health & Wellness</option>
            <option class="bg-white text-black" value="Finance">Finance</option>
            <option class="bg-white text-black" value="Legal">Legal</option>
            <option class="bg-white text-black" value="Technology">Technology</option>
          </select>
          <h6 class="ms-1 mt-3">Mobile Number</h6>
          <div class="input-group">
            <div class="input-group-text cursor-point"><img class="img-fluid " src="https://flagcdn.com/w40/in.png"
                alt="India Flag"> <i class="ms-2 text-muted fa-solid fa-circle-chevron-right"></i>
              <label class="ms-2 cursor-point" for="mobile-number">+ 91 6006523043</label>
            </div>
          </div>

          <button type="submit" class="btn btn-info text-white mt-4 fs-5">Continue</button>
        </form>
      </div>

      <div class="col-md-1 d-none d-md-flex">
        <div class="vr"></div>
      </div>

      <div class="col-md-5 d-none d-md-block position-relative">
        <div class="mt-4 position-absolute top-0 end-0 translate-middle-y">
          <a class="text-muted fs-3 nav-link" href="${pageContext.request.contextPath }/userConsultee"> <i class="d-block d-md-block fa-solid fa-xmark"></i></a>
        </div>

        <div class="image-slide position-absolute top-50 start-0 translate-middle-y">
          <div class=" ms-4">
            <img class="img-fluid  slide-img" src="${pageContext.request.contextPath }/ConsultX/images/verified_consultor.png" alt="" style="width: 300px; height: 300px;">
            <img class="img-fluid slide-img d-none" src="${pageContext.request.contextPath }/ConsultX/images/private_secure.png" alt="" style="width: 300px; height: 300px;">
            <img class="img-fluid slide-img d-none" src="${pageContext.request.contextPath }/ConsultX/images/free_follow.png" alt="" style="width: 300px; height: 300px;">
          </div>
        </div>
      </div>
      <!-- End of main row  -->
    </div>
    <!-- End of main container -->
  </div>

  
  <!-- Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
  <!-- AOS Link  -->
  <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
  <!-- Another AOS Link  -->
  <script>
    AOS.init();

    // Image Slider Functionality
    const images = document.querySelectorAll('.slide-img');
    let index = 0;
     setInterval(()=>{
       images.forEach((img,i)=>{
        img.classList.toggle('d-block', i === index);
        img.classList.toggle('d-none', i !== index);
       });
        index = (index + 1) % images.length;
     }, 1500);
  </script>
</body>
</html>