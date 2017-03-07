$(document).ready(function(){
    $("#loginBtn").click(function(){
        var obj = {
            username: $("#username").val(),
            password: $("#password").val(),
            rememberMe: $("#rememberMe").val()
        };
        console.log("before login params 1= " + JSON.stringify(obj));

        $.ajax('/login/go', {
            type: "POST",
            dataType: 'json',
            data:{
                username: $("#username").val(),
                password: $("#password").val(),
                rememberMe: $("#rememberMe").val()
            },
            success: function (data) {
                console.log("data=" + JSON.stringify(data));
                var success = data["success"];
                if(success == true){
                    location.href = "/index.html";
                }
                else{
                    var reason = data["reason"];
                    BootstrapDialog.show({
                        type: BootstrapDialog.TYPE_DANGER,
                        title: '登录失败!',
                        message: '失败原因:'+reason,
                        buttons: [{
                            label: '关闭',
                            action: function(dialogItself){
                                dialogItself.close();
                                //$('#ldHomeWorkFbTb').bootstrapTable('refresh',{silent: true});
                            }
                        }]
                    });
                }
            },
            error: function (e) {
                console.log("error:" + e);
            }
        });
    });
});