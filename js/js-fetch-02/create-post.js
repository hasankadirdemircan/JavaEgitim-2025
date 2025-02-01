const postForm = document.getElementById('post-form');

postForm.addEventListener('submit', function(event) {
    event.preventDefault();
    
    const title = document.getElementById('title').value;
    const body = document.getElementById('body').value;

    console.log("title: ", title)
    console.log("body: ", body)

    fetch('https://jsonplaceholder.typicode.com/posts', {
        method: 'POST',
        body: JSON.stringify({
            title: title,
            body: body,
            userId: 1
        }),
        headers: {
            'Content-type': 'application/json; charset=UTF-8'
        },
    }).then((response) => {
        if(!response.ok) {
            throw new Error('while creating a new post occours an error , status: ' + response.status)
        }

        return response.json();
    }).then((data) => {
        console.log('created a post : ', data)
        alert('Created Post')
        postForm.reset();
    }).catch((error) => {
        console.error(error)
    })
})