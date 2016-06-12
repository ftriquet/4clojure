;Can you bind x, y, and z so that these are all true?
;(= 10 (let __ (+ x y)))
;(= 4 (let __ (+ y z)))
;(= 1 (let __ z))

(println (= 10 (let [z 1, y 3, x 7] (+ x y))))
(println (= 4 (let [z 1, y 3, x 7] (+ y z))))
(println (= 1 (let [z 1, y 3, x 7] z)))
