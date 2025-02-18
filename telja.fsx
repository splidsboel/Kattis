open System

let x = System.Console.ReadLine() |> int

let rec counter n =
    match n with 
    |n when n> x-> ()
    |n ->
        printfn "%d" n
        counter (n+1)

counter 1