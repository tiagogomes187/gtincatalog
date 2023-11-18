import { Link } from "react-router-dom";
import * as authService from "../../services/auth-service";
import { ContextToken } from "../../utils/context-token";
import { useContext } from "react";
export default function LoggedUser() {
  const { contextTokenPayload, setContextTokenPayload } =
    useContext(ContextToken);

    function hendleLogoutClick(){
        authService.logout();
        setContextTokenPayload(undefined);
    }

  return (

        contextTokenPayload && authService.isAuthenticated() ? (
            <div className="dsc-logged-user">
                <p>{contextTokenPayload.user_name}</p>
                <span onClick={hendleLogoutClick}>Sair</span>
            </div>
        ) : (
            <Link to={"/login"}>Entrar</Link>

    )
  );
}
