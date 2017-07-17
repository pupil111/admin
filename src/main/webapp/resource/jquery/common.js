$(function(){
	//隐藏库存弹框
	$('.kc').live('mouseout',function(e){
		$(".positionBox").hide();
	});
	/*$('.kc').live('mouseenter',function(e){
		var Left = e.pageX-110;
		var Top = e.pageY+110;
		$('.positionBox').css({'top':Top,"left":Left}).show();
	});*/
	$('.kc').live('mouseleave',function(e){
		$(".positionBox").hide();
	});
	//页面宽高
	var winHei = $(window).height();
	var interWid = $(window).width()-200-17;
	//var rigHei = $(".interfaceRight").height();
	
	//$(".intLeftNav").css('height',(winHei-42)+"px");
	$(".interfaceRight").css('width',interWid+"px");
	//$(".intRightCon").css('height',(winHei-78)+"px");
	$(window).resize(function(){
		winHei = $(window).height();
		interWid = $(window).width()-200-17;
		//$(".intLeftNav").css('height',(winHei-42)+"px");
		$(".interfaceRight").css('width',interWid+"px");
		//$(".intRightCon").css('height',(winHei-78)+"px");
	});
	
	
	//选中一行td背景
	$("input[name='cheItem']:checkbox").bind('click',function(){
		
		if($(this).is(":checked"))
		{
			$(this).parents("tr").addClass("select");
		}else
		{
			$(this).parents("tr").removeClass("select");
			$("#manAllSelect").removeAttr('checked');
		}
		
		if($("input[name='cheItem']:checkbox").length==$("input[name='cheItem']:checked").length){
			$("#manAllSelect").attr('checked','checked');
			$("input[name='cheItem']:checkbox").parents("tr").addClass("select");
		}
		
	});
	
	//全选
	$("#manAllSelect").bind('click',function(){
		if($(this).is(":checked")){
			$("input[name='cheItem']:checkbox").attr('checked','checked');
			$("input[name='cheItem']:checkbox").parents("tr").addClass("select");
		}else{
			$("input[name='cheItem']:checkbox").removeAttr('checked');
			$("input[name='cheItem']:checkbox").parents("tr").removeClass("select");
		}
	});
	

	//删除
	/*
	$(".manDelete").bind('click',function(){
		
		var cheItem = $(this).parents("tr").find("input[name='cheItem']:checkbox");
		if(cheItem.is(":checked")){
			$(this).parents("tr").remove();
		}else{
			alert("请选择您要删除的信息！");
		}
		
		if(confirm("是否确定删除信息？")){
			$(this).parents("tr").remove();
		}
	})

	$("#selectDelete").bind('click',function(){
		if($("input[name='cheItem']:checked").length==0){
			alert("请选择您要删除的信息！");
		}
		else{
			
			if(confirm("是否确定删除选中信息？")){
				$("input[name='cheItem']:checked").parents("tr").remove();
			}
			
		}
		
	})*/
	
	$("input[vaild='yes']").bind('blur',function(){
	
		var value = $(this).val();
		//共过滤的字符 @ ！% * & # + - < > ~ ` [ ] { } \ / $ ^ = | 
		//不需要转义的 @ ！% * & #   - < > ~ ` [ ] { }         = 
		value = value.replace(/@|%|&|￥|#|-|《|<|>|》|~|`|\[|\]|【|】|\｛|\｝|\{|\}|=/g,'');
		//需要转义的                              +                   \ / $ ^   | 
		value = value.replace(/\+|\\|\/|\$|\^|\|/g,'');
		
		$(this).val(value);
	});
	
	checkPwd();

});

// 获取用户是否为默认密码
function checkPwd(){
	var cookieValue = getCookie("DEFAULT_PASSWORD_" + getCookie("PWD_USER_ID"));
	if(cookieValue != null && cookieValue == "yes"){
		if(confirm("您现在使用的是初始密码，为了提高账户安全，建议您尽快修改密码")){
			setCookie("DEFAULT_PASSWORD_" + getCookie("PWD_USER_ID"),"no",60 * 60 * 24 * 1000);
	        location = "/change_pwd/index.htm?defPwd=yes";
			return true;
		}else{
			setCookie("DEFAULT_PASSWORD_" + getCookie("PWD_USER_ID"),"no",60 * 60 * 24 * 1000);
			return false;
		} 
	}
}

$('.kc').live('mouseenter',function(e){
	var proId = $(this).attr("proId");
	jQuery.ajax({
		cache:false, 
		url:"/pro/getkc.htm",
		type:"post",
		data:{'proId':proId},
		success: function(data){
			if(data.action_status==1){
				var kc0 = typeof(data.Kc[0])=="undefined"?0:data.Kc[0];
				var kc1 = typeof(data.Kc[1])=="undefined"?0:data.Kc[1];
				var kc2 = typeof(data.Kc[2])=="undefined"?0:data.Kc[2];
				var kc3 = typeof(data.Kc[3])=="undefined"?0:data.Kc[3];
				var kc4 = typeof(data.Kc[4])=="undefined"?0:data.Kc[4];
				var kc5 = typeof(data.Kc[5])=="undefined"?0:data.Kc[5];
				var kc6 = typeof(data.Kc[6])=="undefined"?0:data.Kc[6];
				var content="";
				    content+="<tr><td>"+data.totalKc+"</td><td>"+kc0+"</td><td>"+kc1+"</td><td>"+kc2+"</td><td>"+kc3+"</td><td>"+kc4+"</td><td>"+kc5+"</td><td>"+kc6+"</td></tr>";
				$(".kcclass").html(content);
			}else if(data.action_status != null){
				alert(data.action_msgs);
			}else{
				alert("查询库存信息失败");
			}
    	},
		 error:function(){
			 alert("查询失败");
		 }
	});
	var Left = e.pageX-110;
	var Top = e.pageY+110;
	$('.positionBox').css({'top':Top,"left":Left}).show();
});
$('.kcSuitId').live('mouseenter',function(e){
	var actId = $(this).attr("actId");
	jQuery.ajax({
		cache:false, 
		url:"/actSuit/getSuitkc.htm",
		type:"post",
		data:{'actId':actId},
		success: function(data){
			if(data.action_status==1){
				var kc0 = typeof(data.Kc[0])=="undefined"?0:data.Kc[0];
				var kc1 = typeof(data.Kc[1])=="undefined"?0:data.Kc[1];
				var kc2 = typeof(data.Kc[2])=="undefined"?0:data.Kc[2];
				var kc3 = typeof(data.Kc[3])=="undefined"?0:data.Kc[3];
				var kc4 = typeof(data.Kc[4])=="undefined"?0:data.Kc[4];
				var kc5 = typeof(data.Kc[5])=="undefined"?0:data.Kc[5];
				var kc6 = typeof(data.Kc[6])=="undefined"?0:data.Kc[6];
				var content="";
				    content+="<tr><td>"+data.totalKc+"</td><td>"+kc0+"</td><td>"+kc1+"</td><td>"+kc2+"</td><td>"+kc3+"</td><td>"+kc4+"</td><td>"+kc5+"</td><td>"+kc6+"</td></tr>";
				$(".kcclass").html(content);
			}else{
				var content="";
				content+="<tr><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td></tr>";
				$(".kcclass").html(content);
			}
    	},
		 error:function(){
			var content="";
			content+="<tr><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td></tr>";
			$(".kcclass").html(content);
		 }
	});
	var Left = e.pageX-110;
	var Top = e.pageY+110;
	$('.positionBox').css({'top':Top,"left":Left}).show();
});
//隐藏库存弹框
$('.kcSuitId').live('mouseout',function(e){
	$(".positionBox").hide();
});
$('.kcSuitId').live('mouseleave',function(e){
	$(".positionBox").hide();
});
//获取个分仓库存
/*function getKC(proId){
	jQuery.ajax({
		cache:false, 
		url:"/pro/getkc.htm",
		type:"post",
		data:{'proId':proId},
		success: function(data){
			if(data.action_status==1){
				var kc0 = typeof(data.Kc[0])=="undefined"?0:data.Kc[0];
				var kc1 = typeof(data.Kc[1])=="undefined"?0:data.Kc[1];
				var kc2 = typeof(data.Kc[2])=="undefined"?0:data.Kc[2];
				var kc3 = typeof(data.Kc[3])=="undefined"?0:data.Kc[3];
				var kc4 = typeof(data.Kc[4])=="undefined"?0:data.Kc[4];
				var content="";
				    content+="<tr><td>"+data.totalKc+"</td><td>"+kc0+"</td><td>"+kc1+"</td><td>"+kc2+"</td><td>"+kc3+"</td><td>"+kc4+"</td></tr>";
				$(".kcclass").html(content);
			}else if(data.action_status != null){
				alert(data.action_msgs);
			}else{
				alert("查询库存信息失败");
			}
    	},
		 error:function(){
			 alert("查询失败");
		 }
	});
}*/
// 获取cookie
function getCookie(cookieName){ 
	var cookiestring = document.cookie; 
	var start = cookiestring.indexOf(cookieName + '='); 
	if(start == -1){
		return null; 
	}
	start += cookieName.length + 1; 
	var end = cookiestring.indexOf( ";", start); 
	if(end == -1){
		return unescape(cookiestring.substring(start));
	}
	return unescape(cookiestring.substring(start, end)); 
}

// 设置cookie
function setCookie(name,value,age){
	var exp = new Date();
	exp.setTime(exp.getTime() + age);
	document.cookie = name + "=" + escape (value) + ";expires=" + exp.toGMTString() + ";path=/";
}
function setpageNum(url,item){
	var pageNum=$("#pageNum").val();
	if(pageNum==null || pageNum==""){
		alert("请输入页码");
		return false;
	}
	var reg=/^\s|[1-9]\d*$/;
	if(pageNum.match(reg)==null){
		alert("请输入首页到末页的整数！");
		return false;
	}
	//添加一个参数
	var mark = $("#messageBox").data("mark");
	var pageNum2 = $(item).parent().children(".everyPagesSum").children("span").children("#pageNum").val();
	if(url.indexOf("shopApplyBill/detail.htm") != -1 || url.indexOf("shopStatement/detail.htm") != -1){
		if(url.indexOf("&mark=") != -1){
			var temp = url.substring(url.indexOf("&mark="));
			url = url.replace(temp,"");
		}
		url=url+"&pageNum="+pageNum2+"&mark="+mark;
	}else{
		url=url+"&pageNum="+pageNum2;
	}
	location.href=url;
}
//分页选择页面数量
function jumpByPageSize(url, pageSize){
	location.href=url+"&pageSize="+pageSize;
}