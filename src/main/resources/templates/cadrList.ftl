<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cadr List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="container-fluid">
    <br>
    <h3>Cadr List</h3>

    <a href="/" type="button" class="btn btn-light" style="float:left; margin-top:5px; margin-bottom: 10px"><i class="fa fa-chevron-circle-left"></i> Back to home page</a>

    <br>

    <div>
        <table class="table table-sm table-striped table-bordered">
            <tr class="thead-dark">
                <th scope="col">ID</th>
                <th scope="col">Name</th>
                <th scope="col">Date</th>
                <th scope="col">Image</th>
                <th scope="col">Camera</th>
                <th scope="col">Point</th>
                <th scope="col">View</th>

                <th scope="col">Delete</th>
            </tr>
            <#list list as cadr>
                <tr>
                    <td>${cadr.id}</td>
                    <td>${cadr.name}</td>
                    <td>${cadr.time}</td>
                    <#assign imageGender= "${cadr.path}">
                    <td><img src="${imageGender}" width="150px" height="50px" type="image/png" alt=""></td>
                    <td>${cadr.camera.name}</td>
                    <td>${cadr.camera.point.name}</td>
                    <td>${cadr.camera.view}</td>

                    <td><a href="/web/Cadr/delete/${cadr.id}" type="button" class="btn btn-outline-danger" onclick="return confirm('Are you sure you want to delete ?');"><i class="fa fa-trash"></i></a></td>
                </tr>
            </#list>

        </table>
    </div>

</div>
</body>
</html>
