use std::{fs::read, vec};

use nom::{IResult, bytes::complete::tag, character::complete::i32, character::complete::digit1};
use nom::character::complete::{alpha1, alphanumeric0};
use nom::sequence::pair;
use nom::branch::alt;
use nom::sequence::delimited;
use nom::character::complete::multispace0;
use nom::multi::many0;



#[derive(Debug,PartialEq, Eq)]
enum Token {
    Id(String),
    Num(i32),
    Equal,
    Minus,
    Plus,
    Mult
}

fn main(){
    let exp = "3 + BaaaaaaB * 20 * 10 * 40";

    let (unprocessed, result) = lex(exp).unwrap();
    println!("{:?}", result);
}



fn plus(input: &str) -> IResult<&str, Token> {
    let (input, _) = tag("+")(input)?;
    Ok((input, Token::Plus))
}

fn minus(input: &str) -> IResult<&str, Token> {
    let (input, _) = tag("-")(input)?;
    Ok((input, Token::Minus))
}

fn mult(input: &str) -> IResult<&str, Token> {
    let (input, _) = tag("*")(input)?;
    Ok((input, Token::Mult))
}

fn equal(input: &str) -> IResult<&str, Token> {
    let (input, _) = tag("=")(input)?;
    Ok((input, Token::Equal))
}

fn number(input: &str) -> IResult<&str, Token> {
    let (input, num) = digit1(input)?; // Num⁺
    Ok((input, Token::Num(num.parse().unwrap())))
}

fn identifier(input: &str) -> IResult<&str, Token> {
    let (input, (first, rest)) =
        pair(alpha1, alphanumeric0)(input)?;

    let mut id = first.to_string();
    id.push_str(rest);

    Ok((input, Token::Id(id)))
}

fn token(input: &str) -> IResult<&str, Token> {
    alt((number, identifier, plus, minus, mult, equal))(input)
}

fn token_ws(input: &str) -> IResult<&str, Token> {
    delimited(multispace0, token, multispace0)(input)
}

fn lex(input: &str) -> IResult<&str, Vec<Token>> {
    many0(token_ws)(input)
}

#[test]
fn test_sum() {
    let expression = "1 + 2";

    let result = lex(expression);

    let expected_result = vec![
        Token::Num(1),
        Token::Plus,
        Token::Num(2),
    ];

    let (rest, tokens) = result.unwrap();

    assert_eq!(rest, "");
    assert_eq!(tokens, expected_result);
}
    

fn test_sub() {
}

fn test_sum_sub(){

}