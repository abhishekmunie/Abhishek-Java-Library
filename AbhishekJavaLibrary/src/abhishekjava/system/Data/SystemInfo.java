/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abhishekjava.system.Data;

import java.util.Enumeration;

/**
 * Determines the current system properties.
 * <p>
 * The current set of system properties for use by the 
 * {@link #corespondingPropery} is returned as a 
 * <code>String</code> Constant. It get the properties from System.getProperty(String). 
 * This set of system properties always includes values 
 * for the following keys: 
 * <table summary="Shows property keys and associated values">
 * <tr><th>Key</th>
 *     <th>Description of Associated Value</th></tr>
 * <tr><td><code>java.version</code></td>
 *     <td>Java Runtime Environment version</td></tr>
 * <tr><td><code>java.vendor</code></td>
 *     <td>Java Runtime Environment vendor</td></tr
 * <tr><td><code>java.vendor.url</code></td>
 *     <td>Java vendor URL</td></tr>
 * <tr><td><code>java.home</code></td>
 *     <td>Java installation directory</td></tr>
 * <tr><td><code>java.vm.specification.version</code></td>
 *     <td>Java Virtual Machine specification version</td></tr>
 * <tr><td><code>java.vm.specification.vendor</code></td>
 *     <td>Java Virtual Machine specification vendor</td></tr>
 * <tr><td><code>java.vm.specification.name</code></td>
 *     <td>Java Virtual Machine specification name</td></tr>
 * <tr><td><code>java.vm.version</code></td>
 *     <td>Java Virtual Machine implementation version</td></tr>
 * <tr><td><code>java.vm.vendor</code></td>
 *     <td>Java Virtual Machine implementation vendor</td></tr>
 * <tr><td><code>java.vm.name</code></td>
 *     <td>Java Virtual Machine implementation name</td></tr>
 * <tr><td><code>java.specification.version</code></td>
 *     <td>Java Runtime Environment specification  version</td></tr>
 * <tr><td><code>java.specification.vendor</code></td>
 *     <td>Java Runtime Environment specification  vendor</td></tr>
 * <tr><td><code>java.specification.name</code></td>
 *     <td>Java Runtime Environment specification  name</td></tr>
 * <tr><td><code>java.class.version</code></td>
 *     <td>Java class format version number</td></tr>
 * <tr><td><code>java.class.path</code></td>
 *     <td>Java class path</td></tr>
 * <tr><td><code>java.library.path</code></td>
 *     <td>List of paths to search when loading libraries</td></tr>
 * <tr><td><code>java.io.tmpdir</code></td>
 *     <td>Default temp file path</td></tr>
 * <tr><td><code>java.compiler</code></td>
 *     <td>Name of JIT compiler to use</td></tr>
 * <tr><td><code>java.ext.dirs</code></td>
 *     <td>Path of extension directory or directories</td></tr>
 * <tr><td><code>os.name</code></td>
 *     <td>Operating system name</td></tr>
 * <tr><td><code>os.arch</code></td>
 *     <td>Operating system architecture</td></tr>
 * <tr><td><code>os.version</code></td>
 *     <td>Operating system version</td></tr>
 * <tr><td><code>file.separator</code></td>
 *     <td>File separator ("/" on UNIX)</td></tr>
 * <tr><td><code>path.separator</code></td>
 *     <td>Path separator (":" on UNIX)</td></tr>
 * <tr><td><code>line.separator</code></td>
 *     <td>Line separator ("\n" on UNIX)</td></tr>
 * <tr><td><code>user.name</code></td>
 *     <td>User's account name</td></tr>
 * <tr><td><code>user.home</code></td>
 *     <td>User's home directory</td></tr>
 * <tr><td><code>user.dir</code></td>
 *     <td>User's current working directory</td></tr>
 * </table>
 * <p>
 * Multiple paths in a system property value are separated by the path
 * separator character of the platform.
 * <p>
 * Note that even if the security manager does not permit the
 * <code>getProperties</code> operation, it may choose to permit the
 * {@link #getProperty(String)} operation.
 *
 * @return     the system properties
 * @exception  
 *              If there is no current set of system properties, a set of system properties is first created and initialized.
 *              SecurityException  if a security manager exists and its
 *             <code>checkPropertiesAccess</code> method doesn't allow access
 *              to the system properties.
 * @see        java.lang.SecurityException
 * @see        java.lang.SecurityManager#checkPropertiesAccess()
 * @see        java.util.Properties
 *
 * @author Abhishek
 */
public class SystemInfo {

    /*
    java.version                      Java Runtime Environment version
    java.vendor                         Java Runtime Environment vendor
    java.vendor.url                     Java vendor URL
    java.home                           Java installation directory
    java.vm.specification.version       Java Virtual Machine specification version
    java.vm.specification.vendor        Java Virtual Machine specification vendor
    java.vm.specification.name          Java Virtual Machine specification name
    java.vm.version                     Java Virtual Machine implementation version
    java.vm.vendor                      Java Virtual Machine implementation vendor
    java.vm.name                        Java Virtual Machine implementation name
    java.specification.version          Java Runtime Environment specification version
    java.specification.vendor           Java Runtime Environment specification vendor
    java.specification.name             Java Runtime Environment specification name
    java.class.version                  Java class format version number
    java.class.path                     Java class path
    java.library.path                   List of paths to search when loading libraries
    java.io.tmpdir                      Default temp file path
    java.compiler                       Name of JIT compiler to use
    java.ext.dirs                       Path of extension directory or directories
    os.name                             Operating system name
    os.arch                             Operating system architecture
    os.version                          Operating system version
    file.separator                      File separator ("/" on UNIX)
    path.separator                      Path separator (":" on UNIX)
    line.separator                      Line separator ("\n" on UNIX)
    user.name                           User's account name
    user.home                           User's home directory
    user.dir                            User's current working directory
     */
    /**
     * 
     */
    public static final java.util.Properties SystemProperties = System.getProperties();

		public static void main(String[] args){
			 for(Enumeration e = SystemProperties.elements() ; e.hasMoreElements();){
					System.out.println(e.nextElement());
			 }
		}

    /**
     * Java Runtime Environment version
     */
    public static final String JavaVersion = SystemProperties.getProperty("java.version");
    /**
     * Java Runtime Environment vendor
     */
    public static final String JavaVendor = SystemProperties.getProperty("java.vendor");
    /**
     * Java vendor URL
     */
    public static final String JavaVendorUrl = SystemProperties.getProperty("java.vendor.url");
    /**
     * Java installation directory
     */
    public static final String JavaHome = SystemProperties.getProperty("java.home");
    /**
     * Java Virtual Machine specification version
     */
    public static final String JavaVmSpecificationVersion = SystemProperties.getProperty("java.vm.specification.version");
    /**
     * Java Virtual Machine specification vendor
     */
    public static final String JavaVmSpecificationVendor = SystemProperties.getProperty("java.vm.specification.vendor");
    /**
     * Java Virtual Machine specification name
     */
    public static final String JavaVmSpecificationName = SystemProperties.getProperty("java.vm.specification.name");
    /**
     * Java Virtual Machine implementation version
     */
    public static final String JavaVmVersion = SystemProperties.getProperty("java.vm.version");
    /**
     * Java Runtime Environment specification vendor
     */
    public static final String JavaVmVendor = SystemProperties.getProperty("java.vm.vendor");
    /**
     * Java Virtual Machine implementation name
     */
    public static final String JavaVmName = SystemProperties.getProperty("java.vm.name");
    /**
     * Java Runtime Environment specification version
     */
    public static final String JavaSpecificationVersion = SystemProperties.getProperty("java.specification.version");
    /**
     * Java Runtime Environment specification vendor
     */
    public static final String JavaSpecificationVendor = SystemProperties.getProperty("java.specification.vendor");
    /**
     * Java Runtime Environment specification name
     */
    public static final String JavaSpecificationName = SystemProperties.getProperty("java.specification.name");
    /**
     * Java class format version number
     */
    public static final String JavaClassVersion = SystemProperties.getProperty("java.class.version");
    /**
     * Java class path
     */
    public static final String JavaClassPath = SystemProperties.getProperty("java.class.path");
    /**
     * List of paths to search when loading libraries
     */
    public static final String JavaLibraryPath = SystemProperties.getProperty("java.library.path");
    /**
     * Default temp file path
     */
    public static final String JavaIoTmpdir = SystemProperties.getProperty("java.io.tmpdir");
    /**
     * Name of JIT compiler to use
     */
    public static final String JavaCompiler = SystemProperties.getProperty("java.compiler");
    /**
     * Path of extension directory or directories
     */
    public static final String JavaExtDirs = SystemProperties.getProperty("java.ext.dirs");
    /**
     * Operating system name
     */
    public static final String OsName = SystemProperties.getProperty("os.name");
    /**
     * Operating system architecture
     */
    public static final String OsArch = SystemProperties.getProperty("os.arch");
    /**
     * Operating system version
     */
    public static final String OsVersion = SystemProperties.getProperty("os.version");
    /**
     * File separator (“/” on UNIX)
     */
    public static final String FileSeparator = SystemProperties.getProperty("file.separator");
    /**
     * Path separator (“:” on UNIX)
     */
    public static final String PathSeparator = SystemProperties.getProperty("path.separator");
    /**
     * Line separator (“\n” on UNIX)
     */
    public static final String LineSeparator = SystemProperties.getProperty("line.separator");
    /**
     * User's account name
     */
    public static final String UserName = SystemProperties.getProperty("user.name");
    /**
     * User's home directory
     */
    public static final String UserHome = SystemProperties.getProperty("user.home");
    /**
     * User's current working directory
     */
    public static final String UserDir = SystemProperties.getProperty("user.dir");
}