blackwhite :: [Int]-> String
blackwhite [r,g,b]
    | (r < 128) || (g < 128) || (b < 128) = "PRETO"
    | otherwise = "BRANCO"

main = do
    rs <- sequence (replicate 3 getLine)
    putStrLn (blackwhite (map read rs :: [Int]))