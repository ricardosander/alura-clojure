(ns forca.core
  (:gen-class))

(defn fib [n] 
	(if (= n 0) 0
	(if (= n 1) 1
	(+ (fib (- n 1)) (fib (- n 2)))
	))
)

(def total-de-vidas 6)

(defn perdeu [] (print "Você perdeu!"))

(defn ganhou [] (print "Você ganhou!"))

(defn acertou-a-palavra-toda? [palavra acertos] 
	(empty? (letras-faltantes palavra acertos))
)

(defn letras-faltantes[palavra acertos]
	(remove (fn [letra] (contains? acertos (str letra))) palavra)
)

(defn jogo [vidas palavra acertos]
	(if (= vidas 0)
		(perdeu)
		(if (acertou-a-palavra-toda? palavra acertos)
			(ganhou)
			(print "Chuta, amigo!")
		)		
	)
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
