fetch('https://jsonplaceholder.typicode.com/posts', {
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
            <td>${element.userId}</td>
            <td>${element.id}</td>
            <td>${element.title}</td>
            <td>${element.body}</td>
        `;
        tableBody.appendChild(row);
    });
}