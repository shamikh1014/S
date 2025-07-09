export async function getSongs(singerName = "Sonu Nigam") {
    const URL = `https://itunes.apple.com/search?term=${singerName}&limit=25`;
    try {
        const response = await fetch(URL);
        const data = await response.json();
        console.log('Data Rec From Itunes ', data);
        return data;
    }
    catch (err) {
        console.log(err);
        throw new Error('Something went wrong ' + err.message);
    }
}
// getSongs();
