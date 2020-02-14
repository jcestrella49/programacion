module Funcional where

division :: Int -> Int -> Int
division x y = x `div` y

cuadrado :: Int -> Int
cuadrado x = x * x

qsort [] = []
qsort (x:xs) = qsort menores ++ [x] ++ qsort mayores
  where menores = filter (<x) xs
        mayores = filter (>=x) xs

esMayor x y = if (x > y)
    then "es mayor"
    else "no es mayor"
