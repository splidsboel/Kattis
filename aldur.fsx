open System 




let rec findYoungest = function
    |(0, currentMin) -> currentMin
    |(n, currentMin) -> 
        let age = System.Console.ReadLine() |> int
        let newMin = if age < currentMin then age else currentMin
        findYoungest ((n-1), newMin)

    
let n = System.Console.ReadLine() |> int

let youngest = findYoungest (n, System.Int32.MaxValue)

printfn "%d" youngest