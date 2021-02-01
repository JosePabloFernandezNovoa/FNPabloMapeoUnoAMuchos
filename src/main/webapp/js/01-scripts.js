$(function(){
    $('#mas').on('click', function(e){
        e.preventDefault();
        $('#correos').append($("<td><input></input></td>").attr("type", "text").attr("name", "denominacion").attr("value","").attr("required"));
    });
});