<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>People List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="container">
    <legend>Add new camera</legend>
    <form name="Camera" action="" method="POST">
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">Camera Name:</span>
            </div>
            <@spring.formInput "Camera.name" "class='form-control'" "text"/>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">Point Name:</span>
            </div>
            <@spring.formInput "Point.name" "class='form-control'" "text"/>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">Point Desc:</span>
            </div>
            <@spring.formInput "Point.desc" "class='form-control'" "text"/>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">View Place:</span>
            </div>
            <@spring.formSingleSelect "Camera.view", view, "class='form-control'"/>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">Camera Desc:</span>
            </div>
            <@spring.formInput "Camera.desc" "class='form-control'" "text"/>
        </div>
        <br>
        <a href="/web/camera/get/list" Type="Button" class="btn btn-primary">Back</a>
        <input Type="submit" value="     Submit     " class="btn btn-danger"/>
    </form>

</div>
</body>
</html>
