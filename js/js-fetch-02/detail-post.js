const urlParams = new URLSearchParams(window.location.search);
const postId = urlParams.get('id');

fetch(`https://jsonplaceholder.typicode.com/posts/${postId}`,{
   method: 'GET'
})
.then((response) => response.json())
.then((data) => {
    showPostDetail(data);
})
.catch((error) => {
    console.error("Veri alınırken hata ile karşılaşıldı.  " + error)
})


function showPostDetail(data) {
    const postDetails = document.getElementById('post-details');
    postDetails.innerHTML = `
    <h2>${data.title}</h2>
    <p>${data.body}</p>
    `
}