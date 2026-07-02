/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let current = 0;   // pehla number
    let next = 1;      // dusra number
    
    while (true) {//yha  dekh //eg dekh call couunt likha h function utni baar call hoga hmmmmmmmmmmmmmmmmmmmmmm
        yield current;   // 🛑 current value bhejo aur ruk jao//idhar how//kuch toh ho rha
        [current, next] = [next, current + next];   // ▶️ resume par values update karo
    }//mereko lag rha oops use kra h something func bana diya bass //baki ka connection
};//thing is ye stop kb ho rha

/**
 * const gen = fibGenerator();//---------->isse h kuch 
 * gen.next().value; // 0
 * gen.next().value; // 1
 */