import { getAllSongs } from "./song-operations.js";
/*
<div class="card" style="width: 18rem;">
    <img src="..." class="card-img-top" alt="...">
    <div class="card-body">
        <h5 class="card-title">Card title</h5>
        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
    </div>
</div>
*/
getAllSongsBySinger();
async function getAllSongsBySinger() {
    const singer = await getAllSongs();
    singer.forEach(singer => {
        const cardDiv = prepareCard(singer);
        const div = document.querySelector('#songs');
        div?.appendChild(cardDiv);
    });
}
function prepareCard(singer) {
    const cardDiv = document.createElement('div'); // prepare <div></div>
    cardDiv.className = 'card';
    cardDiv.style.width = '18rem';
    const image = document.createElement('img'); // <img/>
    image.src = singer.photo;
    image.className = 'card-img-top';
    cardDiv.appendChild(image);
    const cardBody = document.createElement('div');
    cardBody.className = 'card-body';
    const h5 = document.createElement('h5');
    h5.innerText = singer.name;
    h5.className = 'card-title';
    cardBody.appendChild(h5);
    cardDiv.appendChild(cardBody);
    const p = document.createElement('p');
    p.innerText = singer.title;
    p.className = 'card-text';
    cardBody.appendChild(p);
    const audioTag = document.createElement('audio');
    audioTag.src = singer.audio;
    audioTag.controls = true;
    // audioTag.type='audio/mp4';
    cardBody.appendChild(audioTag);
    return cardDiv;
}
