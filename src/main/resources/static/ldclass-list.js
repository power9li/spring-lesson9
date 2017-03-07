LdClass = {

    linkFormatter: function(value, row) {
        var href="ldclass-student.html?classId="+row.classId+"&className="+encodeURIComponent(row.className);
        return "<a href='#' onclick=navi2page('"+href+"')>花名册</a>";
    },

    init : function(){
        LdClass.loadTableData();
    },

    loadTableData : function(){
        $.ajax("/ldClass/findAll",{
            type:"post",
            dataType:"json",
            success: function(data) {
                console.log("success.data=" + JSON.stringify(data)+",typeof(data)="+typeof(data));
                if(typeof(data) == "string"){
                    data = eval("(" + data + ")");
                }
                console.log("success=" + data["success"]);
                if(data["success"] == true) {
                    if(data["data"] != null) {
                        $("#ldClassTable").bootstrapTable('load', data["data"]);
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
            error:function(e){
                console.log("data.success = false, reason="+ JSON.stringify(e));
                if(e["responseText"] != null){
                    var data = e["responseText"];
                    if(data != null && data["success"] == false) {
                        console.log("data[handler]="+ JSON.stringify(data["handler"]));
                        if (data["handler"] != null && typeof(data["handler"]) == "function"){
                            data["handler"]();
                        }
                    }
                }
            }
        });
    }
}

$(document).ready(function(){
    LdClass.init();
});
