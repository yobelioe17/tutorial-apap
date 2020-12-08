import React from "react";

export default function EmptyState(props) {
    return(
        <>
            <h3>My Favorites</h3>
            <div className="d-flex w-100 justify-content-center align-items-center row">
                <h4>Belum ada item yang dipilih</h4>
                <h6>Klik salah satu item di List Movies</h6>
            </div>
        </>
    )
}