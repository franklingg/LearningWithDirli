sorvetao :: Int -> Int -> Int -> Int -> Int -> Int
sorvetao p1 v1 p2 v2 t = abs (p1 + v1 * t - p2 - v2 * t)

main = do
    problemData <- sequence (replicate 5 getLine)
    let [pos1, vel1, pos2, vel2, time] = map read problemData :: [Int]

    print (sorvetao pos1 vel1 pos2 vel2 time)