appiclient = (function (){

    function getWinter(name, callback){
    //"https://bancoeci.herokuapp.com/
            $.get("http://localhost:8080/clima/"+name, function(data){
                    callback(data);
                }, 'json');

    }

    return {
            getWinter: getWinter
        };

})();



