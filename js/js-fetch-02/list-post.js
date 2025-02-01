fetch('https://jsonplaceholder.typicode.com/posts',{
    method:'GET'
})
.then((response) => response.json())
.then((data) => {
    updateTable(data)
})

function updateTable(posts) {
    const tableBody = document.getElementById('post-table');
    
    posts.forEach(element => {
        const row = document.createElement('tr');
        row.innerHTML = `
        <td>${element.id}</td>
        <td>${element.title}</td>
        <td>${element.body}</td>
        <td><button class="btn btn-primary" onclick="detailButton(${element.id})">Detail</button></td>
        `
        tableBody.appendChild(row);
    });
}

function detailButton(postId) {
    console.log("here is detail")
    console.log(postId)
    location.href = `detail-post.html?id=${postId} `
}