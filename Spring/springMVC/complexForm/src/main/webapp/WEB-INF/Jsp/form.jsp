<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
        crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1 class="mb-3 text-center">Complex Form</h1>

        <div class="alert alert-danger" role="alert">
            <form:errors path="*" cssClass="text-danger" />
        </div>

        <form:form modelAttribute="user" action="processform" method="post">
            <div class="mb-3">
                <label class="form-label">Name</label>
                <form:input path="name" cssClass="form-control" />
            </div>

            <div class="mb-3">
                <label class="form-label">Email</label>
                <form:input path="email" type="email" cssClass="form-control" />
            </div>

            <div class="mb-3">
                <label class="form-label">Password</label>
                <form:password path="password" cssClass="form-control" />
            </div>

            <div class="row mb-3">
                <div class="col-6">
                    <label class="form-label">Age</label>
                    <form:input path="age" type="number" cssClass="form-control" />
                </div>
                <div class="col-6">
                    <label class="form-label">Gender</label>
                    <form:select path="gender" cssClass="form-select">
                        <form:option value="" label="Select Gender" />
                        <form:option value="Male" />
                        <form:option value="Female" />
                        <form:option value="Other" />
                    </form:select>
                </div>
            </div>

            <div class="mb-3">
                <label class="form-label">Course</label>
                <form:select path="course" cssClass="form-select" size="5">
                    <form:option value="" label="Select Course" />
                    <form:option value="Java" />
                    <form:option value="Python" />
                    <form:option value="C++" />
                    <form:option value="MySQL" />
                    <form:option value="Data Structure" />
                </form:select>
            </div>

            <div class="row mb-3">
                <div class="col-4">
                    <label class="form-label">DOB</label>
                    <form:input path="dob" type="date" cssClass="form-control" />

                    <label class="form-label mt-3">Student Type</label>
                    <form:select path="type" cssClass="form-select">
                        <form:option value="" label="Select Type" />
                        <form:option value="Old Student" />
                        <form:option value="New Student" />
                    </form:select>
                </div>

                <div class="col-8">
                    <div class="card">
                        <div class="card-body">
                            <label class="form-label">Street</label>
                            <form:input path="address.street" cssClass="form-control mb-2" />

                            <label class="form-label">City</label>
                            <form:input path="address.city" cssClass="form-control" />
                        </div>
                    </div>
                </div>
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-secondary btn-lg">Submit</button>
            </div>
        </form:form>
    </div>

    <!-- ✅ Bootstrap JS (restored) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>
