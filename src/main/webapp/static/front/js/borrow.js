	function borrow(){
		var userid = ${data.id};
		var name = $("#mc").val();
		$.ajax({
			url:"/borrow",
			type:"post",
			data:{"readid":userid,"bookname":name},
			dataType:"json",
			success:function(result){
				alert(result.msg);
			}
		});
	}