# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the python bindings PyKDL for the Kinematics and Dynamics "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native catkin cmake orocos-kdl python-sip"
SRC_URI = "https://github.com/smits/orocos-kdl-release/archive/release/lunar/python_orocos_kdl/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ec4a4a40cf96ca83ae8534d99bdf14b1"
SRC_URI[sha256sum] = "f0fe342a7974c934bfb70e29f4a2a6d1e310ee81611734892533afa240b18422"
S = "${WORKDIR}/orocos-kdl-release-release-lunar-python_orocos_kdl-1.3.1-0"

inherit catkin
