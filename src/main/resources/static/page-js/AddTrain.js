function addTrain() {
    var url = get_nap() + "Manage_Train/add_train";
    console.log();
    $.ajax({
        type: "get",
        url: url,
        async: false,
        data: {
            "trainId": document.getElementById('trainId').value,
            "capacity": document.getElementById('capacity').value
        },
        success: function (data) {
            window.location = getCrossFieldNap() + "left.html";
        },
        error: function (error) {
            alert(JSON.stringify(error));
        }
    });

}