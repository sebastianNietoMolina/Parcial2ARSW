appiclient = (function (){

    function getWinter(name, callback){
    //
            $.get("https://bancoeci.herokuapp.com/"+name, function(data){
                    callback(data);
                }, 'json');

    }

    return {
            getWinter: getWinter
        };

})();



