;(= __ ((fn add-five [x] (+ x 5)) 3))
;(= __ ((fn [x] (+ x 5)) 3))
;(= __ (#(+ % 5) 3))
;(= __ ((partial + 5) 3))

(def answer 8)
(= answer ((fn add-five [x] (+ x 5)) 3))
(= answer ((fn [x] (+ x 5)) 3))
(= answer (#(+ % 5) 3))
(= answer ((partial + 5) 3))
