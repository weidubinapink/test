
    This is my HTML page. <br>
			${name}<br>
			
			<#list list as user>
				${user}
			</#list>
			
			<#if sex == 1>
				男
			<#elseif sex == 0>
				女
			<#else> 
				不男不女
			</#if>