document.getElementById('updateButton').style.visibility = 'hidden';

fetch('http://127.0.0.1:8085/api/users', {
    method: 'GET'
}).then((response) => response.json())
    .then((data) => {
        console.log("data");
        console.log(data);
        updateTable(data);
    })


function updateTable(data) {
    console.log("updateTable method");
    console.log(data);

    const tableBody = document.getElementById('table-body');
    data.forEach(element => {
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>${element.id}</td>
            <td>${element.age}</td>
            <td>${element.city}</td>
            <td>${element.firstName}</td>
            <td>${element.lastName}</td>
            <td>${element.salary}</td>
            <td><button class="btn btn-danger" onclick="deleteUser(${element.id})"> Delete </button>
            <td><button class="btn btn-warning" onclick="updateUser(${element.id})"> Update </button>
            `;
        tableBody.appendChild(row);
    });
}

function updateUser(id) {
    document.getElementById('saveButton').style.visibility = 'hidden';
    document.getElementById('updateButton').style.visibility = 'visible';

    console.log("updateUser", id)
    fetch('http://127.0.0.1:8085/api/users/'+id, {
        method: 'GET'
    }).then((response) => response.json())
        .then((user) => {
            console.log("user");
            console.log(user);
            document.getElementById('firstName').value = user.firstName
            document.getElementById('lastName').value = user.lastName
            document.getElementById('salary').value = user.salary
            document.getElementById('city').value = user.city
            document.getElementById('age').value = user.age
            document.getElementById('userId').value = user.id
        })
    
}


function deleteUser(id) {
    console.log("user id : ", id)
    fetch('http://127.0.0.1:8085/api/users/'+id, {
        method: 'DELETE'
    }).then((data) => {
            console.log("delete success")
            window.location.reload();
        })
}


document.querySelector("#createUser").addEventListener("submit", function(e){
        const form = document.getElementById('createUser');
       
        e.preventDefault();    //stop form from submitting
        console.log("submit function ")
        const firstName = document.getElementById('firstName').value
        const lastName = document.getElementById('lastName').value
        const salary = document.getElementById('salary').value
        const city = document.getElementById('city').value
        const age = document.getElementById('age').value
        const id = document.getElementById('userId').value
        console.log("firstName: ", firstName)
        console.log("lastName: ", lastName)
        console.log("salary: ", salary)
        console.log("city: ", city)
        console.log("age: ", age)
        console.log("id : ", id)
        form.reset();

        fetch('http://127.0.0.1:8085/api/users/create', {
            method: 'POST',
            headers: {
                'Accept': 'application/json, text/plain, */*',
                'Content-Type': 'application/json'
              },
            body: JSON.stringify({firstName: firstName, lastName: lastName,
                salary: salary, city: city, age: age, id: id
            })
        }).then((response) => response.json())
        .then((data) => {
            console.log("data");
            console.log(data);
            window.location.reload();
        })
});