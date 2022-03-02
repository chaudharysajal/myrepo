import { useState } from 'react';
import './App.css';

function RichText() {
let time;
const [boldStyle, setBoldStyle] = useState(true)
const [italicStyle, setItalicStyle] = useState(true)
const [underlineStyle, setUnderlineStyle] = useState(true)

const Submit = () =>{
    let data = document.getElementById("textarea").value
    console.log(data)
}

  const setBold= () =>{
    setBoldStyle(!boldStyle)
    if(boldStyle){
        document.documentElement.style.setProperty('--font', 'bold');}
    else{
        document.documentElement.style.setProperty('--font', 'initial');}
  }
  const setItalic= () =>{
    setItalicStyle(!italicStyle)
    if(italicStyle){
        document.documentElement.style.setProperty('--fontFamily', 'italic');}
    else{
        document.documentElement.style.setProperty('--fontFamily', 'initial');}
}
const setUnderline= () =>{
    setUnderlineStyle(!underlineStyle)
    if(underlineStyle){
        document.documentElement.style.setProperty('--UnderL', 'underline');}
    else{
        document.documentElement.style.setProperty('--UnderL', 'none');}
}
const setFontSize = (event) =>{
    if(event.target.value){
        document.documentElement.style.setProperty('--fontSize', `${event.target.value}px`);}
    else{ document.documentElement.style.setProperty('--fontSize', '16px');
    }
 }
const setColor= () =>{
    let value = document.getElementById("color").value
    if(value){
        value = value.includes("#") ? value : `#${value}`
        document.documentElement.style.setProperty('--colorCode', value);}
    else{ document.documentElement.style.setProperty('--colorCode', 'black');
    }
}

const magic = (func, delay) =>{
    return () =>{
        clearTimeout(time)
        time = setTimeout(()=>{
            func()
        },delay)
    }
}

// Implemented Debouncing
const debounceData = magic(setColor,1000)

    return(
        <>
            <div className="options">
                <button onClick={setBold}>Bold</button>
                <button  onClick={setItalic}>Italic</button>
                <button  onClick={setUnderline}>Underline</button>
                <input type="text" placeholder="Font Size (px)"  onKeyUp={setFontSize}/>
                <input id ="color" type="text" placeholder="Color Hex Code"  onKeyUp={debounceData}/>
                <button>List</button>
            </div>
            <textarea id="textarea" className="editor" placeholder="Editor"  onclick="this.focus();this.select()"></textarea>
            <button className="submit" onClick={Submit}>Submit</button>
            </>
    )
}

export default RichText;