# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the python bindings PyKDL for the Kinematics and Dynamics "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cmake orocos-kdl python-sip"
SRC_URI = "https://github.com/smits/orocos-kdl-release/archive/release/kinetic/python_orocos_kdl/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1732e7da948759113eda0ad5a36b1d76"
SRC_URI[sha256sum] = "a243fca87aad9a138c4356d5c850dc1ea078e8ef77c15bcb395fe373d28c859d"
S = "${WORKDIR}/orocos-kdl-release-release-kinetic-python_orocos_kdl-1.3.1-0"

inherit catkin
