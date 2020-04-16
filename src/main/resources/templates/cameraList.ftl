<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Camera List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="container-fluid">
    <br>
    <h3>Camera List</h3>

    <a href="/" type="button" class="btn btn-light" style="float:left; margin-top:5px; margin-bottom: 10px"><i class="fa fa-chevron-circle-left"></i> Back to home page</a>

    <a href="/web/camera/create" type="button" class="btn btn-light" style="float:right; margin-top:5px; margin-bottom: 10px"><i class="fa fa-plus-square-o"></i> Add new camera</a>

    <br>

    <div>
        <table class="table table-sm table-striped table-bordered">
            <tr class="thead-dark">
                <th scope="col">ID</th>
                <th scope="col">First Name</th>
                <th scope="col">Point Name</th>
                <th scope="col">Point Desc</th>
                <th scope="col">View Place</th>

                <th scope="col">Delete</th>
                <th scope="col">Edit</th>
            </tr>
            <#list list as camera>
                <tr>
                    <td>${camera.id}</td>
                    <td>${camera.name}</td>
                    <td>${camera.point.name}</td>
                    <td>${camera.point.desc}</td>
                    <td>${camera.view}</td>

                    <td><a href="/web/camera/delete/${camera.id}" type="button" class="btn btn-outline-danger" onclick="return confirm('Are you sure you want to delete ?');"><i class="fa fa-trash"></i></a></td>
                    <td><a href="#" type="button" class="btn btn-light" ><i class="fa fa-edit"></i>Edit</a></td>
                </tr>
            </#list>

        </table>
    </div>

</div>
</body>
</html>
