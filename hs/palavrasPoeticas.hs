checaPoeticas :: String -> String -> Char
checaPoeticas p1 p2
    | head p1 == head p2 && last p1 == last p2 = 'S'
    | otherwise = 'N'

main = do
    w1 <- getLine
    w2 <- getLine

    putChar (checaPoeticas w1 w2)