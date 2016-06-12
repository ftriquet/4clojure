;(= (__ [1 2 3 4 5]) 5)
;(= (__ '(5 4 3)) 3)
;(= (__ ["b" "c" "d"]) "d")

(def answer (fn [s]
              (loop [n    (count s)
                     sub  s]
                (if (= 1 n) (first sub) (recur (dec n) (rest sub))))))

(println (= (answer [1 2 3 4 5]) 5))
(println (= (answer '(5 4 3)) 3))
(println (= (answer ["b" "c" "d"]) "d"))
