;Write a higher-order function which flips the order of the arguments of an input function.
;(= 3 ((__ nth) 2 [1 2 3 4 5]))
;(= true ((__ >) 7 8))
;(= 4 ((__ quot) 2 8))
;(= [1 2 3] ((__ take) [1 2 3 4 5] 3))


(def answer
  (fn [f]
    #(f %2 %1)))

(println (= 3 ((answer nth) 2 [1 2 3 4 5])))
(println (= true ((answer >) 7 8)))
(println (= 4 ((answer quot) 2 8)))
(println (= [1 2 3] ((answer take) [1 2 3 4 5] 3)))
