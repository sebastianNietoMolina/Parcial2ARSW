var app = (function () {


    function init(){
        var nombre = $("#name").val();
        appiclient.getWinter(nombre, _prettyPrint);
    }

    function _prettyPrint(data){
        console.log(data);
        data.map(function (info) {
            $("#tabla > tbody").append(
                "<tr> <td>"  info.coor.lon+"</td> <td>"
                + info.coo.lat + "</td> <td>"
                + info.clima+ "</td> <td>"
                + info.visibility+"</td></td>"
                + info.dt+"</td></td>"
                + info.id+"</td></td>"
                + info.name+"</td></td>"
                + info.timezone+"</td></tr>"
            );
        });

    }






    return {
        init: init
    };

})();