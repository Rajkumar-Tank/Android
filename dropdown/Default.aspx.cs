using System;
using System.Collections.Generic;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class _Default : System.Web.UI.Page 
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
 
    protected void color_SelectedIndexChanged(object sender, EventArgs e)
    {

        //mycolor.Attributes.Add("style","background-color:red");
        string c = color.SelectedItem.Value.ToString();

        mycolor.Attributes.Add("style", "background-color:" + color.SelectedItem.Value.ToString());
    }
    protected void DropDownList1_SelectedIndexChanged(object sender, EventArgs e)
    {
        Label1.Text = nickname.SelectedIndex.ToString();
        Label2.Text = nickname.SelectedItem.ToString();
        Label3.Text = nickname.SelectedItem.Value.ToString();
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
       // Label1.Text = nickname.SelectedIndex.ToString();
       // Label2.Text = nickname.SelectedItem.ToString();
       // Label3.Text = nickname.SelectedItem.Value.ToString();

    }
}