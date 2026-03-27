    
    
    // //fn (input: I) -> IResult<I, O> | I = Input e O = Output
    // fn parse_point(input : &str) -> IResult<&str, Point3D>{
        
    //     //The result are in the form (unprecessed string, searched_char)
    //     let (input, _) = tag("Point: ")(input)?;
    //     let (input, _) = tag("(")(input)?;
    //     let (input, _x) = i32(input)?;
    //     let (input, _) = tag(", ")(input)?;
    //     let (input, _y) = i32(input)?;
    //     let (input, _) = tag(", ")(input)?;
    //     let (input, _z) = i32(input)?;
    //     let (input, _) = tag(")")(input)?;
    
    //     return Ok((input, Point3D{_x, _y, _z}))
    
    // let (_ , point) = parse_point(s).unwrap();
    
    // let a = read_tokens(s);
    // println!("{:?}", point);
    // }.