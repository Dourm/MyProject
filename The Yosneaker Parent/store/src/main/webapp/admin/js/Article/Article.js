var article={
		serverUrl:'/admin/article',		
		fmtOperate:function(val, row, index){
			return '<a href="javascript:void(0);" onclick="article.openUpdate('+index+')">修改</a>'+
			'&nbsp;&nbsp;<a href="javascript:void(0);" onclick="article.del('+val+')">删除</a>';
		},
		openCreate:function(){
			 $("#createSiteForm").form("clear");
			 $('#createSite').dialog("open");   
			 $('[name="isvalid"]:radio').each(function() {   
				    if (this.value == '0'){   
				       this.checked = true;   
				    }       
			 });   
			 $('[name="isauth"]:radio').each(function() {   
				    if (this.value == '1'){   
				       this.checked = true;   
				    }       
			 });   
		},
		search:function(){
			var gradeName=$("#gradeName").val();			
			var sysCode = $("#sysCode").combobox("getValue");
			$('#site-datagrid').datagrid("reload",{gradeName:gradeName,sysCode:sysCode});	
		},
		openUpdate:function(index){
			var row =($('#site-datagrid').datagrid('getRows'))[index];
			$('#updateSite').form('load',row);
			$('#updateSite').dialog("open"); 
			
		},
		save:function(){
			$('#createSiteForm').form('submit',{
			    url:this.serverUrl,
			    onSubmit:function(param){
			       return $(this).form('validate');
			    },
			    success:function(data){
			    	data=JSON.StrToJSON(data);
			    	if(data.success)
		    		{
			    		$('#createSite').dialog("close");
				    	$.messager.show({
				    		msg:data.msg,
				    		timeout:2000
				    	});				    	
				    	$('#site-datagrid').datagrid("reload");
		    		}	
			    	else
			    		{
					    	alert(data.msg);					    		
			    		}
			    }
			});
		},
		update:function(){
			var id=$("#up_id").val();
			$('#updateSiteForm').form('submit',{
			    url:this.serverUrl+"/"+id,
			    onSubmit:function(param){
			       return $(this).form('validate');
			    },
			    success:function(data){
			    	data=JSON.StrToJSON(data);
			    	if(data.success)
		    		{			    	
				    	$('#updateSite').dialog("close");   
				    	$.messager.show({
				    		msg:data.msg,
				    		timeout:2000
				    	});
				    	$('#site-datagrid').datagrid("reload");
		    		}
			    	else
		    		{
		    			alert(data.msg);
		    		}
			    }
			});
		},
		del:function(id){
			var _url = this.serverUrl;
			$.messager.confirm("提示","确认要删除此信息吗",function(b){
				if(b){
					$.ajax({
						dataType:"json",
						url:_url+"/"+id,
						type: 'DELETE',	
						success :function(data){
							$('#site-datagrid').datagrid("reload");
					    	$.messager.show({
					    		msg:data.msg,
					    		timeout:2000
					    	});
						}
					});
				}
			});
		},
		reSearch:function(){
			$('#query_form').form("reset");
		}	
};

