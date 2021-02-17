<%@ Page Language="C#" AutoEventWireup="true"  CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body id="mycolor" runat="server">
    <form id="form1" runat="server">
    <div style="height: 326px">
    
        <asp:DropDownList ID="color" runat="server" AutoPostBack="True" 
            onselectedindexchanged="color_SelectedIndexChanged">
            <asp:ListItem Value="#E74C3C">1</asp:ListItem>
            <asp:ListItem Value="#E74C3C">2</asp:ListItem>
            <asp:ListItem Value="#9B59B6">3</asp:ListItem>
            <asp:ListItem Value="#3498DB ">4</asp:ListItem>
            <asp:ListItem></asp:ListItem>
            <asp:ListItem></asp:ListItem>
            <asp:ListItem></asp:ListItem>
            <asp:ListItem></asp:ListItem>
            <asp:ListItem></asp:ListItem>
            <asp:ListItem></asp:ListItem>
            <asp:ListItem></asp:ListItem>
            <asp:ListItem></asp:ListItem>
            <asp:ListItem></asp:ListItem>
            <asp:ListItem></asp:ListItem>
            <asp:ListItem></asp:ListItem>
            <asp:ListItem></asp:ListItem>
            <asp:ListItem></asp:ListItem>
            <asp:ListItem></asp:ListItem>
            <asp:ListItem></asp:ListItem>
            <asp:ListItem></asp:ListItem>
        </asp:DropDownList>
        <br />
        <br />
        <br />
        <br />
        <asp:DropDownList ID="nickname" runat="server" AutoPostBack="True" 
            onselectedindexchanged="DropDownList1_SelectedIndexChanged">
            <asp:ListItem Value="Chutki">Arjun</asp:ListItem>
            <asp:ListItem Value="Sundar">Meet</asp:ListItem>
            <asp:ListItem Value="Dedication">Nikhar</asp:ListItem>
            <asp:ListItem Value="Ghuis">Jayesh</asp:ListItem>
            <asp:ListItem Value="sodho">Jayveer</asp:ListItem>
            <asp:ListItem Value="Gabhlo">Devesh</asp:ListItem>
        </asp:DropDownList>
        <br />
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" onclick="Button1_Click" Text="Button" />
        <br />
        <br />
        <asp:Label ID="Label1" runat="server"></asp:Label>
        <br />
        <br />
        <asp:Label ID="Label2" runat="server"></asp:Label>
        <br />
        <br />
        <asp:Label ID="Label3" runat="server"></asp:Label>
&nbsp;</div>
    </form>
</body>
</html>
