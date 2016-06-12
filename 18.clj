;(= __ (filter #(> % 5) '(3 4 5 6 7)))

(def answer '(6 7))
(println (= answer (filter #(> % 5) '(3 4 5 6 7))))
