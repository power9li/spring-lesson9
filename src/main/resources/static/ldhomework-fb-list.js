var LdHomeworkFb = {

    initTable : function(){
        $("#ldHomeWorkFbTb").bootstrapTable({
            columns:[
                {
                    field: 'id',
                    checkbox: true,
                    rowspan: 2,
                    align: 'center',
                    valign: 'middle'
                },
                {
                    field: 'userId',
                    checkbox: true,
                    rowspan: 2,
                    align: 'center',
                    valign: 'middle'
                },
                {
                    field: 'classId',
                    checkbox: true,
                    rowspan: 2,
                    align: 'center',
                    valign: 'middle'
                },
                {
                    field: 'lessionId',
                    checkbox: true,
                    rowspan: 2,
                    align: 'center',
                    valign: 'middle'
                },
                {
                    field: 'homeworkFileName',
                    checkbox: true,
                    rowspan: 2,
                    align: 'center',
                    valign: 'middle',
                    formatter: LdHomeworkFb.homeFileFormatter
                },
                {
                    field: 'createDate',
                    checkbox: true,
                    rowspan: 2,
                    align: 'center',
                    valign: 'middle',
                    formatter :LdHomeworkFb.bestFormatter
                },
                {
                    title: '操作',
                    field: '#',
                    align: 'center',
                    valign: 'middle',
                    checkbox: true,
                    rowspan: 2,
                    formatter:LdHomeworkFb.fbFormatter
                }
            ]
        });
        $('#summernote').summernote({
            height: 150,                 // set editor height
            minHeight: null,             // set minimum height of editor
            maxHeight: null,             // set maximum height of editor
            focus: true
        });
    },

    initEventHandler : function(){
        $("#evaluationSubmitBtn").on("click",function(){
            var html = $('#summernote').summernote('code');
            //alert(html);
            var evaluationForm = $("#evaluationForm");
            evaluationForm.bootstrapValidator('validate');
            var flag = evaluationForm.data("bootstrapValidator").isValid();
            console.log("evaluationForm.Validate=" + flag);
            if(flag) {
                $.ajax('/ldhomeworkfb/evaluation', {
                    type: "POST",
                    dataType:'json',
                    data:{
                        "evaluation":html,
                        "levelFlag":$("#levelFlag").val(),
                        "addStart":$("#hdAddStart").val(),
                        "delStart":$("#hdDelStart").val(),
                        "myId":"1",
                        "userId":$("#hdUserId").val(),
                        "homeworkId":$("#hdHomeWorkId").val()
                    },
                    success: function(msg) {
                        console.log("msg=" + JSON.stringify(msg));
                        if(msg["success"] == true){
                            var evaluationForm = $("#evaluationForm");
                            evaluationForm.data('bootstrapValidator').resetForm({levelFlag:""});
                            LdHomeworkFb.loadTableData();
                            LdHomeworkFb.resetEvaluationForm();
                            $("#evaluationDiv").modal('toggle');

                            BootstrapDialog.show({
                                type: BootstrapDialog.TYPE_SUCCESS,
                                title: '提交评价成功!',
                                message: '提交评价成功,感谢你的支持!',
                                buttons: [{
                                    label: '关闭',
                                    action: function(dialogItself){
                                        dialogItself.close();
                                    }
                                }]
                            });
                        }
                        else{
                            console.log("msg.success = false, reason=" + msg["reason"]);
                        }
                    },
                    error: function (data) {
                        console.log("data=" + JSON.stringify(data)+",typeof(data)="+typeof(data));
                        if(typeof(data) == "string"){
                            data = eval("(" + data + ")");
                        }
                        if(data["responseText"] != null){
                            var handler = data["responseText"]["handler"];
                            if(handler != null) {
                                handler.call();
                            }
                        }
                    }

                });
            }
            else{
                console.log("valid failed.")
            }
        });

        $("#evaluationForm").bootstrapValidator({
            message: 'This value is not valid',
            feedbackIcons: {        //提示图标
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields:{
                levelFlag:{
                    validators:{
                        notEmpty: {
                            message: '作业等级是必填的,不能为空'
                        }
                    }
                }
            }
        });

        $("#addStart").click(function(){
            var delStartCount = $("#hdDelStart").val();
            if(delStartCount == 1) {
                $("#delStartSpan").html("");
                $("#hdDelStart").val("0");
                $("#delStart")[0].disabled=false;
                $("#delStart").addClass("btn-success");
                return false;
            }
            else{
                $("#hdAddStart").val("1");
                $("#addStartSpan").html("&nbsp;点赞数:+1");
                $(this).removeClass("btn-success");
                //$(this).addClass("btn-info");
                $(this).attr("disabled","disabled");
                return false;
            }
        });

        $("#delStart").click(function(){
            var addStartCount = $("#hdAddStart").val();
            if(addStartCount == 1) {
                $("#addStartSpan").html("");
                $("#hdAddStart").val("0");
                $("#addStart")[0].disabled=false;
                $("#addStart").addClass("btn-success");
                return false;
            }
            else{
                $("#hdDelStart").val("1");
                $("#delStartSpan").html("&nbsp;差评数:+1");
                $(this).removeClass("btn-success");
                $(this).addClass("btn-info");
                $(this).attr("disabled","disabled");
                return false;
            }
        });
    },

    loadTableData : function(){
        $.ajax("/ldhomework/completedList",{
            type:"GET",
            success: function(data) {
                console.log("success.data=" + JSON.stringify(data)+",typeof(data)="+typeof(data));
                if(typeof(data) == "string"){
                    data = eval("(" + data + ")");
                }
                console.log("success=" + data["success"]);
                if(data["success"] == true) {
                    if(data["homeworkLists"] != null) {
                        $("#ldHomeWorkFbTb").bootstrapTable('load', data["homeworkLists"]);
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
    },

    openEvaluation: function(homeId, userId) {
        $("#evaluationDiv").modal();
        $("#hdHomeWorkId").val(homeId);
        $("#hdUserId").val(userId);
    },

    viewEvaluation:function(homeworkId) {
        console.log("homeworkId=" + homeworkId);
        $.ajax("/ldhomeworkfb/feedbacks?homeworkId="+homeworkId,{
            type: "POST",
            dataType:'json',
            success: function(data) {
                console.log("success! data="+JSON.stringify(data));
                var source   = $("#evolutionDetailTmp").html();
                console.log("source=" + source);
                var template = Handlebars.compile(source);
                var html     = template(data);
                console.log("html=" + html);
                $("#viewEvaluationDiv").html(html);
                $("#viewEvaluationDiv").modal('toggle');

                $("[data-content]").popover(
                    {
                        placement:'left',
                        html:true
                    }
                );
            },
            error: function (data) {
                console.log("error: data=" + JSON.stringify(data));
            }

        });
    },

    fbFormatter: function(value, row) {
        var remak = "<a href='#' onclick='javascript:LdHomeworkFb.openEvaluation("+row.id+","+row.userId+")'>我要评价</a>";
        var viewmark = "<a href='#' onclick='javascript:LdHomeworkFb.viewEvaluation("+row.id+")'>查看所有评论</a>";
        return remak +"&nbsp;"+ viewmark;
    },

    bestFormatter: function(value, row){
        var show = (row.bestFlag==true)?"是":"否";
        return show;
    },

    homeFileFormatter : function(value, row){
        console.log("row="+JSON.stringify(row));
        var source = $("#downloadTemp").html();
        var template = Handlebars.compile(source);
        var html     = template({
            fileName: row.homeworkFileName,
        });
        return html;
    },


    resetEvaluationForm: function(){
        console.log("==resetEvaluationForm()==");
        var evaluationForm = $("#evaluationForm");
        evaluationForm[0].reset();
        var addStartCount = $("#hdAddStart").val();
        var delStartCount = $("#hdDelStart").val();
        console.log("addStartCount="+addStartCount+",delStartCount="+delStartCount);
        if(delStartCount == 1) {
            $("#delStartSpan").html("");
            $("#hdDelStart").val("0");
            $("#delStart")[0].disabled=false;
            $("#delStart").addClass("btn-success");
        }
        else if(addStartCount == 1) {
            $("#addStartSpan").html("");
            $("#hdAddStart").val("0");
            $("#addStart")[0].disabled=false;
            $("#addStart").addClass("btn-success");
        }
        $(".note-editable")[0].innerHTML = "";
    }
}


$(document).ready(function(){
    console.log("ldhomework-fb-list.log. on ready.");

    LdHomeworkFb.initTable();
    LdHomeworkFb.initEventHandler();
    LdHomeworkFb.loadTableData();

});