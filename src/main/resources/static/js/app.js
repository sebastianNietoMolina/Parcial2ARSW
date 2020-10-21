var app = (function () {

    var newData;
    var Country;

    function init(){
        var nombre = $("#name").val();
        appiclient.getWinter(nombre, _prettyPrint);
    }

    function _prettyPrint(data){
        newData = data;
        data.map(function (pais) {
            $("#tabla > tbody").append(
                "<tr> <td>" + pais.country
                +"</button></form>"+ "</td> <td>"
                + pais.deaths + "</td> <td>"
                + pais.confirmed+ "</td> <td>" + pais.recovered+"</td></tr>"
            );
        });

    }






    return {
        init: init,
        getDataByCountry: getDataByCountry
    };

})();