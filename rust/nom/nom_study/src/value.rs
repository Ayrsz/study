use std::Vec;


enum Token <'a>{
    Id(&str),
    Num(i32),
    Equal,
    Minus,
    Plus,
    Mult
}

fn read_tokens(text : &str) -> Vec<Token>{
    let mut xs = vec![1i32, 2, 3];
    println!("Initial vector: {:?}", xs);

    //while(true){
    //    
    //}

}