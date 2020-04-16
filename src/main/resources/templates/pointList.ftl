<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Point List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">
    <br>
    <h3>Point List</h3>
    <a href="/" type="button" class="btn btn-light" style="float:left; margin-top:5px; margin-bottom: 15px"><i class="fa fa-chevron-circle-left"></i>Back to home page</a>

    <a href="#" type="button" class="btn btn-light" style="float:right; margin-top:5px; margin-bottom: 15px"><i class="fa fa-plus-square-o"></i>Add new point</a>

    <br>

    <div>
        <table class="table table-sm table-striped table-bordered">
            <tr class="thead-dark">
                <th scope="col">ID</th>
                <th scope="col">First Name</th>

                <th scope="col">Delete</th>
                <th scope="col">Edit</th>
            </tr>
            <#list list as point>
                <tr>
                    <td>${point.id}</td>
                    <td>${point.name}</td>

                    <td><a href="/web/point/delete/${point.id}" type="button" class="btn btn-outline-danger" onclick="return confirm('Are you sure you want to delete ?');"><i class="fa fa-trash"></i></a></td>
                    <td><a href="/web/point/edit/${point.id}" type="button" class="btn btn-light" ><i class="fa fa-edit"></i>Edit</a></td>
                </tr>
            </#list>

        </table>
    </div>

</div>
</body>
</html>
