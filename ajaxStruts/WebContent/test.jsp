<%@taglib  prefix="s" uri="/struts-tags" %>
<div id="leftDiv">
<s:include value="/pages/profile.jsp"></s:include>
</div>
<div>
<a href="#" id="idAnchor">Partial Refresh</a>
</div>
<script language="JavaScript" type="text/javascript">
$(document).ready(function(){
$('#idAnchor').click(function(){

$.ajax({
            url: 'getResultAction', // action to be perform
           type: 'POST',       //type of posting the data
           data: { name: 'Jeetu', age: '24' }, // data to set to Action Class
       dataType: 'html',
       success: function (html) {
        ('#leftDiv').html(html); //set result.jsp output to leftDiv 
       },
       error: function(xhr, ajaxOptions, thrownError){
          alert('An error occurred! ' + thrownError);
       },
  });
    });
})
</script>