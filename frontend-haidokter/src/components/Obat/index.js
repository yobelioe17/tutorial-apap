import React from "react";
import classes from "./styles.module.css";

const Obat = (props) => {
    const { id, nama, bentuk, kuantitas } = props;
        return (
            <div className={classes.obat}>
                <b>{`${nama}`} ({`${kuantitas}`})</b>
            </div>
        );
    };

export default Obat;