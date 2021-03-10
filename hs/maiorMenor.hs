tupleOrdered :: String -> String -> (String, String)
tupleOrdered fst snd
    | length fst < length snd = (fst, snd)
    | length fst > length snd = (snd, fst)
    | otherwise = (fst, fst)

main = do
    first <- getLine
    second <- getLine
    let ordered = tupleOrdered first second
    putStrLn (fst ordered)
    putStrLn (snd ordered)
    