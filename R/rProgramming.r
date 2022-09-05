
word_length <- function(words){
    wl <- c()# created empty vector
    for(word in words){#iterate over words vector
        length <- nchar(word)#find length of particular word
        wl <- append(wl,length)# append length to wl vecotr
    }
    return(wl)#return wl
}

word_length("fun")
word_length(c("mouse","king"))
word_length(c("tax","house","purple"))

#---------------------------------

longest_word <- function(words){
    mess <- ""
    if(length(words)>2 | length(words)<2){
        mess <- "Sorry. Please provide exactly two words to compare"
    }else{
        word1 <- words[1]
        word2 <- words[2]
        if(nchar(word1)>nchar(word2)){
            mess <- "The first word is longest,"
            mess <- paste(mess,nchar(word1),">",nchar(word2))
        }else if(nchar(word1)<nchar(word2)){
             mess <- "The second word is longest,"
             mess <- paste(mess,nchar(word1),"<",nchar(word2))
        }else{
             mess <- "Both words are"
             mess <- paste(mess,nchar(word1),"characters long")
        }
    }
    return(mess)#return wl
}

longest_word(c("mouse","king"))
longest_word(c("tax","house"))
longest_word(c("purple","orange"))
longest_word(c("purple","orange","red"))

------------------------------------------------------------------

shortest_word <- function(words){
    shortest_length <- Inf
    for(word in words){#iterate over words vector
        word_length <- nchar(word)#find length of particular word
        if(word_length < shortest_length){#update shortest_length
            shortest_length <- word_length
        }
    }
    return(shortest_length)#return shortest_length
}

shortest_word(c("mouse","king"))
shortest_word(c("tax","house"))
shortest_word(c("purple","orange"))

-------------------------------------------------------------------------
shortest_word <- function(words){
    s <-Inf
    ns <- Inf
    for(word in words){#iterate over words vector
        wl <- nchar(word)#find length of particular word
        if(wl < s){
           ns <- s
           s <- wl
        }else if(wl < ns &&  wl !=s){
            ns <- wl
        }
    }
    return(c(s,ns))
}

shortest_word(c("mouse","king","on"))
shortest_word(c("tax","house","blue"))
shortest_word(c("purple","red","turquoise"))

-----------------------------------------------------------------
shortest_word <- function(words){
    s <-Inf
    ns <- Inf
    sw <-""
    nsw <-""
    for(word in words){#iterate over words vector
        wl <- nchar(word)#find length of particular word
        if(wl < s){
           ns <- s
           nsw <- sw
           s <- wl
           sw <- word
        }else if(wl < ns){
            ns <- wl
            nsw <- word
        }
    }
    return(c(sw,nsw))
    
}

shortest_word(c("mouse","king","on"))
shortest_word(c("tax","house","blue"))
shortest_word(c("purple","red","turquoise"))
shortest_word(c("purple","red","tax"))

------------------------------------------------------------------------
