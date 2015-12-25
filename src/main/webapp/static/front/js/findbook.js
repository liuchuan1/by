	function findn(){
		var name = $("#mc").val();
		$.ajax({
			url:"/findb",
			type:"post",
			data:{"bookname":name},
			dataType:"json",
			success:function(result){
				$("#num").append(result.data.bookcode);
				$("#ty").append(result.data.type)
				$("#pb").append(result.data.pubname)
				$("#bs").append(result.data.bcase)
				$("#sg").append(result.data.storsge)
			}
		});
	}