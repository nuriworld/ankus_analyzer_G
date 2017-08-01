/**
 * This file is part of ankus.
 *
 * ankus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ankus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with ankus.  If not, see <http://www.gnu.org/licenses/>.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.21 at 10:54:40 오전 KST 
//


package org.ankus.model.collector;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cronExpression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="triggerPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="misfireInstructions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="type" default="MISFIRE_INSTRUCTION_SMART_POLICY">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="MISFIRE_INSTRUCTION_SMART_POLICY"/>
 *                       &lt;enumeration value="MISFIRE_INSTRUCTION_IGNORE_MISFIRE_POLICY"/>
 *                       &lt;enumeration value="MISFIRE_INSTRUCTION_DO_NOTHING"/>
 *                       &lt;enumeration value="MISFIRE_INSTRUCTION_FIRE_NOW"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.openankus.org/schema/collector}start" minOccurs="0"/>
 *         &lt;element ref="{http://www.openankus.org/schema/collector}end" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cronExpression",
    "timezone",
    "triggerPriority",
    "misfireInstructions",
    "start",
    "end"
})
@XmlRootElement(name = "schedule")
public class Schedule implements Serializable {

    @XmlElement(required = true)
    protected String cronExpression;
    protected String timezone;
    @XmlElement(defaultValue = "5")
    protected Integer triggerPriority;
    protected Schedule.MisfireInstructions misfireInstructions;
    protected Start start;
    protected End end;

    /**
     * Gets the value of the cronExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * Sets the value of the cronExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCronExpression(String value) {
        this.cronExpression = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

    /**
     * Gets the value of the triggerPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTriggerPriority() {
        return triggerPriority;
    }

    /**
     * Sets the value of the triggerPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTriggerPriority(Integer value) {
        this.triggerPriority = value;
    }

    /**
     * Gets the value of the misfireInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule.MisfireInstructions }
     *     
     */
    public Schedule.MisfireInstructions getMisfireInstructions() {
        return misfireInstructions;
    }

    /**
     * Sets the value of the misfireInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule.MisfireInstructions }
     *     
     */
    public void setMisfireInstructions(Schedule.MisfireInstructions value) {
        this.misfireInstructions = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link Start }
     *     
     */
    public Start getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Start }
     *     
     */
    public void setStart(Start value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link End }
     *     
     */
    public End getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link End }
     *     
     */
    public void setEnd(End value) {
        this.end = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="type" default="MISFIRE_INSTRUCTION_SMART_POLICY">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="MISFIRE_INSTRUCTION_SMART_POLICY"/>
     *             &lt;enumeration value="MISFIRE_INSTRUCTION_IGNORE_MISFIRE_POLICY"/>
     *             &lt;enumeration value="MISFIRE_INSTRUCTION_DO_NOTHING"/>
     *             &lt;enumeration value="MISFIRE_INSTRUCTION_FIRE_NOW"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MisfireInstructions implements Serializable {

        @XmlAttribute(name = "type")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String type;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            if (type == null) {
                return "MISFIRE_INSTRUCTION_SMART_POLICY";
            } else {
                return type;
            }
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}