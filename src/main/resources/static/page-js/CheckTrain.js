
// window.onload = function init() {
//     showData();
// }

function showData() {
    var url = get_nap() + "Manage_Train/selectAll";
    $.ajax({
        type: "get",
        url: url,
        async: false,
        success: function(data){
            console.log(data);
            var table = document.getElementById('train_table');
            for (var i = 0; i < data.length; ++i) {
                var tr = document.createElement('tr');
                tr.setAttribute('class', "odd gradeX");
                table.appendChild(tr);

                var trainID = document.createElement('td');
                trainID.innerHTML = data[i]['trainId'];
                tr.appendChild(trainID);

                var capacity = document.createElement('td');
                capacity.innerHTML = data[i]['capacity'];
                tr.appendChild(capacity);

                var modify_td  = document.createElement('td');
                var modify_button = document.createElement('input');
                modify_button.setAttribute('type','button');
                modify_button.setAttribute('value','修改');
                var modify_onclick = "(function (){modifyTrain(\'" + data[i]['trainId'] + "\')})()";
                modify_button.setAttribute('onclick', modify_onclick);
                modify_button.setAttribute('data-username', data[i]['username']);
                modify_button.setAttribute("class", "btn btn-primary");
                modify_td.appendChild(modify_button);
                tr.appendChild(modify_td);


                var td  = document.createElement('td');
                var button = document.createElement('input');
                button.setAttribute('type','button');
                button.setAttribute('value','删除');
                button.setAttribute("class", "btn btn-primary");
                var onclick = "(function (){deleteTrain(\'" + data[i]['trainId'] + "\')})()";
                // alert(onclick);
                button.setAttribute('onclick', onclick);
                button.setAttribute('data-username', data[i]['username']);
                td.appendChild(button);
                tr.appendChild(td);

            }
        },
        error: function (error) {
            alert(JSON.stringify(error));
        }
    });
}
function deleteTrain(trainId) {
    var url = get_nap() + "Manage_Train/deleteByPrimaryKey";

    alert(trainId);
    var data = {
        "trainId": trainId
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
function modifyTrain(trainId) {
    window.location = getCrossFieldNap() + "ModifyTrain.html?trainId=" + trainId;
}