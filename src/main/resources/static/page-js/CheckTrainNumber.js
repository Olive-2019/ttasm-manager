
window.onload = function init() {
    // console.log("Lamm");
    // alert("load");
    showData();
}

function showData() {
    var url = get_nap() + "ManageTrainNumber/selectAll";
    $.ajax({
        type: "get",
        url: url,
        async: false,
        success: function(data){
            console.log(data);
            var table = document.getElementById('trainNumberTable');
            for (var i = 0; i < data.length; ++i) {
                var tr = document.createElement('tr');
                tr.setAttribute('class', "odd gradeX");
                table.appendChild(tr);

                var hash = ['trainNumber', 'trainId', 'startingTime', 'startingStation', 'endingStation', 'price'];
                for (var j = 0; j < hash.length; ++j) {
                    var td = document.createElement('td');
                    td.innerHTML = data[i][hash[j]];
                    tr.appendChild(td);
                }


                var modify_td  = document.createElement('td');
                var modify_button = document.createElement('input');
                modify_button.setAttribute('type','button');
                modify_button.setAttribute('value','修改');
                var modify_onclick = "(function (){modifyTrainNumber(\'" + data[i]['trainNumber'] + "\')})()";
                modify_button.setAttribute('onclick', modify_onclick);
                modify_button.setAttribute("class", "btn btn-primary");
                modify_td.appendChild(modify_button);
                tr.appendChild(modify_td);


                var td  = document.createElement('td');
                var button = document.createElement('input');
                button.setAttribute('type','button');
                button.setAttribute('value','删除');
                button.setAttribute("class", "btn btn-primary");
                var onclick = "(function (){deleteTrainNumber(\'" + data[i]['trainNumber'] + "\')})()";
                // alert(onclick);
                button.setAttribute('onclick', onclick);
                td.appendChild(button);
                tr.appendChild(td);

            }
        },
        error: function (error) {
            alert(JSON.stringify(error));
        }
    });
}
function deleteTrainNumber(trainNumber) {
    var url = get_nap() + "ManageTrainNumber/deleteByPrimaryKey";

    var data = {
        "trainNumber": trainNumber
    };
    $.ajax({
        type: "get",
        url: url,
        async: false,
        data: data,
        success: function (data) {
            window.location = getCrossFieldNap() + "left.html";
        },
        error: function (error) {
            alert(JSON.stringify(error));
        }
    });
}
function modifyTrainNumber(trainNumber) {
    window.location = getCrossFieldNap() + "ModifyTrainNumber.html?trainNumber=" + trainNumber;
}