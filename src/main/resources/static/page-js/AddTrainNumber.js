function addTrainNumber() {
    var url = get_nap() + "ManageTrainNumber/addTrainNumber";
    var data = {
        "trainId": document.getElementById('trainId').value,
        "trainNumber": document.getElementById('trainNumber').value,
        "startingTime": document.getElementById('startingTime').value,
        "price": document.getElementById('price').value,
        "startingStation": document.getElementById('startingStation').value,
        "endingStation": document.getElementById('endingStation').value
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