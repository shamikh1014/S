import { readFileStr } from "https://deno.land/std/fs/mod.ts";

var promise = readFileStr("./readingfile.ts", { encoding: "utf8" });

promise.then((content) => console.log("Content is ", content))
    .catch((err) => console.log("Error ", err));
