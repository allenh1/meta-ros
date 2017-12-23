# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Basic test nodes for Pyros dynamic ROS interface"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime roslint rospy std-msgs"
SRC_URI = "https://github.com/asmodehn/${PN}-release/archive/release/kinetic/pyros_test/0.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5d4960e493ef5488d8d049aeef21e522"
SRC_URI[sha256sum] = "444457ae977f51ce614ae2070ad538db95cdcf165c0745a7e2bdcf26d8e84c76"
S = "${WORKDIR}/${PN}-release-release-kinetic-pyros_test-0.0.6-0"

inherit catkin
