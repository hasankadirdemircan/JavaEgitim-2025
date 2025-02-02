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
        `;
        tableBody.appendChild(row);
    });
}