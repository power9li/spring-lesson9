$(document).ready(function(){
	$("#uploadBtn").on("click",function(){
		console.log(1);
        $("#uploadDiv").modal();
	});

    $("#workFile").fileinput({
        uploadUrl: "/ldhomework/upload", // server upload action
        uploadAsync: true,
        showPreview: true,
        previewFileType: "PPT",
        allowedFileExtensions: ["ppt", "pptx", "pdf"],
        deleteUrl: "/site/file-delete",
        overwriteInitial: false,
        maxFileSize: 5120,
        initialCaption: "请选择作业附件",
        minFileCount: 1,
        maxFileCount: 1,
        uploadExtraData:function(){
            return {
                //"userId":$("#userId").val(),
                "classId":$("#classId").val(),
                "lessonId":$("#lessonId").val()
            }
        }
    });

    $('#workFile').on('fileuploaded', function(event, data, previewId, index) {
        var form = data.form, files = data.files, extra = data.extra,
            response = data.response, reader = data.reader;
        console.log('File uploaded triggered');
        var isSuccess = response["success"];
        console.log("response.success=" + isSuccess);

        //Reset All
        var uploadForm = $("#uploadForm");
        uploadForm.data('bootstrapValidator').resetForm(extra);
        $("#workFile").fileinput('clear').fileinput('enable');
        $("#uploadDiv").modal('toggle');

        if(isSuccess == false) {

            var reason = response["reason"];
            //alert('作业保存失败,原因:' + reason);
            BootstrapDialog.show({
                type: BootstrapDialog.TYPE_DANGER,
                title: '作业保存失败',
                message: '原因:' + reason,
                buttons: [{
                    label: '关闭',
                    action: function(dialogItself){
                        dialogItself.close();
                    }
                }]
            });
        }
        else{
            //alert("作业保存成功!");
            BootstrapDialog.show({
                type: BootstrapDialog.TYPE_SUCCESS,
                title: '作业保存成功!',
                message: '作业保存成功!',
                buttons: [{
                    label: '关闭',
                    action: function(dialogItself){
                        dialogItself.close();
                        $('#ldHomeWorkTb').bootstrapTable('refresh',{silent: true});
                    }
                }]
            });
        }
    });

    $("#uploadSubmitBtn").on("click",function(){
        console.log("uploadSubmitBtn.click");
        var uploadForm = $("#uploadForm");
        uploadForm.bootstrapValidator('validate');
        var flag = uploadForm.data("bootstrapValidator").isValid();
        console.log("uploadForm.Validator=" + flag);
        if(flag){
            $("#workFile").fileinput('upload');
        }
        else{
            console.log("valid failed.")
        }
    });


    $("#uploadForm").bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {        //提示图标
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields:{
            //userId:{
            //    validators:{
            //        notEmpty: {
            //            message: '学生ID是必填的,不能为空'
            //        }
            //    }
            //},
            classId:{
                validators:{
                    notEmpty:{
                        message: '班级ID是必填的,不能为空'
                    }
                }
            },
            lessonId:{
                validators:{
                    notEmpty:{
                        message: '课程ID是必填的,不能为空'
                    }
                }
            }
        }
    });

    $("#classId").bind("change",function(){
        var classId = $(this).val();
        console.log("select classId = "+ classId);
        if(classId != ""){
            $.ajax("/ldcourse/listByClassId",{
                type:"POST",
                data:{"classId":classId},
                success:function(data){
                    console.log("success.data=" + JSON.stringify(data)+",typeof(data)="+typeof(data));
                    if(typeof(data) == "string"){
                        data = eval("(" + data + ")");
                    }
                    console.log("success=" + data["success"]);
                    if(data["success"] == true) {
                        if(data["data"] != null) {
                            var list = data["data"];
                            var selectObj = $("#lessonId");
                            selectObj.find('option').remove();
                            selectObj.append('<option value="">请选择</option>')
                            $.each(list, function() {
                                selectObj.append('<option value="' + this.id + '">'
                                    + this.coursetitle + '</option>')
                            })
                        }
                        else{
                            console.log("data['data'] is null.");
                        }
                    }
                    else{
                        if(data["handler"] != null) {
                            console.log("call handler");
                            var handler = eval(data["handler"]);
                            if(typeof handler == "function") {
                                handler.call();
                            }
                        }
                    }
                },
                error:function(msg){

                }
            });
        }
    });

    function initTableData(){
        $.ajax("/ldhomework/list",{
            type:"GET",
            success: function(data) {
                console.log("success.data=" + JSON.stringify(data)+",typeof(data)="+typeof(data));
                if(typeof(data) == "string"){
                    data = eval("(" + data + ")");
                }
                console.log("success=" + data["success"]);
                if(data["success"] == true) {
                    if(data["homeworkLists"] != null) {
                        $("#ldHomeWorkTb").bootstrapTable('load', data["homeworkLists"]);
                    }
                    else{
                        console.log("data['homeworkLists'] is null.");
                    }
                }
                else{
                    if(data["handler"] != null) {
                        console.log("call handler");
                        var handler = eval(data["handler"]);
                        if(typeof handler == "function") {
                            handler.call();
                        }
                    }
                }
            },
            error:function(msg){
                console.log("msg.success = false, reason=" + msg["responseText"]);
            }
        });

        $.ajax("/ldClass/loadByUserId",{
            type:"GET",
            success : function(data){
                if(typeof(data) == "string"){
                    data = eval("(" + data + ")");
                }
                if(data["data"]){
                    var list = data["data"];
                    var selectObj = $("#classId");
                    selectObj.find('option').remove();
                    selectObj.append('<option value="">请选择</option>')
                    $.each(list, function() {
                        selectObj.append('<option value="' + this.id + '">'
                            + this.classname + '</option>')

                    })
                }
            },
            error: function(msg){
                console.log("loadByUserId failed e:"+ e);
            }
        });
    }

    initTableData();

});
