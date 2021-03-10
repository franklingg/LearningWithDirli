smallestOf :: [String] -> String
biggestOf :: [String] -> String
smallestOf [x] = x
smallestOf (x:xs) 
    | (length x) <= (length smallWord) = x
    | otherwise = smallWord
    where smallWord = smallestOf xs
biggestOf [x] = x
biggestOf (x:xs) 
    | (length x) >= (length bigWord) = x
    | otherwise = bigWord
    where bigWord = biggestOf xs

main = do
    words <- sequence (replicate 5 getLine)

    putStrLn (smallestOf words)
    putStrLn (biggestOf words)
