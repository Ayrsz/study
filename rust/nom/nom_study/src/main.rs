use std::fs::read;

use nom::{IResult, bytes::complete::tag, character::complete::i32};

#[derive(Debug)]
enum Token <'a>{
    Id(&'a str),
    Num(i32),
    Equal,
    Minus,
    Plus,
    Mult
}
//Allow to print the object
#[derive(Debug)]
struct Point3D{
    pub _x : i32,
    pub _y : i32,
    pub _z  : i32
}

fn main(){
    let s = "Point: (2, 17, -11)";

    //Return a value Result unwrapped into two values, if it was a sucess
    let (_ , point) = parse_point(s).unwrap();

    let a = read_tokens(s);
    println!("{:?}", point);

}


//fn (input: I) -> IResult<I, O> | I = Input e O = Output
fn parse_point(input : &str) -> IResult<&str, Point3D>{

    //The result are in the form (unprecessed string, searched_char)
    let (input, _) = tag("Point: ")(input)?;
    let (input, _) = tag("(")(input)?;
    let (input, _x) = i32(input)?;
    let (input, _) = tag(", ")(input)?;
    let (input, _y) = i32(input)?;
    let (input, _) = tag(", ")(input)?;
    let (input, _z) = i32(input)?;
    let (input, _) = tag(")")(input)?;
    
    return Ok((input, Point3D{_x, _y, _z}))

}

fn read_tokens(text : &str) -> IResult<&str, Vec<Token>>{
    let mut tokens : Vec<Token> = Vec::new();

    tokens.push(Token::Equal);

    println!("Initial vector: {:?}", tokens);
    return Ok((text, tokens))
    //while(true){
    //    
    //}

}