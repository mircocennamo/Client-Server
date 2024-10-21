#TEORIA E PRATICA DI PROGRAMMAZIONE DI RETE

La programmazione di rete in Java permette alle applicazioni di comunicare tra loro tramite protocolli di rete come TCP e UDP. 
Utilizzando la Java Development Kit (JDK) standard, puoi sfruttare le classi fornite nel pacchetto java.net per realizzare comunicazioni client-server, trasferire dati e gestire connessioni di rete. Ecco una panoramica teorica dei concetti fondamentali e degli esempi pratici di programmazione di rete in Java.

# Concetti base della programmazione di rete in Java
   Indirizzo IP
   L'indirizzo IP (Internet Protocol) identifica univocamente ogni dispositivo connesso a una rete. In Java, la classe InetAddress gestisce gli indirizzi IP.

Socket
Un socket rappresenta un punto finale di una connessione tra due dispositivi in rete. Ci sono due tipi principali di socket:

Socket TCP (Transmission Control Protocol): usato per comunicazioni affidabili, orientate alla connessione.

Socket UDP (User Datagram Protocol): usato per comunicazioni non affidabili e senza connessione.

ServerSocket
La classe ServerSocket gestisce i socket lato server, aspettando richieste di connessione dai client. Una volta accettata la connessione, il server comunica con il client tramite il socket.

# Classi principali di rete
   InetAddress: rappresenta un indirizzo IP.
   Socket: rappresenta un socket client (TCP).
   ServerSocket: rappresenta un socket server (TCP).
   DatagramSocket e DatagramPacket: usate per le connessioni UDP.


#   Differenze tra TCP e UDP
      TCP:
   
         Affidabile, orientato alla connessione.
         Garantisce che i pacchetti arrivino nell'ordine corretto.
         Più adatto per applicazioni in cui la correttezza dei dati è fondamentale, come trasferimenti di file o applicazioni web.
      UDP:

         Non affidabile, senza connessione.
         Non garantisce la consegna dei pacchetti né l'ordine corretto.
         Più veloce di TCP, adatto per applicazioni che richiedono velocità e tollerano la perdita di pacchetti, come giochi online o streaming.

# Conclusione
      Java fornisce un set completo di strumenti per realizzare applicazioni di rete tramite la sua libreria standard. Utilizzando classi come Socket, ServerSocket, DatagramSocket e InetAddress, puoi costruire applicazioni che comunicano su reti locali o su Internet usando protocolli come TCP e UDP.