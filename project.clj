(defproject program ""
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/core.async "1.5.648"]

                 [com.formdev/flatlaf "2.1"]
                 [com.formdev/flatlaf-extras "2.1"]
                 [com.miglayout/miglayout-swing "5.3"]

                 [io.replikativ/datahike "0.5.1504"]]

  :source-paths ["src"]
  :target-path "out/"

  :main Tamatoa.main
  :profiles {:uberjar {:aot :all}}
  :repl-options {:init-ns Tamatoa.main}

  :uberjar-name "Tamatoa.jar")