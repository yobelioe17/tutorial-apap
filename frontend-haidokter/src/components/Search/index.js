import React from "react";
import classes from "./styles.module.css";

const Search=(props) =>{
    const {onChange, value} = props;
    return(
        <form>
            <input
                className={classes.textField}
                type="text"
                placeholder="Search"
                name="searchWord"
                value={value}
                onChange={onChange}
            />
        </form>
    );
};

export default Search;