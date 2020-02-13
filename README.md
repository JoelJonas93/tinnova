# tinnova

**Passo 1:** git clone https://github.com/JoelJonas93/tinnova.git

**Passo 2:** Configurar o application.properties para o banco local

**Passo 3:** Rodar o projetor para instalar as depedências do pom.xml

**Passo 4:** Testar as rotas no PostMan

  ######API Eleição
  GET http://localhost:{porta}/eleicao/validos/id => http://localhost:{porta}/eleicao/validos/1
  GET http://localhost:{porta}/eleicao/brancos/id => http://localhost:{porta}/eleicao/brancos/1
  GET http://localhost:{porta}/eleicao/nulos/id => http://localhost:{porta}/eleicao/nulos/1
  
  ######API Fatorial
  GET http://localhost:{porta}/fatorial/numero => http://localhost:{porta}/fatorial/5
  
  ######API BubbleSort
  POST http://localhost:{porta}/ordenabubble
  
  Configurar o PostMan para mandar JSON (raw JSON)  e mandar qualquer lista de inteiros ex: [2,6,3,7,4,1,9] e observar a saída
  da lista ordenada
  
  **Obs:**Alterar o código do método em OrdenaBubbleSortResouce para:
      	@PostMapping
        public ResponseEntity<?> ordenaBubble(@RequestParam("lista") int[] lista){

          int[] listaOrdenada =  ordena.ordenarListaInt(lista);
          return ResponseEntity.status(HttpStatus.CREATED).body(listaOrdenada);
        }
  
  ######API Soma dos multiplos de 3 e 5
  GET http://localhost:{porta}/somamultiplostrescinco/numero =>  http://localhost:{porta}/somamultiplostrescinco/10
