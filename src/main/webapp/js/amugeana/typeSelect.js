var amugeona = {
	typeList: new Array(),
	btnEvent: function(){
		$(document).on("click","label[name=typeBtn]",function(e){
			if($(this).hasClass("on")){
				$("label[name=typeBtn]").removeClass("on");
			}else{
				$("label[name=typeBtn]").removeClass("on");
				$(this).addClass("on");
			}
		});
		
		$(document).on("click","#nextBtn",function(e){
			if(!$("input[name=typeRadioBox]").is(":checked")){
				alert("메뉴를 선택해 주세요.");
				return;
			}
			var data = $("input[name=typeRadioBox]:checked").val();
			var paramData = {
				typeCd:data.split("|")[0],
				category:data.split("|")[1]
			}

			common.ajax("/amugeona/ajaxTypeList.do",paramData,this.typeSuccessFn, this.errorFn);
		})
	},
	typeSuccessFn : function(data){
		console.log(data);
	},
	errorFn : function(data){
		
	}

}

var common = {
	ajax : function(url, data, successFn, errorFn){
		$.ajax({
			method : "POST",
			url : url,
			dataType: "json",
		    contentType:"application/json",
			data : JSON.stringify(data),
			error : function(){
				if(errorFn){
					errorFn();
				}
			},
			success : function(data){
				if(successFn){
					successFn();
				}
			}
			
		})
	}
}

$(document).ready(function(){
	amugeona.btnEvent();
})