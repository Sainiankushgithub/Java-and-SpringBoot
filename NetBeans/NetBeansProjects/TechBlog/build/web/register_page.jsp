
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!--css link-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="Css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .banner-background{
                clip-path: polygon(50% 0%, 77% 0, 100% 0, 100% 99%, 81% 90%, 50% 100%, 20% 90%, 0 100%, 0% 35%, 0 0);
                padding-bottom: 50px;
            }
        </style>
    </head>
    <body>
        <!--nav bar--> 
        <%@include file="nav_bar.jsp" %>

        <main class="primary-color banner-background">
            <div class="container ">
                <div class="row">
                    <div class="col-md-6 offset-md-3">
                        <div class="card">
                            <div class="card-header text-center primary-color text-white">
                                <span class="fa fa-user-plus"></span>
                                <p>SignUp Here</p>
                            </div>
                            <div class="card-body">
                                <form id="reg-form" action="RegisterServlet" method="POST">
                                    <div class="form-group">
                                        <label for="exampleInputName1">Name</label>
                                        <input name="user_name" type="text" class="form-control" id="exampleInputName1" aria-describedby="nameHelp" placeholder="Enter name">
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Email address</label>
                                        <input name="user_email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">Password</label>
                                        <input name="user_password"  type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleGender"> Gender <span class="fa fa-caret-right"></span></label>
                                        <input type="radio" name="gender" id="genderMale" value="male">
                                        <label for="genderMale"><span class="fa fa-male"></span></label>

                                        <input type="radio" name="gender" id="genderFemale" value="female">
                                        <label for="genderFemale"><span class="fa fa-female"></span></label>

                                    </div>

                                    <div class="form-group">
                                        <textarea name="about" class="form-control" id="" cols="30" rows="2" placeholder="Write something about yourself....."></textarea>
                                    </div>

                                    <div class="form-check">
                                        <input name="check" type="checkbox" class="form-check-input" id="exampleCheck1">
                                        <label class="form-check-label" for="exampleCheck1">agree terms & conditions</label>
                                    </div>

                                    <div class="container text-center" id="loader" style="display: none;">
                                        <span class="fa fa-refresh fa-2x fa-spin"></span>
                                        <p>Please wait</p>
                                    </div>
                                    <button id="submit-btn" type="submit" class="btn btn-primary">Submit</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>

        <!--script-->
        <script
            src="https://code.jquery.com/jquery-3.7.1.min.js"
            integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
        <script>

            $(document).ready(function () {
                console.log("loaded........");

                $('#reg-form').on('submit', function (event) {

                    event.preventDefault(); // Prevents form from submitting the traditional way

                    let form = new FormData(this);

                    // Hiding the submit button and showing the loader
                    $("#submit-btn").hide();
                    $("#loader").show();

                    // Send register data to the servlet using AJAX
                    $.ajax({
                        url: 'RegisterServlet', // URL of the servlet
                        type: 'POST',
                        data: form,
                        success: function (data, textStatus, jqXHR) {
                            console.log(data);

                            $("#submit-btn").show();
                            $("#loader").hide();

                            if (data.trim() === 'Done') {
                                swal("Registered Successfully.... We're redirecting you to login page")
                                        .then((value) => {
                                            window.location.href = "login_page.jsp"; // Redirect to login page
                                        });
                            } else {
                                swal(data); // Show error message returned by the servlet
                            }
                        },
                        error: function (jqXHR, textStatus, errorThrown) {
                            $("#submit-btn").show();
                            $("#loader").hide();
                            swal("Something went wrong ...... try again!");
                        },
                        processData: false, // Required for FormData
                        contentType: false  // Required for FormData
                    });
                });
            });


        </script>
    </body>
</html>
