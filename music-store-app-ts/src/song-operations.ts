// make call to apiclient

import {getSongs} from "./api-client.js";
import Singer from "./singer-model.js";

// get the data and fill in model

export async function getAllSongs(singerName="Sonu Nigam"){
    const data=await getSongs();
    const singers:Singer[]=[];
    data.results.map((obj:any)=>{
        const singer:Singer=new Singer(obj['artistName'], obj['trackName'], obj['artworkUrl'], obj['previewUrl']);
        singers.push(singer);
    });
    console.log('ALL DATA IS ', singers);
    return singers;
}
getAllSongs();