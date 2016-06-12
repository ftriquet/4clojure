;(= __ (map #(+ % 5) '(1 2 3)))

(def answer '(6 7 8))
(println (= answer (map #(+ % 5) '(1 2 3))))
