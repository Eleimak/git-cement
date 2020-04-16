<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Processing List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="container-fluid">
    <br>
    <h3>Processing List</h3>

    <a href="/" type="button" class="btn btn-light" style="float:left; margin-top:5px; margin-bottom: 10px"><i class="fa fa-chevron-circle-left"></i> Back to home page</a>

    <a href="/web/processing/starting" type="button" class="btn btn-light" style="float:right; margin-top:5px; margin-bottom: 10px"><i class="fa fa-plus-square-o"></i> Starting</a>

    <br>

    <div>
        <table class="table table-sm table-striped table-bordered">
            <tr class="thead-dark">
                <#--<th scope="col">ID</th>-->
                <th scope="col">Time</th>
                <th scope="col">ID Cadr</th>
                <th scope="col">Name Cadr</th>
                <th scope="col">Date Cadr</th>
                <th scope="col">Image</th>
                <th scope="col">Number</th>
                <th scope="col">Camera</th>
                <th scope="col">Point</th>
                <th scope="col">View</th>
                <th scope="col">Quality</th>
                <th scope="col">Success</th>

                <th scope="col">Delete</th>
            </tr>
            <#list list as processing>
                <#assign success = "">
                <#if processing.success == true>
                    <#assign success = "true">
                <#else>
                    <#assign success = "false">
                </#if>
                <tr>
                    <#--<td>${processing.id}</td>-->
                    <td>${processing.time}</td>
                    <td>${processing.cadr.id}</td>
                    <td>${processing.cadr.name}</td>
                    <td>${processing.cadr.time}</td>
                    <#assign imageGender= "${processing.cadr.path}">
                    <td><img src="${imageGender}" width="150px" height="50px" type="image/png" alt=""></td>
                    <td>${processing.number}</td>
                    <td>${processing.cadr.camera.name}</td>
                    <td>${processing.cadr.camera.point.name}</td>
                    <td>${processing.cadr.camera.view}</td>
                    <td>${processing.quality}</td>
                    <td>${success}</td>

                    <td><a href="#" type="button" class="btn btn-outline-danger" onclick="return confirm('Are you sure you want to delete ?');"><i class="fa fa-trash"></i></a></td>
                </tr>
            </#list>

        </table>
    </div>

</div>
</body>
</html>
